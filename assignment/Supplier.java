package storemanagement;

public class Supplier {
	 private int supplierID;
	    private String supplierName;
	    private String contactNo;
	    private String address;
	    private String email;

	    public Supplier(int supplierID, String supplierName, String contactNo,
	                    String address, String email) {
	        this.supplierID = supplierID;
	        this.supplierName = supplierName;
	        this.contactNo = contactNo;
	        this.address = address;
	        this.email = email;
	    }

	    public void addSupplier() {
	        System.out.println("Supplier added successfully.");
	    }

	    public void updateSupplier(String contactNo, String email) {
	        this.contactNo = contactNo;
	        this.email = email;
	        System.out.println("Supplier details updated.");
	    }

	    public String getSupplierDetails() {
	        return "Supplier ID: " + supplierID +
	               "\nSupplier Name: " + supplierName +
	               "\nContact No: " + contactNo +
	               "\nEmail: " + email;
	    }

}
