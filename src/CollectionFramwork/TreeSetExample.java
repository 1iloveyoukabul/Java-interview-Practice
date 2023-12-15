package CollectionFramwork;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		Set<Integer> numkey = new TreeSet<Integer>();
		// TreeSet print the value by order and no duplicate value
		
		numkey.add(55);
		numkey.add(20);
		numkey.add(4);
		numkey.add(55);
		numkey.add(9);
		System.out.println(numkey);
		
		// HashSet un sort or un order and no duplicate value
		
		Set<Integer> numkey1 = new HashSet<Integer>();
		numkey1.add(55);
		numkey1.add(20);
		numkey1.add(4);
		numkey1.add(55);
		numkey1.add(9);
		System.out.println(numkey1);
	}

}
