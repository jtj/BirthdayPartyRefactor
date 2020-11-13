package scrap.heap.refactor.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import scrap.heap.refactor.order.request.BalloonsOrderRequest;
import scrap.heap.refactor.order.request.CakeOrderRequest;
import scrap.heap.refactor.order.request.exception.InvalidBalloonQuantityException;
import scrap.heap.refactor.order.service.OrderService;

public class AppTest {
    @Test 
    public void testAppHasAGreeting() {
    	OrderService orderService = new OrderService();
        App birthDayApp = new App(orderService);
        assertNotNull("app should have a greeting", birthDayApp.getGreeting());
    }
    
    @Test 
    public void testAppCanPlaceBalloonOrder() throws InvalidBalloonQuantityException {
    	OrderService orderService = new OrderService();
        App birthDayApp = new App(orderService);
        
        String summary = birthDayApp.order(new BalloonsOrderRequest("4", "red", "mylar"));
		
        assertEquals("Balloons ordered; red, mylar, 4", summary);
    }
    
    @Test 
    public void testAppCanPlaceCakeOrder(){
    	OrderService orderService = new OrderService();
        App birthDayApp = new App(orderService);
        
        String summary = birthDayApp.order(new CakeOrderRequest("chocolate", "chocolate", "circle", "large", "brown"));
	
        assertEquals("cake ordered; chocolate, chocolate, circle, large, brown", summary);
    }
    
    @Test (expected = InvalidBalloonQuantityException.class)
    public void testAppCanNotPlaceBalloonOrderDueInvalidQuantityZero() throws InvalidBalloonQuantityException {
    	OrderService orderService = new OrderService();
        App birthDayApp = new App(orderService);
        birthDayApp.order(new BalloonsOrderRequest("0", "red", "mylar"));
    }
    
    @Test (expected = InvalidBalloonQuantityException.class)
    public void testAppCanNotPlaceBalloonOrderDueInvalidQuantityTextual() throws InvalidBalloonQuantityException {
    	OrderService orderService = new OrderService();
        App birthDayApp = new App(orderService);
        birthDayApp.order(new BalloonsOrderRequest("ABCD", "red", "mylar"));
    }
    
    @Test (expected = InvalidBalloonQuantityException.class)
    public void testAppCanNotPlaceBalloonOrderDueInvalidQuantityNegative() throws InvalidBalloonQuantityException {
    	OrderService orderService = new OrderService();
        App birthDayApp = new App(orderService);
        birthDayApp.order(new BalloonsOrderRequest("-234", "red", "mylar"));
    }
    
    
}