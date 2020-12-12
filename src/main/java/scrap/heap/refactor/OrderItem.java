package scrap.heap.refactor;

public class OrderItem{
	private int count = 0;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	private Product product;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		//System.out.println(product.getProductType());
		this.product = product;
	}
}