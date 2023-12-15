package Polymorphsim;

public class Student extends person{
	
	private String gpa;

	public Student() {
		super();
		this.gpa = "";
	}
	public Student(String gpa) {
		super();
		this.gpa = gpa;

}
	public String getGpa() {
		return gpa;
	}
	public void setGpa(String gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [gpa="+super.toString() + gpa + "]";
	}}
