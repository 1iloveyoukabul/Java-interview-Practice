package OOPs;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Calculator {

	//String name;
	// Constructor
	//Calculator(String n){
	//	 name = n;
	//}
	
	// both methos work
		public void add(int a,int b){
			System.out.println(a +b);
		}
			 public int calcuator(int a,int b) {
				 return a +b;
	}
		public void subtract(int a, int b) {
			System.out.println("Value is a 20");
			System.out.println("Subtracted b value is 4:");
			System.out.println(a-b);
		}
		// both method work
		public void multiplication(int a, int b) {
			System.out.println(a * b);
		}
			public int multiplications(int a, int b) {
				return a*b;
		}
			
			public void division(int a , int b) {
				System.out.println(a /b);
			}
			
}          

