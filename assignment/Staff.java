package storemanagement;

public class Staff {
	 private int staffID;
	    private String name;
	    private String phone;
	    private String email;
	    private String role;

	    public Staff(int staffID, String name, String phone, String email, String role) {
	        this.staffID = staffID;
	        this.name = name;
	        this.phone = phone;
	        this.email = email;
	        this.role = role;
	    }

	    public void sellProduct(Product product) {
	        System.out.println(name + " sold:");
	        System.out.println(product.getProductDetails());
	    }

	    public void updateDetails(String phone, String email) {
	        this.phone = phone;
	        this.email = email;
	        System.out.println("Staff details updated.");
	    }

	    public String getStaffDetails() {
	        return "Staff ID: " + staffID +
	               "\nName: " + name +
	               "\nPhone: " + phone +
	               "\nEmail: " + email +
	               "\nRole: " + role;
	    }

}
