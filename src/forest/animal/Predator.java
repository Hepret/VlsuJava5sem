package forest.animal;

import forest.Food;

public class Predator extends Animal {
    public Predator(String name, double mass) {
        super(name, mass);
    }

    @Override
    public void eat(Food food) throws Exception {

        if (!isAlive) throw new Exception("Невозможно: " + name + " - МЕРТВО");
        if (!(food instanceof Herbivore herbivore)) throw new Exception(name + " - хищник");

        if (!herbivore.isAlive) throw new Exception(name + " не падальщик");

        eating(herbivore);
    }

    private void eating(Herbivore herbivore) {

        var isHuntingSuccess =  hunting(herbivore);

        if (!isHuntingSuccess) return;

        if (herbivore.getMass() == 0) {
            System.out.println("Нечего есть");
            return;
        }

        var portion = Math.random() * herbivore.getMass();
        setMass(mass + portion);

        var newHerbivoreMass = herbivore.getMass() - portion;
        herbivore.setMass(newHerbivoreMass);

        herbivore.die();

        System.out.println(name + " сьел: " + portion + " грамма " + herbivore.getName());
    }

    private boolean hunting(Herbivore herbivore)
    {
        var isHuntingSuccess = Math.random() >= 0.5;
        if (isHuntingSuccess) System.out.println(name + " поймал жертву");
        else System.out.println(name + " не поймал жертву");
        return isHuntingSuccess;
    }
}
