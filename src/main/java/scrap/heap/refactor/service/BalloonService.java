package scrap.heap.refactor.service;

import scrap.heap.refactor.domain.BalloonOrder;

/**
 * BalloonService - Service for processing Balloon orders.
 */
public class BalloonService {
    public String order(BalloonOrder balloonOrder) {
        return balloonOrder.toString();
    }
}
