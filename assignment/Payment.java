package storemanagement;

import java.util.Date;

public class Payment {
	 private int paymentID;
	    private int billID;
	    private String paymentMode;
	    private double amount;
	    private Date paymentDate;
	    private String transactionID;

	    public Payment(int paymentID, int billID, String paymentMode, double amount,
	                   Date paymentDate, String transactionID) {
	        this.paymentID = paymentID;
	        this.billID = billID;
	        this.paymentMode = paymentMode;
	        this.amount = amount;
	        this.paymentDate = paymentDate;
	        this.transactionID = transactionID;
	    }

	    public void processPayment() {
	        System.out.println("\nPayment processed successfully.");
	        System.out.println("Payment Mode: " + paymentMode);
	        System.out.println("Amount: " + amount);
	    }

	    public String getPaymentDetails() {
	        return "Payment ID: " + paymentID +
	               "\nBill ID: " + billID +
	               "\nPayment Mode: " + paymentMode +
	               "\nAmount: " + amount +
	               "\nTransaction ID: " + transactionID;
	    }

	    public void refund() {
	        System.out.println("Payment refunded.");
	    }

}
