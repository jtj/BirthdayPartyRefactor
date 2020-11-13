package scrap.heap.refactor.order.service;

import scrap.heap.refactor.order.OrderStatus;
import scrap.heap.refactor.order.request.OrderRequest;

public class OrderService {

	public void placeOrder(OrderRequest orderRequest) {
		orderRequest.setStatus(OrderStatus.ordered);
	}
	
	public void cancelOrder(OrderRequest orderRequest) {
		orderRequest.setStatus(OrderStatus.cancelled);
	}
	
	public void fulfilOrder(OrderRequest orderRequest) {
		orderRequest.setStatus(OrderStatus.fulfilled);
	}
}
