package storemanagement;

public class Customer {
	
	    private int customerID;
	    private String name;
	    private String phone;
	    private String email;
	    private String address;

	    public Customer(int customerID, String name, String phone,
	                    String email, String address) {
	        this.customerID = customerID;
	        this.name = name;
	        this.phone = phone;
	        this.email = email;
	        this.address = address;
	    }

	    public void register() {
	        System.out.println("Customer registered successfully.");
	    }

	    public void updateDetails(String phone, String email, String address) {
	        this.phone = phone;
	        this.email = email;
	        this.address = address;
	        System.out.println("Customer details updated.");
	    }

	    public String getCustomerDetails() {
	        return "Customer ID: " + customerID +
	               "\nName: " + name +
	               "\nPhone: " + phone +
	               "\nEmail: " + email +
	               "\nAddress: " + address;
	    }

}
