import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    public Label scoreLabel;
    public MyWorld() {
        //Create the new world
        super(600, 400, 1);
        
        // Create the elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        //Create a label
        scoreLabel = new Label(0, 40);
        addObject(scoreLabel, 20, 20);
        
        createPizza();
    }
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
    }
    public void createPizza(){
        // Create a pizza at a random x quordinate
        Pizza pizza = new Pizza();
        int x = Greenfoot.getRandomNumber(600);
        addObject(pizza, x, 0);
    }
}
