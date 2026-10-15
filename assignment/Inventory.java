package storemanagement;

import java.util.Date;

public class Inventory {
	  private int inventoryID;
	    private int productID;
	    private int stockQuantity;
	    private int reorderLevel;
	    private Date lastUpdated;

	    public Inventory(int inventoryID, int productID, int stockQuantity, int reorderLevel) {
	        this.inventoryID = inventoryID;
	        this.productID = productID;
	        this.stockQuantity = stockQuantity;
	        this.reorderLevel = reorderLevel;
	        this.lastUpdated = new Date();
	    }

	    public void updateStock(int quantity) {
	        stockQuantity += quantity;
	        lastUpdated = new Date();
	        System.out.println("Stock updated.");
	    }

	    public int checkStock() {
	        return stockQuantity;
	    }

	    public String getInventoryDetails() {
	        return "Inventory ID: " + inventoryID +
	               "\nProduct ID: " + productID +
	               "\nStock Quantity: " + stockQuantity +
	               "\nReorder Level: " + reorderLevel +
	               "\nLast Updated: " + lastUpdated;
	    }

}
