package scrap.heap.refactor.service;

import scrap.heap.refactor.domain.BalloonOrder;

import static org.junit.Assert.assertNotNull;

/**
 * unit test for BalloonService.
 */
public class BalloonServiceTest {
    public void testOrder() {
        BalloonService classUnderTest = new BalloonService();
        BalloonOrder balloonOrder = new BalloonOrder("red", "mylar", 4);
        assertNotNull(classUnderTest.order(balloonOrder));
    }
}
