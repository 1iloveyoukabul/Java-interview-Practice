package Polymorphsim;

public class Teacher extends Employee {
	private String subject;
	private double grade;
	
	public Teacher() {
		super();
		this.subject = "";
		this.grade = 0;
	}

	public Teacher(String subject, double grade) {
		super();
		this.subject = subject;
		this.grade = grade;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Teacher [subject="+super.toString() + subject + ", grade=" + grade + "]";
	}
	
}
