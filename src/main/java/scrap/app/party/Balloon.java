package scrap.app.party;

public class Balloon {
    private final Color color;
    private final Material material;
    private final int count;
    
    // TODO: The count should be out of the balloon and be part of the Party so that a single Party can
    // have, say, 3 red mylar balloons and 2 blue latex balloons. However, the spec is a bit unclear about
    // whether this flexibility is considered downside.
    private Balloon(Color color, Material material, int count) {
        this.color = color;
        this.material = material;
        this.count = count;
    }
    
    public static class Builder {
        public Color getColor() {
            return color;
        }
        public Builder setColor(Color color) {
            this.color = color;
            return this;
        }
        public Material getMaterial() {
            return material;
        }
        public Builder setMaterial(Material material) {
            this.material = material;
            return this;
        }
        public int getCount() {
            return count;
        }
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }
        
        public Balloon build() {
            return new Balloon(color, material, count);
        }
        private Color color = Color.RED;
        private Material material = Material.LATEX;
        private int count = 5;
    }

    public static enum Color {
        RED, BLUE, YELLOW;
        
        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
    
    public static enum Material {
        MYLAR, LATEX;
        
        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    public String getDescription() {
       return  "Balloons ordered: " + color + ", " + material  + ", " + count + ".";
    }
    
    // TODO: Add methods like price?
}
