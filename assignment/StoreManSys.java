package storemanagement;

import java.util.Date;

public class StoreManSys {

	public static void main(String[] args) {
		 Customer customer = new Customer(
	                101, "Rohit", "9876543210", "rohit@gmail.com", "Goa");
	        customer.register();
	        System.out.println("\nCUSTOMER DETAILS");
	        System.out.println(customer.getCustomerDetails());

	        Product product = new Product(
	                501, "Rice", 60.0, "Grocery", "5 kg Rice Bag");
	        System.out.println("\nPRODUCT DETAILS");
	        System.out.println(product.getProductDetails());

	        Supplier supplier = new Supplier(
	                201, "ABC Suppliers", "9876500000", "Panjim, Goa", "abc@gmail.com");
	        supplier.addSupplier();
	        System.out.println("\nSUPPLIER DETAILS");
	        System.out.println(supplier.getSupplierDetails());

	        Inventory inventory = new Inventory(301, 501, 50, 10);
	        inventory.updateStock(20);
	        System.out.println("\nINVENTORY DETAILS");
	        System.out.println(inventory.getInventoryDetails());

	        Staff staff = new Staff(
	                401, "Amit", "9876543211", "amit@gmail.com", "Sales Staff");
	        staff.sellProduct(product);
	        System.out.println("\nSTAFF DETAILS");
	        System.out.println(staff.getStaffDetails());

	        StoreManager manager = new StoreManager(
	                601, "Rahul", "9876543212", "rahul@gmail.com");
	        manager.manageStaff(staff);
	        System.out.println("\nMANAGER DETAILS");
	        System.out.println(manager.getManagerDetails());

	        Billing bill = new Billing(1001, new Date(), 50.0, 20.0);
	        BillDetail item1 = new BillDetail(
	                1001, product.getProductID(), 3, product.getPrice());
	        bill.addItem(item1);
	        bill.generateBill();

	        Payment payment = new Payment(
	                701, 1001, "UPI", 150.0, new Date(), "TXN123456");
	        payment.processPayment();
	        System.out.println("\nPAYMENT DETAILS");
	        System.out.println(payment.getPaymentDetails());

	        System.out.println("\nStore Management System completed.");

	}

}
