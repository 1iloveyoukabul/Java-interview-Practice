package inheritance;

public class Mouse2 extends Mouse {

	String mouselogistch;

	public Mouse2() {
		super();
		this.mouselogistch = "";
	}
	public Mouse2(String mouselogistch) {
		super();
		this.mouselogistch = mouselogistch;
		
		
}
	
	public String getMouselogistch() {
		return mouselogistch;
	}
	public void setMouselogistch(String mouselogistch) {
		this.mouselogistch = mouselogistch;
	}
	@Override
	public String toString() {
		return "Mouse2 [mouselogistch=\\n"+super.toString() + mouselogistch + "]";
	}}
