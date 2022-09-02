package forest;

public abstract class ForestObject {

    private static int total_ids = 1;

    protected int id;
    protected String name;
    protected float mass;

    public ForestObject(String name, float mass) {
        this.name = name;
        this.mass = mass;
        this.id = total_ids++;
    }
}
