package inheritance;

public class StudentTest extends person {
// constructor chaining
// you can call one another constructor at the start of each constructor
// it must be the first line
// you can either use super or this
	private double pga;
	private String major;
	
	public StudentTest() {
		super();
		this.pga = 0;
		this.major = "";
	}
	public StudentTest(double pga, String major) {
		super();
		this.pga = pga;
		this.major = major;
	
	
}
	public double getPga() {
		return pga;
	}
	public void setPga(double pga) {
		this.pga = pga;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "Student ["+ super.toString() +"pga=" + pga + ", major=" + major + "]";
	}}
