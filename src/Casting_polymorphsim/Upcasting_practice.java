package Casting_polymorphsim;

public class Upcasting_practice {
	public static void main(String[] args) {
		
	
//	String [] values = new String[5];
//	// it will not accept because of differnt data type
//   values [0]= "some text";
//   values [1] = 10.10;
//   values [2] = false;
//   values [3] = 5;
//   values [4] = 'a';
   
   
	Object [] values = new Object[5];
	// It accepted the above method here, I change String method to object method
  values [0]= "some text";
  values [1] = 10.10;
  values [2] = false;
  values [3] = 5;
  values [4] = 'a';
  for(Object v : values) {
	  System.out.println(v);
  }
}}
