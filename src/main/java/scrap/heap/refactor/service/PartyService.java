package scrap.heap.refactor.service;

import org.apache.commons.lang3.RandomStringUtils;
import scrap.heap.refactor.domain.BalloonOrder;
import scrap.heap.refactor.domain.CakeOrder;

/**
 * PartyService - Manages orders for the party.
 */
public class PartyService {
    private CakeService cakeService;

    public CakeService getCakeService() {
        return cakeService;
    }

    public void setCakeService(CakeService cakeService) {
        this.cakeService = cakeService;
    }

    public BalloonService getBalloonService() {
        return balloonService;
    }

    public void setBalloonService(BalloonService balloonService) {
        this.balloonService = balloonService;
    }

    private BalloonService balloonService;

    public PartyService() {
        cakeService = new CakeService();
        balloonService = new BalloonService();
    }

    public String order(BalloonOrder balloonOrder, CakeOrder cakeOrder) throws Exception {
        cakeService.order(cakeOrder);
        balloonService.order(balloonOrder);
        String orderConfirmationId = RandomStringUtils.random(12, true, true);
        return orderConfirmationId;
    }
}
