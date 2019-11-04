package scrap.app.party;

public class Cake  {
    private final Flavor flavor;
    private final Flavor frostingFlavor;
    private final Shape shape;
    private final Size size;
    private final Color color;
    
    // TODO: Does it make sense to have make it easy to have  than one cake for party?
    private Cake(Flavor flavor, Flavor frostingFlavor, Shape shape, Size size, Color color) {
        this.flavor = flavor;
        this.frostingFlavor = frostingFlavor;
        this.shape = shape;
        this.size = size;
        this.color = color;
    }
    
    public String getDescription() {
        return "Cake ordered: " + flavor + ", " + frostingFlavor  + ", " + shape + ", " + size + ", " + color + ".";
    }
    
    public static enum Color {
        BROWN, YELLOW
    }
    
    public static enum Shape {
        CIRCLE, SQUARE
    }
    
    public static enum Flavor {
        CHOLCOLATE, VANILLA
    }
    
    public static enum Size {
        SMALL, MEDIUM, LARGE
    }
    
    public static class Builder {
        public Flavor getFlavor() {
            return flavor;
        }
        public Builder setFlavor(Flavor flavor) {
            this.flavor = flavor;
            return this;
        }
        public Flavor getFrostingFlavor() {
            return frostingFlavor;
        }
        public Builder setFrosting(Flavor frostingFlavor) {
            this.frostingFlavor = frostingFlavor;
            return this;
        }
        public Shape getShape() {
            return shape;
        }
        public Builder setShape(Shape shape) {
            this.shape = shape;
            return this;
        }
        public Size getSize() {
            return size;
        }
        public Builder setSize(Size size) {
            this.size = size;
            return this;
        }
        public Color getColor() {
            return color;
        }
        public Builder setColor(Color color) {
            this.color = color;
            return this;
        }
        private Flavor flavor = Flavor.CHOLCOLATE;
        private Flavor frostingFlavor = Flavor.VANILLA;
        private Shape shape = Shape.CIRCLE;
        private Size size = Size.LARGE;
        private Color color = Color.YELLOW;
        
        public Cake build() {
            return new Cake(flavor, frostingFlavor, shape, size, color);
        }   
    }
    
    // TODO: Add behavioral methods like time to bake, price etc
}
