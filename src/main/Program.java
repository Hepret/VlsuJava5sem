package main;

import forest.animal.Herbivore;
import forest.animal.Predator;
import forest.plants.Grass;

public class Program {
    public static void main(String[] args) throws Exception {
        var food = new Grass("кора", 150);
        var hare = new Herbivore("заяц Толя", 2300);
        var ship = new Herbivore("овечка Долли", 7000);
        var wolf = new Predator("волк Волкович", 8000);


        hare.eat(food);

        wolf.eat(ship);

        wolf.eat(hare);

        wolf.die();

    }
}
