package Casting_polymorphsim;

public class ContactRunner {

	public static void main(String[] args) {
		Contact c = new Contact("8887775544", "8887775543", "Virginia");
		
		c.setEmail("john@gmail.com");
		System.out.println(c);
		
		BankAccount user1 = new BankAccount("Ashally", "Marisa", new Contact
				("2223334444", "2223334443", "Richmond"));
		
		System.out.println(user1);
		user1.deposit(200);
		user1.withdraw(250);
		

	}

}
