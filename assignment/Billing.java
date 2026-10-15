package storemanagement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Billing {
	 private int billID;
	    private Date billDate;
	    private double discount;
	    private double totalAmount;
	    private double tax;
	    private double grandTotal;
	    private List<BillDetail> items = new ArrayList<>();

	    public Billing(int billID, Date billDate, double discount, double tax) {
	        this.billID = billID;
	        this.billDate = billDate;
	        this.discount = discount;
	        this.tax = tax;
	    }

	    public void addItem(BillDetail item) {
	        items.add(item);
	        System.out.println("Product added to bill.");
	    }

	    public void removeItem(BillDetail item) {
	        items.remove(item);
	        System.out.println("Product removed from bill.");
	    }

	    public double calculateTotal() {
	        totalAmount = 0;
	        for (BillDetail item : items) {
	            totalAmount += item.calculateSubtotal();
	        }
	        grandTotal = totalAmount - discount + tax;
	        return grandTotal;
	    }

	    public void generateBill() {
	        System.out.println("\n========== BILL ==========");
	        System.out.println("Bill ID: " + billID);
	        System.out.println("Bill Date: " + billDate);
	        for (BillDetail item : items) {
	            System.out.println(item.getDetails());
	        }
	        System.out.println("--------------------------");
	        System.out.println("Total Amount: " + calculateSubtotalTotal());
	        System.out.println("Discount: " + discount);
	        System.out.println("Tax: " + tax);
	        System.out.println("Grand Total: " + calculateTotal());
	        System.out.println("==========================");
	    }

	    private double calculateSubtotalTotal() {
	        totalAmount = 0;
	        for (BillDetail item : items) {
	            totalAmount += item.calculateSubtotal();
	        }
	        return totalAmount;
	    }

}
