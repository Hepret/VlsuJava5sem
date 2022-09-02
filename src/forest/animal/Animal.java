package forest.animal;

import forest.ForestObject;

public abstract class Animal extends ForestObject {

    protected boolean isAlive;

    public Animal(String name, float mass) {
        super(name, mass);
        isAlive = true;
    }

    public void Die() {
        System.out.println("Животное: " + name + " - МЕРТВО");
    }
    public abstract void Eat();



}
