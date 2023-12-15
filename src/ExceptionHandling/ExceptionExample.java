package ExceptionHandling;

import java.io.FileNotFoundException;

public class ExceptionExample {
	public static void main(String []args) {
		
		// Exception?                               //Unchecked Exception
	      //Check Exception
		//class NotFoundException                //ArithmeticException
		//interupteException                     // ClassCastException
		// IOException                           //NullPointException
		//InstantaitioException                  //ArrayIndexOutBoundsException
		//SQLException                           // ArrayStoreException
		//FileNotFoundException                  // IllegalThreadStateException
		
		// in selenium, we handle the noSuchElementExeceptin with try catch block
		
		// un check exceptions are also called runtime exception,
		// we do not have to handle them if we dont want to
		
		// throw is a keyword that we can use to run an exception
		
		// throw is a keyword that we can use to define that a mehtod
		// ma cause a  chekced exception
		
		// exception handling is tool to handle exception its similar to fi statements in its strructure
		// it basiclly sandbox the code and if the exception occure, it will run the catch block for that exception
		// 1. try/catch
		// 2. throws
		
		// Throwable is class, it also the parent of throws and try catch
		
		// final is specifier, it makes the variable constant
		// finally is a block of code that is optinal to be added at the end of try/catch
		// finaliz method Garbage Collection
		
		// throw asking the exception to get excuated
		// throws declear that the method my cause an exception
		// Throwable is a class parent of Exception
		int a = 10;
		int b = 0;
		int [] num = {1,2,2,3,6};
		
		
     
     try {// (Exception) try catch, it will not let the code to crash
 		System.out.println(a/b);
 	}catch(ArithmeticException e) {
 		System.out.println("Can not be divided by zero");
 	//e.getStackTrace();//this line of code show me the problem
 		try {
    	 System.out.println(num[5]); 
     }catch(ArrayIndexOutOfBoundsException i) {
    	System.out.println("wrong index number");
    //	i.printStackTrace();//this line of code show me the problem
     }
     finally {
    	System.out.println("Finally block"); 
     }
    
		}
     
}}
