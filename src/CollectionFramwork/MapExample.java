package CollectionFramwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer,String> data = new HashMap<Integer,String>();
		
		// Maps are key- value-pair data structure
		// this means that ther is no index in map
		// we will have a key set can a collection of values
		
		// we could get a value by giving the key
		// we could get all values, or all keys
		
		// keys are stored in a set, so the keys in a map will always be unique
		
		// to add a key value to the map, method put()is used
         // the value can be duplicated, it is not problem.
		// it goes by keys numbers 123.......
		
		data.put(1, "Alexx");
		data.put(2, "John");
		data.put(3, "Robber");
		System.out.println(data+ "the value can be duplicated, it is not problem.");
		
		
		// get values with the method get() and provide the key
		System.out.println("Method get(3)" + data.get(3));
		
		// to get all of the keys in the map, use the method keySet()
		
		System.out.println("Method KeySet" + data.keySet());
		
		// String method
		
		Map<String, String> temp = new HashMap<String, String>();
		temp.put("firstName", "Johne");
		temp.put("lastName", "Robber");
		temp.put("firstName", "Allen");
		temp.put("Age", "23");
		// it will be printed based on key value not the value
		System.out.println( " it will be printed based on the keys value"+ temp);
		
		System.out.println("====================================================");
		
		// some concept with arrlist
		
		Map<String, ArrayList<String>> temp2 = new HashMap<String, ArrayList<String>>();
		
		temp2.put("Student Name", new ArrayList<String>());
		temp2.put("Teacher Name", new ArrayList<String>());
		temp2.put("Programming Languages", new ArrayList<String>());
		
		
		temp2.get("Student Name").add("John");
		temp2.get("Student Name").add("Allen");
		temp2.get("Teacher Name").add("Robber");
		temp2.get("Teacher Name").add("Alex");
		temp2.get("Programming Languages").add("Java");
		temp2.get("Programming Languages").add("C++");
		temp2.get("Programming Languages").add("Java Script");
		temp2.get("Programming Languages").add("TypeScript");
		
		System.out.println(temp2);
		System.out.println("--------------------------------------------------");
		// get method
		// I can print each vaule by passing key with get method
		System.out.println(temp2.get("Teacher Name"));
		System.out.println("--------------------------------------------------");
		
		
		// how to iterate through a map to print all the values?
		
		// to go through the values in the map, we have to loop through the keys
		// and pass the keys to the get method to get the values
		
		Set<String> tempkeys = temp2.keySet();
		for(String keys : tempkeys) {// each loop or enhanced loop
			
			//String value = key+ temp2;
			System.out.println(keys + temp2.get(keys));
			
			System.out.println("--------------------------------------------------------");
			for(String value : temp2.keySet()) {
				System.out.println(temp2.get(value));
				
				System.out.println(temp2.containsKey("Student Name"));// return boolean
				
				System.out.println("========================================================");
				// I need create more methods of HasMap if have more than one person 
				Map<String,String> info1 = new HashMap<String,String>();
				Map<String,String> info2 = new HashMap<String,String>();
				Map<String,String> info3 = new HashMap<String,String>();
				
				info1.put("firstName", "Alex");
				
				info2.put("firstName", "John");
				
				info3.put("firstName", "Rebort");
				
				System.out.println(info1);
				System.out.println(info2);
				System.out.println(info3);
			}
		}
		
		
		
	}

}
