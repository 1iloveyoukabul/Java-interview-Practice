package Polymorphsim;

public class person {
	//Upcasting is declaring an objecto of the parent and initialzing any of the child classes
	//Downcasting declaring an object of a child and initialzing the parent c
	
	private String firstName;
	private String lastName;
	
	// Overloading = having multiple version of the same method with differnet signatures
	//in the same class.
	
	public person() {
		super();
		this.firstName = "";
		this.lastName = "";
	}
	
	public person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
// Overriding = changing the implementation of the method that you inheriting
// the annotation @Overriding is use to notify developers that the method
// is being overriden. it also help avoiding mistakes.
	@Override
	public String toString() {
		return "person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
