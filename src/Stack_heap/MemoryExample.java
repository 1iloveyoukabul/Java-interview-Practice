package Stack_heap;

public class MemoryExample {

	public static void main(String[] args) {
		
// static members belong to the class and not to the object or name of the class.
	// stack and heap are part jva languge
		int a = 5;
		
		double b = 5;
		
		String c = " ";
		
		String str = "test";
		String str1 = new String ("test");
		 str1 = str;
		String str2 = "test";
// varibal will be in stack if it a primitive
//if it is a reference nonprimitive, the object it will be created in the heap, and the reference of that will be in the stack.
		
//the operator of (==)will compare the value what I have in stack and the result false because they have the same value in the stack
		System.out.println(str == str1);// 
		
//the operator of equals will compary the value and the result is true becase it has the same value with dirfferent location in memory
		
		System.out.println(str.equals(str1));
// result is true becaus all of them have the same value in the memore, it will replace the same value to prevant duplicate
		System.out.println(str2 == str1);
		System.out.println("=================================================================");
		
		String s1 = "jack";
		String s2 = "Jack";
		String s3 = "David";
		String s4 = "jack";
		
		s1=s2;
		s3=s1;
		
		String s5 = new String ("jack");
		
		System.out.println( s5 == s4);// it is false bcos they are the same value
		
		System.out.println(s1 == s2);// it is true bcos not the same value (s2 J is capital)
		
		
		//the operator of equals will compary the value and the result is true becase it has the same value with dirfferent location in memory		
		System.out.println(s4.equals(s5));
		
		
		
		int a1 = 10;
		int b1 = 5;
		int c1 = a1;
		
		System.out.println((b+5)!= c1);
		
		
		System.out.println("================================================");
		// garbge collection
		
		int j1 = 10;
		int j2 = j1 + 5;
		j1++;
		j2 = 5 + j1;
		System.out.println(++j2);
		
		System.out.println("==========================================================");
		// length
		String j3 = j1 + " t";
		j3+= " t";
		
		System.out.println(j3.length());
		
	}

}
