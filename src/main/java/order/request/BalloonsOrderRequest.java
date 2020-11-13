package scrap.heap.refactor.order.request;

import scrap.heap.refactor.order.OrderStatus;
import scrap.heap.refactor.order.request.exception.InvalidBalloonQuantityException;

public class BalloonsOrderRequest implements OrderRequest {

	private final String balloonColor;
	private final String material;
	private int number;

	private OrderStatus status;

	public BalloonsOrderRequest(String quantity, String balloonColor, String material)
			throws InvalidBalloonQuantityException {
		try {
			int number = Integer.parseInt(quantity);
			if (number > 0) {
				this.number = number;
				this.balloonColor = balloonColor;
				this.material = material;
				this.status = OrderStatus.requested;
			} else {
				throw new InvalidBalloonQuantityException("invalid balloon quantity= '" + quantity + "'");
			}
		} catch (NumberFormatException exception) {
			throw new InvalidBalloonQuantityException("invalid balloon quantity= '" + quantity + "'");
		}
	}

	public String getSummary() {
		return "Balloons " + status.toString() + "; " + balloonColor + ", " + material + ", " + number;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

}
