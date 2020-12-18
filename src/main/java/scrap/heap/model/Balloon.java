package scrap.heap.model;

public class Balloon implements Orderable {

    private String color;
    private String material;

    public Balloon() {
    }

    public Balloon color(String color) {
        this.color = color;
        return this;
    }

    public Balloon material(String material) {
        this.material = material;
        return this;
    }

    public void order() {
    }

    @Override
    public String toString() {
        return "Balloon: <" + color + ", " + material + ">";
    }

}
