package scrap.heap.refactor;
import java.util.*;
public class Order {
	List<OrderItem> Items;
	public Order ()
	{
		this.Items = new ArrayList<OrderItem>();
	}
	public void addItem(OrderItem item) {
		this.Items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		
		//not implemented
	}
}