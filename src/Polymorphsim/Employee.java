package Polymorphsim;
//Upcasting is declaring an objecto of the parent and initialzing any of the child classes
public class Employee extends person {
	private double salary;
	private String title;
	
	public Employee() {
		super();
		this.salary = 0;
		this.title = "";
		
	}

	public Employee(double salary, String title) {
		super();
		this.salary = 0;
		this.title = title;
	}

	public int getSalary() {
		return 0;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Employee [salary="+ super.toString() + salary + ", title=" + title + "]";
	}

}
