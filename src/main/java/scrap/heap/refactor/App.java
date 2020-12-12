package scrap.heap.refactor;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }
    private static OrderTaker orderTaker = new OrderTaker();

    public static void main(String[] args) {
    	 //
    	
    	 
         //Place birthday party orders
         order("red", "mylar", "4", "chocolate", "chocolate", "circle", "large", "brown" );
         order("blue", "latex", "7", "Vanilla", "chocelate", "square", "med", "brown" );
         order("yellow", "mylar", "4", "vanilla", "vanilla", "square", "small", "yellow" );
         
         
    }

    private static void order(String balloonColor, String material, String number, String flavor, String frostingFlavor, String shape, String size, String cakeColor){

        //refactoring starts here:
        //intent is to provide some info for an order for a birthday party consisting of a number of balloons with color and material
        //   and a cake with some specifications
        //The app's main body and order method's signature will remain

        //apprach : create balloon, cake, place into order send to order taker 
    	
    	Order order = new Order();
    	
    	Balloon balloon = new Balloon();
    	balloon.color = balloonColor;
    	balloon.material = material;
    	
    	OrderItem balloonItem = new OrderItem();
    	
    	balloonItem.setProduct(balloon);
    	balloonItem.setCount(Integer.parseInt(number));
    	order.addItem(balloonItem);
    	
    	Cake cake = new Cake();
    	cake.cakeFlavor = flavor;
    	cake.frostingFlavor = frostingFlavor;
    	cake.shape = shape;
    	cake.size = size;
    	cake.cakeColor = cakeColor;
    	
    	OrderItem cakeItem = new OrderItem();
    	cakeItem.setProduct(cake);
    	cakeItem.setCount(1); //only 1 cake
    	order.addItem(cakeItem);

    	//forward to receiver
    	orderTaker.receiveOrder(order);
    }
}
