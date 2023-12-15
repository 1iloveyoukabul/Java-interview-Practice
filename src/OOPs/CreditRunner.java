package OOPs;

public class CreditRunner {
	public static void main(String[] args) {
		
		
		crediteAccount crd = new crediteAccount("John", "Allen", "98745", 7000);
		crd.printInfo();
		crd.spend(5000);
		 crd.printInfo();
		//crd.printCredite();
		crd.spend(30000);
		crd.printInfo();
		crd.makePayment(50000);
		crd.spend(2000);
		crd.printInfo();

	}
}
