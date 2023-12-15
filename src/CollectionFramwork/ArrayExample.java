package CollectionFramwork;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayExample {

	public static void main(String[] args) {
		
	//What is ArrayList?
	// it is better with retrival of data
	// it is better with smaller database
	// it is dynamic in size
		
	// What is LinkedList?
	// it is better with large datasets
	// it is removing / modification will not cost as much
	// it is dynamic in size
	// growing the size does not have any cost for computers
	// retrival of data maybe a bit costly
		
		
		ArrayList<Integer> numbers = new ArrayList <Integer>();
		numbers.add(50);
		numbers.add(60);
		numbers.add(70);
		numbers.add(80);
		
		System.out.println(numbers);
		numbers.remove(2);// removed the index 2 but it moved all the index to back
		
		System.out.println(numbers);
		System.out.println("=========================================================");
		LinkedList<Integer> numberslist = new LinkedList<Integer>();
		
		numberslist.add(100);
		numberslist.add(200);
		numberslist.add(300);
		numberslist.add(400);
		numberslist.add(500);
		System.out.println(numberslist);
		numberslist.remove(2);
		System.out.println(numberslist);
		}
		
		
	}


