package scrap.heap.model;

import java.util.ArrayList;
import java.util.Collection;

public class Order {

    final ArrayList<Item> items = new ArrayList<>();

    public Order() {
    }

    public Order addItems(Collection<Item> items) {
        this.items.addAll(items);
        return this;
    }

    public void order() {
        for (Item item : items) item.order();
    }

    public static class Item {
        private Orderable orderable;
        private int quantity = 1;

        public Item() {
        }

        public Item product(Orderable orderable) {
            this.orderable = orderable;
            return this;
        }

        public Item quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public void order() {
            this.orderable.order();
            System.out.println("Ordered " + this.orderable + "; Quantity: " + quantity);
        }
    }

}
