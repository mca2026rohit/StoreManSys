package storemanagement;

public class BillDetail {
	private int billID;
    private int productID;
    private int quantity;
    private double unitPrice;

    public BillDetail(int billID, int productID, int quantity, double unitPrice) {
        this.billID = billID;
        this.productID = productID;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double calculateSubtotal() {
        return quantity * unitPrice;
    }

    public String getDetails() {
        return "Product ID: " + productID +
               " | Quantity: " + quantity +
               " | Unit Price: " + unitPrice +
               " | Subtotal: " + calculateSubtotal();
    }

}
