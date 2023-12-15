package CollectionFramwork;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> StackOfNumbers = new Stack<Integer>();
		
		StackOfNumbers.add(220);
		StackOfNumbers.add(330);
		StackOfNumbers.add(220);
		StackOfNumbers.add(230);
		StackOfNumbers.add(500);
		
		System.out.println(StackOfNumbers);
		System.out.println(StackOfNumbers.get(0));
		
		// peek method will print the last index on the top. 
		// it means first come first out
		System.out.println(StackOfNumbers.peek());
	
		System.out.println(StackOfNumbers.pop());// removed the last index 500
		System.out.println(StackOfNumbers);
		

	}

}
