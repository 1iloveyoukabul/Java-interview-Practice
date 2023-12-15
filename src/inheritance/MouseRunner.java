package inheritance;

public class MouseRunner {

	public static void main(String[] args) {
		
		Mouse3 m3 = new Mouse3(14);
		m3.toString();
		m3.setMousewirless("Cord length");
		m3.setMousleft("Left");
		m3.setMousright("Right Click");
		m3.setMousscrodown("Moving Down");
		m3.setMousscroup("Moving Up");
		System.out.println(m3);
		
		Mouse1 m1 = new Mouse1("Red Color");
		System.out.println(m1);
		
		Mouse2 m2 = new Mouse2("Product Dell");
		System.out.println(m2);
	
		

	}

}
