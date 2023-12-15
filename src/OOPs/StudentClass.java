package OOPs;

public class StudentClass {
	
	//what is the Method? A block of code that is going to perform an action.
	//What is a constructor? it is a method that helps us to create an object of the class.
	//the constructor will never have return type and its job is to initialize all the class variables. 
	// object is instance of the class
	
 String firstName;
 String lastName;
 int age;
 String phoneNumber;
 
 StudentClass() {
	 firstName = " ";
	 lastName = " ";
	 int age = 0;
	 phoneNumber = " ";
 }
 // created another mehtod with paramter and created mehtod with parameter in ther runnre classa  with
 public StudentClass(String fir, String las, int ag, String phone) {
	 firstName = fir;
	 lastName = las;
	 int age = ag;
	 phoneNumber = phone; 
 }
    //mehtod will have return type
	// mehtod input  = argument/parameters of the method
	// method proccess = the body the method and wahtever code that you put there 
	// method output = the return type and return satatment of the method
	
 
 // if you have any return type bised void, you must have a return statment
 // if you have void for return type, you can't have return statment
 
     public String printall() {// value is stored in String info, I will call this method in runner class to print the result
    //public void printall() { // both method work.	 
		 String info = "First Name :" + firstName +" Last Name :" + lastName + " "  +"Age : " + age + 
				 " Phone Numaber: "+ phoneNumber;
		 System.out.println(info);
		 //return
		 return info;
}
	
	}
	 

