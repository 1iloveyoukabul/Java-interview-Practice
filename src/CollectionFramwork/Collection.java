package CollectionFramwork;

import java.util.ArrayList;

public class Collection {
	public static void main(String[] args) {
		
	// we call generics these two angle brackets <>
	
    // ctrl + shift + o
	// Generally, collection data structure that we are stored data and process data
	
	//<Generics> define the data type we want to have in the collection
	// we can only use reference data type in generic. no primitives data
	// we will have to use Wrapper class
		
		ArrayList<Integer> ages = new ArrayList<Integer>();// Wrapper class means to use primitive data
		ages.add(19);
		System.out.println(ages);
		String str = "10";
		System.out.println(Integer.valueOf(str)+ 10);// convert String to Integer
	
	ArrayList<String> names = new ArrayList<String>();// generics method
	// first method to add itme to the list
	names.add("John");
	names.add("Alex");
	names.add("George");
	names.add("Rebbort");
	System.out.println(names.get(1));// call by index
	System.out.println(names.contains("Babrak"));// validation, checking if the name is in my list
	
	// with object we can stor string, int, char
	ArrayList<Object> list1 = new ArrayList<Object>();
	list1.add(1010);
	list1.add("John");
	list1.add("J");
	list1.add(1010.1);
	System.out.println(list1);
	
	
	
	
	
	
}}
