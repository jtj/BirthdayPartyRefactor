package scrap.heap.refactor;

//Receives and order and places it
public class OrderTaker{
	
	public void receiveOrder(Order order)
	{
		//for each item in order, call correct method
		order.Items.forEach(item -> processOrderItem(item));
		
	}
	private void processOrderItem(OrderItem item)
	{
		Product product = item.getProduct();
		String productType = product.getProductType();
		int count = item.getCount();
		switch (productType)
		{
		     case "Balloon":
		    	 orderBalloons((Balloon)product, count);
		    	 break;
		     case "Cake":
		    	 orderCake((Cake)product);
		    	 break;
		}
		
	}
    private void orderBalloons(Balloon balloon, int count){

        //for the purposes of this exercise, pretend this method works and adds balloons to the order
        System.out.println("Balloons ordered; " + balloon.color + ", " + balloon.material  + ", " + count);

    }

    private void orderCake(Cake cake){

        //for the purposes of this exercise, pretend that this method adds a cake to the order
        System.out.println("cake ordered; " + cake.cakeFlavor + ", " + cake.frostingFlavor  + ", " + cake.shape + ", " + cake.size + ", " + cake.cakeColor);

    }
}