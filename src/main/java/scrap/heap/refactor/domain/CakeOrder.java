package scrap.heap.refactor.domain;

/**
 * Cake Order details.
 */
public class CakeOrder {
    private String flavor;
    private String frostingFlavor;
    private String shape;
    private String size;
    private String color;

    public CakeOrder(String flavor, String frostingFlavor, String shape,
                     String size, String color) {
        this.flavor = flavor;
        this.frostingFlavor = frostingFlavor;
        this.shape = shape;
        this.size = size;
        this.color = color;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getFrostingFlavor() {
        return frostingFlavor;
    }

    public void setFrostingFlavor(String frostingFlavor) {
        this.frostingFlavor = frostingFlavor;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "cake ordered; " + flavor + ", " + frostingFlavor + ", " +
                shape + ", " + size + ", " + color;
    }
}
