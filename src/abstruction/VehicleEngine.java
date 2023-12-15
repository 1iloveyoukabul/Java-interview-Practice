package abstruction;

public interface VehicleEngine {
	
// we can not have objects of interface
	
// interface are designed for 100% abstraction
	
// you define your methods in the interface and the class that is implemeting 
// it should implement the method
	
// the two exceptions where you have implementation in
// the interface is keyword static and default, to have methods
	
	// we can have variables in an interface but they are all
	// considered public static and final
	
	//public static int a = 10;
	int a = 10;// it means public method or considered as public
	
	public void brak(double amount);
	public void accelerate(double amount);
	public default void engineLight() {// I can call in the runner class with object of toyot classs
		System.out.println("engineLight is ON");
		
		
	}
	
		
	}


