import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main character
 * 
 * @author Keith McClelland
 * @version April 2025
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] idle = new GreenfootImage[8];
    
    public Elephant(){
        for(int i = 0; i <idle.length; i++){
            idle[i] = new GreenfootImage("C:/Users/khew2/Pictures/elephant_idle/idle" + i + ".png");
        }
        setImage(idle[0]);
    }
    
    int imageIndex = 0;
    public void animateElephant(){
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            move(-2);
        }
        else if(Greenfoot.isKeyDown("right")){
            move(2);
        }
        eatPizza();
        animateElephant();
    }
    public void eatPizza(){
        if(isTouching(Pizza.class)){
            removeTouching(Pizza.class);
            MyWorld world = (MyWorld) getWorld();
            world.createPizza();
            world.increaseScore();
            elephantSound.play();
        }
        
    }
}
