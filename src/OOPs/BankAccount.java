package OOPs;

public class BankAccount {
	String FirstName;
	String LastName;
	double balance;

	public BankAccount() {
		FirstName = "";
		LastName = "";
		balance = 0;
	}

// this means to refer to the variables in the class
	public BankAccount(String firstName, String lastName) {
		this.FirstName = firstName;
		this.LastName = lastName;

	}

	// withdraw or balance
	public double withdraw(double amount) {
		if (amount < balance) {
			
			balance -= amount;// subtract $ from balance
			System.out.println("You Withdraw amount $ " + amount + " Your current balance is $ " + balance);

			return amount;

		} else {
			System.out.println("Your balance is $ " + balance + " " + "with us and your requested amount is $" + amount
					+ " " + "insuffiecient Balance");
		}
		return 0;
	}

	// deposit
	public double deposite(double amount) {
		balance += amount;

		System.out.println("You Depoisted amount $ " + amount + " Your current balance is $ " + balance);
		return balance;
    // check balance
	}
		public double chekbalance() {
			System.out.println("Your current balance is $" +balance);
			return balance;
			
		}
	}

