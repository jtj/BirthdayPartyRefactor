package scrap.heap.refactor.main;

import scrap.heap.refactor.app.App;
import scrap.heap.refactor.order.request.BalloonsOrderRequest;
import scrap.heap.refactor.order.request.CakeOrderRequest;
import scrap.heap.refactor.order.service.OrderService;

public class AppRunner {

	public static void main(String[] args) {
		OrderService partyOrderService = new OrderService();
		App app = new App(partyOrderService);

		// Place birthday party orders
		order(app,"red", "mylar", "4", "chocolate", "chocolate", "circle", "large", "brown");
		order(app,"blue", "latex", "7", "Vanilla", "chocelate", "square", "med", "brown");
		order(app,"yellow", "mylar", "4", "vanilla", "vanilla", "square", "small", "yellow");

	}

	private static void order(App app, String balloonColor, String material, String number, String flavor, String frostingFlavor,
			String shape, String size, String cakeColor) {
		try {
			System.out.println(orderBalloons(app,balloonColor, material, number));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(orderCake(app,flavor, frostingFlavor, shape, size, cakeColor));
	}

	private static String orderCake(App app, String flavor, String frostingFlavor, String shape, String size, String cakeColor) {
		return app.order(new CakeOrderRequest(frostingFlavor, flavor, shape, size, cakeColor));
	}

	private static String orderBalloons(App app, String balloonColor, String material, String number) throws Exception {
		return app.order(new BalloonsOrderRequest(number, balloonColor, material));
	}
}
