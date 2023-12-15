package abstractExample;

public abstract class abstractPerson {

	// we can not have an object of an abstract class
	// we can have non or all abstract cod in the abstract class
	// the sub class will extend this class
	// the sub class will get a copy of the code from this class
	// the sub class will have to implement the abstract method of the calss
	
	private String firstName;

	public abstractPerson() {
		super();
		this.firstName = "";
	}

	public abstractPerson(String firstName) {
		super();
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
 public abstract void sum(int a, int b);// this method implemented in the student class
 
}
