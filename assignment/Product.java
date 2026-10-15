package storemanagement;

public class Product {
	 private int productID;
	    private String productName;
	    private double price;
	    private String category;
	    private String description;

	    public Product(int productID, String productName, double price,
	                   String category, String description) {
	        this.productID = productID;
	        this.productName = productName;
	        this.price = price;
	        this.category = category;
	        this.description = description;
	    }

	    public void updatePrice(double price) {
	        this.price = price;
	        System.out.println("Product price updated.");
	    }

	    public String getProductDetails() {
	        return "Product ID: " + productID +
	               "\nProduct Name: " + productName +
	               "\nPrice: " + price +
	               "\nCategory: " + category +
	               "\nDescription: " + description;
	    }

	    public int getProductID() {
	        return productID;
	    }

	    public double getPrice() {
	        return price;
	    }

}
