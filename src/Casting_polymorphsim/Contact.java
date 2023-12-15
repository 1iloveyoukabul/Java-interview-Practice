package Casting_polymorphsim;

public class Contact {
// Upcasting is declaring an objecto of the parent and initialzing any of the child classes
	
	private String cellPhone;
	private String workPhone;
	private String email;
	private String address;
	
	public Contact() {
		super();
		this.cellPhone = "";
		this.workPhone = "";
		this.email = "";
		this.address = "";
		
	}
	public Contact(String cellPhone, String workPhone,  String address) {
		super();
		this.cellPhone = cellPhone;
		this.workPhone = workPhone;
		this.email = "";
		this.address = address;
	}
	public String formatPhoneNumber(String phone) {
		//return "(804)-277 -6618";
		String part1 = phone.substring(0,3);
		String part2 = phone.substring(3,6);
		String part3 = phone.substring(6);
		return "+1("+ part1 + ")"+ part2 + "_" + part3;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	public String getEmail() {
		return email;
	}
	public boolean setEmail(String email) {
		//to validate the email
		String []temp = email.split("@");
		
		if(temp.length == 2) {
		if(temp[1].contains(".")) {
			this.email = email;	
			System.out.println(email+ " added succeffuly");
			return true;
		}
		
		
		}
		System.out.println("invalid email address");
		return false;
		// john@gmail.com
		// split based @
		// the array should have length  index of 2
		// we take the second part - index 1
		// make sure  there one . in that part
		
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Contact [cellPhone=" + formatPhoneNumber(cellPhone) + ", workPhone=" + workPhone + ", email=" + email + ", address="
				+ address + "]";
	}
	
}
