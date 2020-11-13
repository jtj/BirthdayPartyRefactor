package scrap.heap.refactor.app;

import scrap.heap.refactor.order.request.OrderRequest;
import scrap.heap.refactor.order.service.OrderService;

public class App {

	private final OrderService orderService;

	public App(OrderService orderService) {
		this.orderService = orderService;
	}

	public String order(OrderRequest orderRequest) {
		this.orderService.placeOrder(orderRequest);
		return orderRequest.getSummary();
	}
	
	public String getGreeting() {
		return "Hello world.";
	}
}
