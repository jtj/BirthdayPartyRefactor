package scrap.heap.model;

public class Cake implements Orderable {
    private String frosting;
    private String flavor;
    private String shape;
    private String size;
    private String color;

    public Cake() {
    }

    public Cake frosting(String frosting) {
        this.frosting = frosting;
        return this;
    }

    public Cake flavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    public Cake shape(String shape) {
        this.shape = shape;
        return this;
    }

    public Cake size(String size) {
        this.size = size;
        return this;
    }

    public Cake color(String color) {
        this.color = color;
        return this;
    }

    public void order() {
    }

    @Override
    public String toString() {
        return "Cake: <" + flavor + ", " + frosting + ", " + shape + ", " + size + ", " + color + ">";
    }

}
