package scrap.heap.refactor.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import scrap.heap.refactor.domain.BalloonOrder;
import scrap.heap.refactor.domain.CakeOrder;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

/**
 * Unit test for PartyService, uses mockito to mock dependent services.
 */
public class PartyServiceTest {
    @Mock
    public CakeService cakeService;
    @Mock
    public BalloonService balloonService;
    @InjectMocks
    public PartyService partyService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        partyService = new PartyService();
        partyService.setBalloonService(balloonService);
        partyService.setCakeService(cakeService);
    }

    @Test
    public void testOrder() throws Exception {
        BalloonOrder balloonOrder = new BalloonOrder("red", "mylar", 4);
        CakeOrder cakeOrder = new CakeOrder("red velvet", "cream cheese", "round", "10", "white");
        when(cakeService.order(cakeOrder)).thenReturn("Cake Order");
        when(balloonService.order(balloonOrder)).thenReturn("balloon order");
        assertNotNull(partyService.order(balloonOrder, cakeOrder));
    }
}
