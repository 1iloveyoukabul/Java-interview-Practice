package OOPs;

public class StudentRunner {

	public static void main(String[] args) {
		Student st = new Student("John", "Allen", 40, "(855-999-5522)", true);
		System.out.println(st);
		
		st.setAge(24);
		System.out.println(st);// I Changed the value of age becuse setter method
		// allowed me to change it.
		// getter method give access to ready only
		
   st.setPhone("55544455500"); // created if statment for phone number with setter method
   System.out.println(st);
  
	}

}
