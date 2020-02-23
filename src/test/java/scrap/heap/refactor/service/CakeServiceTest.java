package scrap.heap.refactor.service;

import scrap.heap.refactor.domain.CakeOrder;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test for CakeService.
 */

public class CakeServiceTest {
    public void testOrder() {
        CakeService classUnderTest = new CakeService();
        CakeOrder cakeOrder = new CakeOrder("red velvet", "cream cheese", "round", "10", "white");
        assertNotNull(classUnderTest.order(cakeOrder));
    }
}
