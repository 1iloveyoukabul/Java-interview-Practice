package inheritance;

public class Mouse1 extends Mouse {
	
	String mouscolorRed;

	public Mouse1() {
		super();
		this.mouscolorRed = "";
	}

	public Mouse1(String mouscolorRed) {
		super();
		this.mouscolorRed = mouscolorRed;
	}
	

	public String getMouscolorRed() {
		return mouscolorRed;
	}

	public void setMouscolorRed(String mouscolorRed) {
		this.mouscolorRed = mouscolorRed;
	}

	@Override
	public String toString() {
		return "Mouse1 [mouscolorRed=\n"+ super.toString() + mouscolorRed + "]";
	}
	

}
