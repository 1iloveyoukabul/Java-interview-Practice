package inheritance;

public class VendingRunner {
	
	public static void main(String[] args) {
		
		VendingMachine machine1 = new VendingMachine();
		machine1.setLocation("Falls Church, VA");
		// row 1
		machine1.addItem(new Product("M&M", 4.99, 15), 0, 0);
		machine1.addItem(new Product("KitKat", 2.5, 8), 0, 1);
		machine1.addItem(new Product("Sneakers", 3.5, 18), 0, 2);
		
		// row 2
		machine1.addItem(new Product("Cliff", 3.8, 5), 1, 0);
		machine1.addItem(new Product("Lays", 1.8, 15), 1, 1);
		machine1.addItem(new Product("Twix", 1.5, 12), 1, 2);
		
		// row 3
		machine1.addItem(new Product("RedBull", 2.99, 6), 2, 0);
		machine1.addItem(new Product("CokeZero", 1.99, 4), 2, 1);
		machine1.addItem(new Product("Water", 0.99, 7), 2, 2);
		
	
		System.out.println(machine1);
	
		
		machine1.sell(0, 0, true);
		machine1.sell(2, 2, true);
		machine1.sell(2, 2, true);
		machine1.sell(2, 2, true);
		machine1.sell(2, 2, true);
		machine1.sell(2, 2, true);
		machine1.sell(2, 2, true);
		machine1.sell(2, 2, true);
		machine1.sell(2, 2, true);
		
		
	}
}

