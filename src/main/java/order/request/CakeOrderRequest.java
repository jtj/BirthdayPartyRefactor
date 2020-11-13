package scrap.heap.refactor.order.request;

import scrap.heap.refactor.order.OrderStatus;

public class CakeOrderRequest implements OrderRequest {

	private final String flavor;
	private final String frostingFlavor;
	private final String shape;
	private final String size;
	private final String cakeColor;
	
	private OrderStatus status;
	
	public CakeOrderRequest(String flavor, String frostingFlavor, String shape, String size, String cakeColor) {
		this.flavor = flavor;
		this.frostingFlavor = frostingFlavor;
		this.shape = shape;
		this.size = size;
		this.cakeColor = cakeColor;
		this.status= OrderStatus.requested;
	}

	public String getSummary() {
		return "cake " + status.toString() + "; " + flavor + ", " + frostingFlavor  + ", " + shape + ", " + size + ", " + cakeColor;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
}
