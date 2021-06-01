package Lab1;



//		Question 2


//Create a class named Student that can hold the data for a single student from the following table. 


public class Student {
	
	
//Make sure some data such as student email, student Phone number are private.
	private int SID;
	String firstName;
	String lastName;
	private String email;
	private int phoneNumber;
	
	
	public void firstName(String fName){
		firstName = fName;
	}
	
	
	
	public void lastName(String lName) {
		lastName = lName;
	}
	
	
	
	public int getSID() {
		return SID;
	}
	public void setSID(int sID) {
		SID = sID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	
	
}
