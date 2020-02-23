package scrap.heap.refactor.domain;

/**
 * Balloon order details.
 */
public class BalloonOrder {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private String color;
    private String material;
    private int number;

    public BalloonOrder(String color, String material, int number) {
        this.color = color;
        this.material = material;
        this.number = number;
    }

    public String toString() {
        return "Balloons ordered; " + color + ", " + material + ", " + number;
    }
}
