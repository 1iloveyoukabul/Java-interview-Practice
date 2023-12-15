package inheritance;

public class schoolRunner {

	public static void main(String[] args) {
		StudentTest sch = new StudentTest(4, "Java Programmar");
		
		
		
		sch.setEmail("John@gmail.com");
		sch.setFirstName("John");
		sch.setLastName("Alex");
		System.out.println(sch);
		
		Teacher tec = new Teacher("Math", "Intstructor");
		System.out.println(tec);
		
	}

}
