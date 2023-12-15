package interview;

public class covertToNumber {

	public static void main(String[] args) {
		// first mehtod
		String str = "1234";
		int number = Integer.parseInt(str);
		System.out.println("Converting String to Integer: " +number);
      // second method
		
		int number2 = Integer.valueOf(str);
		System.out.println("Integer.valueOf: "+ number2);
	
		
		
	}

}
