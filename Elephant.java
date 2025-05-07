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
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            move(-2);
        }
        else if(Greenfoot.isKeyDown("right")){
            move(2);
        }
        eatPizza();
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
