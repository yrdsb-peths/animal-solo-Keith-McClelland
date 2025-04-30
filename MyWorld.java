import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        Pizza pizza = new Pizza();
        addObject(pizza, 300, 0);
    }
}
