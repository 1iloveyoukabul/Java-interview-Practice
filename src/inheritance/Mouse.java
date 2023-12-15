package inheritance;

public class Mouse {
	
	String mousright;
	String mousleft;
	String mousscroup;
	String mousscrodown;
	String mousewirless;
	
	public Mouse() {
		super();
		this.mousright = "";
		this.mousleft = "";
		this.mousscroup = "";
		this.mousscrodown = "";
		this.mousewirless = "";
	}

	public Mouse(String mousright, String mousleft, String mousscroup, String mousscrodown, String mousewirless) {
		super();
		this.mousright = mousright;
		this.mousleft = mousleft;
		this.mousscroup = mousscroup;
		this.mousscrodown = mousscrodown;
		this.mousewirless = mousewirless;
	}
	

	public String getMousright() {
		return mousright;
	}

	public void setMousright(String mousright) {
		this.mousright = mousright;
	}

	public String getMousleft() {
		return mousleft;
	}

	public void setMousleft(String mousleft) {
		this.mousleft = mousleft;
	}

	public String getMousscroup() {
		return mousscroup;
	}

	public void setMousscroup(String mousscroup) {
		this.mousscroup = mousscroup;
	}

	public String getMousscrodown() {
		return mousscrodown;
	}

	public void setMousscrodown(String mousscrodown) {
		this.mousscrodown = mousscrodown;
	}

	public String getMousewirless() {
		return mousewirless;
	}

	public void setMousewirless(String mousewirless) {
		this.mousewirless = mousewirless;
	}

	@Override
	public String toString() {
		return "Mouse [mousright=" + mousright + ", mousleft=" + mousleft + ", mousscroup=" + mousscroup
				+ ", mousscrodown=" + mousscrodown + ", mousewirless=" + mousewirless + "]";
	}
	

}
