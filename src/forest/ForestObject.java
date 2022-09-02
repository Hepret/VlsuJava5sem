package forest;

public abstract class ForestObject {

    private static int total_ids = 1;

    protected int id;
    protected String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setMass(double mass) {
        if (mass < 0) throw new IllegalArgumentException("Масса должна быть положительной");
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }

    protected double mass;

    public ForestObject(String name, double mass) {
        this.name = name;
        this.mass = mass;
        this.id = total_ids++;
    }
}
