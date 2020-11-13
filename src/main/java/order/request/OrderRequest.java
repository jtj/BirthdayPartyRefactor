package scrap.heap.refactor.order.request;

import scrap.heap.refactor.order.OrderStatus;

public interface OrderRequest {
	
	public String getSummary();
	
	public void setStatus(OrderStatus status);

}
