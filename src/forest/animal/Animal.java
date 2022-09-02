package forest.animal;

import forest.Food;
import forest.ForestObject;

public abstract class Animal extends ForestObject {

    protected boolean isAlive;

    public Animal(String name, double mass) {
        super(name, mass);
        isAlive = true;
    }

    public void die() {
        System.out.println("Животное: " + name + " - МЕРТВО");
        isAlive = false;
    }
    public abstract void eat(Food food) throws Exception;



}
