package scrap.heap.refactor.service;

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
    //CHECKSTYLE:OFF
    public void order(BalloonOrder balloonOrder, CakeOrder cakeOrder) {
        System.out.println(cakeService.order(cakeOrder));
        System.out.println(balloonService.order(balloonOrder));
    }
    //CHECKSTYLE:ON
}
