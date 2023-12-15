package CollectionFramwork;

import java.util.HashSet;
import java.util.Set;

public class HashSetArray {

	public static void main(String[] args) {
	// finding duplicate value in side array
	int nums []= {12,23,24,33,33,23,45,66,77,702,70,50,60};
	System.out.println(hasDuplicate(nums));
	}
		public static boolean hasDuplicate(int [] input) {
			Set<Integer> numb = new HashSet<Integer>();
		
		  for(int i = 0; i < input.length;i++) {
			  if(numb.add(input[i])== false) {
				  return true;
			  }}
			  return false;
		
		}
	}	
			

	


