import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        createPizza();
    }
    public void createPizza(){
        Pizza pizza = new Pizza();
        int x = Greenfoot.getRandomNumber(600);
        addObject(pizza, x, 0);
    }
}
