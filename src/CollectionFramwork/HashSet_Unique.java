package CollectionFramwork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Unique {

	public static void main(String[] args) {
		
		// Collection is parent of all class and upcasting any of the child classes
		
		// set is interface, not a class
//		 HashSet is only accepting unique value
//		 Sets are not based on indexes
//		 so we can not iterat with a normal loop, we have to to use the enhanced for loop
//		 just work with enhanced loop
//		 HashSet is goin to be un-order and un-sorted
//		
		Set<Integer> numbers = new HashSet<Integer>();
		// HashSet is only accepting unique value, not duplicate value
		numbers.add(10);
		numbers.add(12);
		numbers.add(40);
		numbers.add(10);
		numbers.add(50);
		
		System.out.println(numbers);
		for(int a : numbers) {
			System.out.println(a);
		}
			System.out.println("==============================================");
			
			System.out.println(numbers.add(10));// result false becas 10 was already in memory
			System.out.println(numbers.add(90));
			System.out.println(numbers.add(70));
			
			System.out.println("==========================================================");
		
			int nums []= {12,23,24,33,33,23,45,66,77,702,70,50,60};
			
		 for (int i = 0; i < nums.length; i++) {
			 System.out.println(" Value " +  nums[i]+" "+numbers.add(nums[i]));
			 
//		System.out.println("Value > " + nums[i]+ " "+numbers.add(nums[i]));
//			System.out.println("Value: " + nums[i]+ " "+ "Status" +" " + numbers.add(nums [i]));

		 }}}
		
	

	


