package scrap.heap.refactor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import scrap.heap.refactor.domain.BalloonOrder;
import scrap.heap.refactor.domain.CakeOrder;
import scrap.heap.refactor.service.PartyService;

/**
 * Birthday Party application.
 */
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        PartyService partyService = new PartyService();

        //Place birthday party orders
        CakeOrder cakeOrder = new CakeOrder("chocolate", "chocolate", "circle", "large", "brown");
        BalloonOrder balloonOrder = new BalloonOrder("red", "mylar", 4);
        try {
            String confirmationId = partyService.order(balloonOrder, cakeOrder);
            logger.info("Confirmation Id:" + confirmationId);
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }

        cakeOrder = new CakeOrder("Vanilla", "chocolate", "square", "med", "brown");
        balloonOrder = new BalloonOrder("blue", "latex", 7);
        try {
            String confirmationId = partyService.order(balloonOrder, cakeOrder);
            logger.info("Confirmation Id:" + confirmationId);
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }

        cakeOrder = new CakeOrder("vanilla", "vanilla", "square", "small", "yellow");
        balloonOrder = new BalloonOrder("yellow", "mylar", 4);
        try {
            String confirmationId = partyService.order(balloonOrder, cakeOrder);
            logger.info("Confirmation Id:" + confirmationId);
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
    }
}
