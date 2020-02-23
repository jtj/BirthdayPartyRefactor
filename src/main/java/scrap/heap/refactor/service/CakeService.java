package scrap.heap.refactor.service;

import scrap.heap.refactor.domain.CakeOrder;

/**
 * CakeService - Service for processing Cake Orders.
 */
public class CakeService {
    public String order(CakeOrder cakeOrder) {
        return cakeOrder.toString();
    }
}
