package OOPs;

public class BankRunner {
	public static void main(String[] args) {
		
		BankAccount user = new BankAccount("Customer Name: John", "Allen");
		
		System.out.println(user.FirstName+" " + user.LastName);
		
		double depAmount = user.deposite(5000);
		user.deposite(5000);
		user.deposite(5000); 
		user.withdraw(5000);
		double withdrawAmount = user.withdraw(11000);
		System.out.println(withdrawAmount);// it return zero bco account is negative 
		//System.out.println(user.balance); 
		user.chekbalance();

	}
}
