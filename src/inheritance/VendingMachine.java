package inheritance;

import java.util.Arrays;

public class VendingMachine {

	private String location;
	private Product[][] items;

	public VendingMachine() {
		super();
		this.items = new Product[3][3];
		this.location = "";
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Product[][] getItems() {
		return items;
	}

	public boolean addItem(Product p, int row, int col) {
		if (row > 2 || col > 2) {
			System.out.println("The machine size is 3x3, and so you have give index of max 2 for row and col!");
			return false;
		}
		items[row][col] = p;
		return true;
	}

	public boolean sell(int row, int col, boolean pay) {
		if (row > 2 || col > 2) {
			System.out.println("Invalid selection!");
			return false;
		}
		if (!pay) {
			System.out.println("Payment Failed!");
			return false;
		}
		if (items[row][col].getQuantity() < 1) {
			System.out.println("Out of Stock!");
			return false;
		}

		items[row][col].reduceQuantityby1();

		System.out.println("Drop item: " + items[row][col]);
		return true;
	}

	// [0,0], [0,1], [0,2]
	// [1,0], [1,1], [1,2]
	// [2,0], [2,1], [2,2]

	@Override
	public String toString() {
		String temp = "";

		for (Product[] row : items) { // going through rows
			for (Product item : row) {
				temp += item + "\t\t";
			}
			// after each row
			temp += "\n";
		}

		return "VendingMachine [location=" + location + ", items:\n" + temp + "]";
	}

}