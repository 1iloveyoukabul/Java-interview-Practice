package OOPs;

public class crediteAccount {
	
	String firstName;
	String lastName;
	String pin;
	double balance;
	double creditAvailable;
	// default constructor
	public crediteAccount() {
		this.firstName = "";
		this.lastName = "";
		this.pin = "";
		this.balance = 0;
		this.creditAvailable = 0;
	}
	
	public crediteAccount(String firstName,String lastName,String pin,double creditAvailable) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pin = pin;
		this.balance = 0;
		this.creditAvailable = creditAvailable;
	}
	// spend
		public boolean spend(double amount) {
			if(amount > creditAvailable) {
			System.err.println("Insufficient balance $");
			return false;
		}else {
			creditAvailable -= amount;
			balance += amount;
			System.out.println("Amount spent $ " + amount);
	       return true;
		}}
	       // print info
			public void printInfo() {
				System.out.println("Customer " +" "+ firstName +" "+ lastName+" "+
			"Current Balance " + balance +" " + "Available Credit $" + " " +creditAvailable);
				System.out.println("----------------------------------------------------------");
			}
			//public String printCredite() {
//			String info = "Customer " +" "+ firstName +" "+ lastName+" "+ "Current Balance " + creditAvailable;
//			System.out.println(info);
//			return info;
			
			public void makePayment(double amount) {
				balance -= amount;
				creditAvailable += amount;
				System.out.println("A payment is made successfully $" + amount);
			}
			}
			
	       


