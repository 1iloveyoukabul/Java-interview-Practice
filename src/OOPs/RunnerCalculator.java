package OOPs;

public class RunnerCalculator {

	public static void main(String[] args) {
		//Calculator str1 = new Calculator("Gaudians Calculator");
		//System.out.println(str1.name);
		Calculator str = new Calculator();
		str.add(10, 10);
		System.out.println(str.calcuator(50, 50));
		
		str.subtract(20, 4);
		System.out.println("==================================================");
		// both method work
		str.multiplication(3, 5);
		System.out.println(str.multiplications(4, 5));
        System.out.println("==================================");
        
        str.division(10, 2);
        
        
	}

}
