package forest.animal;

import forest.Food;
import forest.plants.Grass;

public class Herbivore extends Animal implements Food{
    public Herbivore(String name, double mass) {
        super(name, mass);
    }

    @Override
    public void Eat(Food food) throws Exception {
        if (!isAlive) throw new Exception("Невозможно: " + name + " - МЕРТВО");
        if (!(food instanceof Grass)) throw new Exception(name + " - травоядный");

        var grassToEat = (Grass) food;


        Eating(grassToEat);

    }

    private void Eating(Grass grassToEat) {
        if (grassToEat.getMass() == 0) {
            System.out.println("Нечего есть");
            return;
        }


        var portion = Math.random() * grassToEat.getMass();
        setMass(mass + portion);

        System.out.println(name + " сьел: " + portion + " " + grassToEat.getName());

        var newGrassMass = grassToEat.getMass() - portion;
        grassToEat.setMass(newGrassMass);
    }
}
