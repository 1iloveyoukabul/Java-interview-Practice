package Polymorphsim;

import OOPs.StudentClass;

public class Runner_4 {
	//(Daynomic)is Upcasting taht is declaring an objecto of the parent and initialzing any of the child classes
	public static void main(String[] args) {
		person obj = new person("John", "Alex");
		
		person obj1 = new Student("4.4");// Upcastig I initialzed student class as object 
		// person class will know the variables of the student class.
		
		person obj2 = new Employee(50, "Programmar");
		person obj3 = new Teacher("Math", 90);
		
		System.out.println(obj.toString());
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		

	}

}
