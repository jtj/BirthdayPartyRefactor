package scrap.heap.refactor;

public abstract class Product{

	private String productType ;
	public Product() {};
	public Product (String productType) {
		setProductType(productType);
	}
	public String getProductType() {
	   return this.productType;
    }
	
	public void setProductType(String productType) {
		this.productType = productType;
	}
}