package scrap.heap.refactor.service;

import org.junit.Test;
import scrap.heap.refactor.domain.BalloonOrder;

import static org.junit.Assert.assertNotNull;

/**
 * unit test for BalloonService.
 */
public class BalloonServiceTest {
    @Test
    public void testOrder() {
        BalloonService classUnderTest = new BalloonService();
        BalloonOrder balloonOrder = new BalloonOrder("red", "mylar", 4);
        assertNotNull(classUnderTest.order(balloonOrder));
    }
}
