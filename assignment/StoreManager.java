package storemanagement;

public class StoreManager {
	 private int managerID;
	    private String name;
	    private String phone;
	    private String email;

	    public StoreManager(int managerID, String name, String phone, String email) {
	        this.managerID = managerID;
	        this.name = name;
	        this.phone = phone;
	        this.email = email;
	    }

	    public void manageStaff(Staff staff) {
	        System.out.println(name + " is managing staff.");
	        System.out.println(staff.getStaffDetails());
	    }

	    public void viewReports() {
	        System.out.println("Store reports displayed.");
	    }

	    public String getManagerDetails() {
	        return "Manager ID: " + managerID +
	               "\nName: " + name +
	               "\nPhone: " + phone +
	               "\nEmail: " + email;
	    }

}
