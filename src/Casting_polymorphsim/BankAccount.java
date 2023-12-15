package Casting_polymorphsim;

public class BankAccount {
	
	private String firstName;
	private String lastName;
	private Contact contact;
	private double balance;
	
	public BankAccount() {
		super();
		this.firstName = "";
		this.lastName = "";
		this.contact = new Contact();
		this.balance = 0;
	}
	public BankAccount(String firstName, String lastName, Contact contact) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		
}
	public BankAccount(String cellPhone, String workPhone,  String address) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = new Contact(cellPhone, workPhone, address);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
//	}
//	public Contact getContact() {
//		return contact;
//	}
//	public void setContact(Contact contact) {
//		this.contact = contact;
	}
	public double getBalance() {
		return balance;
	}
	// deposit
		public boolean deposit(double amount) {
			if(amount>0) {
				balance += amount;
				System.out.println("Amount added succefully" + amount);
				return true;
			}
			return false;
		}
//	} withdraw
		
		
		public boolean withdraw(double amount) {
			if(balance >= amount) {
				balance =- amount;
				System.out.println("Amount withdraw succefully" + amount + "current balance" + balance);
				return true;
			}
				System.out.println("insuffiencet amount");
			
			return false;
			
//	public void setBalance(double balance) {
//		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [firstName=" + firstName + ", lastName=" + lastName + ", contact=" + contact + ", balance="
				+ balance + "]";
	}}
		