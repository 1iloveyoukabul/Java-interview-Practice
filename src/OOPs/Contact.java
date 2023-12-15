package OOPs;

public class Contact {

// constructor
// name of the method is same as name of the class
// no return type
// initialze all of the veriables 
	
	String firstName;
	String midName;
	String lastName;
	String phone;
	String email;
	String address;
	
	public Contact() {
		this.firstName = "";
		this.midName = "";
		this.lastName = "";
		this.phone = "";
		this.email = "";
		this.address = "";
	}
	// toString mehtod is to provide a String representation of your objecjt
	// pulblic String toString(){return"";}
	// you can add the annotation @override to be sure that your method is correct
	
	
		public Contact(String firstName,String midName,String lastName,String phone,String email, String address) {
			this.firstName = firstName;
			this.midName = midName;
			this.lastName = lastName;
			this.phone = phone;
			this.email = email;
			this.address = address;
			
		}
		
		// I create a few constructors with parameterazed and I can cll each of them if i want to pirnt
		public Contact(String firstName,String lastName) {
			this.firstName = firstName;
			this.midName = "";
			this.lastName = lastName;
			this.phone = "";
			this.address ="" ;
			
//		}
//		public void printContactInfo() { // in this method clled firsName and Last Name
//			System.out.println("First Name " + firstName +" "+  "Last Name " + " "+ lastName);	
					
		}
		@Override // this method will not let me to run if I missed deffintions toString mehod 
		public String toString() {
			return "Conact Info:" +"First Name " + firstName+ " "+ "Middle Name " + midName +" "+ "Last Name "
					+ lastName + "\nPhone Number" +" "+ phone +" "+
					"email "+ email+" "+ "\nAddress " + address;
//		}
//			public void printContact() {
//			
//				System.out.println("First Name " + firstName+ " "+ "Middle Name " + midName +" "+ "Last Name " +
//			" "+ lastName +" "+ "Phone Number " +" "+ phone +" "+ "email "+ email+ " "+ "Address " + address);
			}}
	
	
//// runner method or runner class
//   public static void main(String []args) {
//	Contact str = new Contact("John", "Hunt", "Mik", "80429634424", "1012 broad St Henrico VA 230228.");
//	str.printContact();
	

