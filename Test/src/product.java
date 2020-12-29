public class product {
	
	private String productID;
	private String productName;
	private String productCategory;
	private String supplierName;
	private int productQuantity;
	private double productPrice;
	
	//Constructor
	
	public product(String productID, String productName, String productCategory, String supplierName, int productQuantity, double productPrice) {
		
		this.productID = productID;
		this.productName = productName;
		this.productCategory = productCategory;
		this.supplierName = supplierName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
		
	}
	
	public String getProductID() {
		
		return productID;
		
	}
	
	public void setProductID(String productID) {
		
		this.productID = productID;
		
	}
	
	public String getProductName() {
		
		return productName;
		
	}
	
	public void setProductName(String productName) {
		
		this.productName = productName;
		
	}
	
	public String getProductCategory() {
		
		return productCategory;
		
	}
	
	public void setProductCategory(String productCategory) {
		
		this.productCategory = productCategory;
		
	}
	
	public String getSupplierName() {
		
		return supplierName;
		
	}
	
	public void setSupplierName(String supplierName) {
		
		this.supplierName = supplierName;
		
	}
	public int getProductQuantity() {
		
		return productQuantity;
		
	}
	
	public void setProductQuantity(int productQuantity) {
		
		this.productQuantity = productQuantity;
		
	}
	
	public double getProductPrice() {
		
		return productPrice;
		
	}
	
	public void setProductPrice(double productPrice) {
		
		this.productPrice = productPrice;
		
	}
	
	public String printProductInfo() {
		
 	   return (productID + " " + productName + " " + productCategory + " " + supplierName + " " + productQuantity + " " + productPrice);
 	   
    }

}
