package scrap.heap.refactor;

import scrap.heap.refactor.domain.BalloonOrder;
import scrap.heap.refactor.domain.CakeOrder;
import scrap.heap.refactor.service.PartyService;

/**
 * Birthday Party application.
 */
public class App {
    static PartyService partyService;

    public static void main(String[] args) {
        partyService = new PartyService();

        //Place birthday party orders
        CakeOrder cakeOrder = new CakeOrder("chocolate", "chocolate", "circle", "large", "brown");
        BalloonOrder balloonOrder = new BalloonOrder("red", "mylar", 4);
        partyService.order(balloonOrder, cakeOrder);

        cakeOrder = new CakeOrder("Vanilla", "chocelate", "square", "med", "brown");
        balloonOrder = new BalloonOrder("blue", "latex", 7);
        partyService.order(balloonOrder, cakeOrder);

        cakeOrder = new CakeOrder("vanilla", "vanilla", "square", "small", "yellow");
        balloonOrder = new BalloonOrder("yellow", "mylar", 4);
        partyService.order(balloonOrder, cakeOrder);
    }
}
