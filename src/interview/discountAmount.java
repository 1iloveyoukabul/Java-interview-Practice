package interview;

public class discountAmount {
	public static void main(String []args) {
//		double total = 584.52;
//	String day = "MON";
//		boolean isStudent = true;
//		double salesTaxRate = 11.48 / 100;
//
//		double discountAmount = 0; // ?
//		double totalToPay = 0; // ?
//		double taxAmount = 0;
//		
//		
//		
//		if (day.equals("MON")) {
//		System.out.println("Day discount of 10% is added - " + day);
//		discountAmount = total * 0.1;
//		} else if (day.equals("TUE")) {
//		System.out.println("Day discount of 5% is added - " + day);
//		discountAmount = total * 0.05;
//		} else {
//		System.out.println("Day discount of 2% is added - " + day);
//		discountAmount = total * 0.02;
//		}
//
//		if (isStudent) {
//		// this customer is a student - give 15% discount
//		System.out.println("Student discount of 15% added!");
//		discountAmount += total * 0.15;
//		} else {
//		// this customer is not a student - give no student discount
//		System.out.println("No Student discount is added!");
//		}
//
//		totalToPay = total - discountAmount;
//		taxAmount = totalToPay * salesTaxRate;
//         totalToPay += taxAmount;
//         
//		System.out.println("Total Ammount: \t\t$" + total);
//		System.out.println("Disount Ammount: \t$" + discountAmount);
//		System.out.println("Tax Ammount: \t\t$" + taxAmount);
//		System.out.println("Total after discount: \t$" + totalToPay); 
		
		double total = 5000;
		String day = "Monday";
		boolean isStudent = true;
		double salseTax = 10.5;
		
		double discountAmount = 0;
		double totalTpay = 0;
		double taxAmount = 0;
//
		
		
		if(day.equals("Monday")) {
			System.out.println("Discount of the day is 10 %" + day);
			discountAmount = total *0.1;
			
			
		}else if(day.equals("Tue")) {
			System.out.println("Discount of the day is 12 %" + day);
			discountAmount = total * 0.12;
			
		}else {
			System.out.println("Add 2% Discount");
			discountAmount = total * 0.2;
		}
			if(isStudent) {
				System.out.println("15% discount for student" +isStudent);
				discountAmount = total * 0.15;
			}else {
				System.out.println("No Student dicount added");
			}
			totalTpay = total- discountAmount;
			taxAmount = totalTpay*salseTax;
//			totalTpay  += taxAmount;
			
			System.out.println("Total Ammount: " + total);
			System.out.println("Discount Ammount: " + discountAmount);
			System.out.println("Tax Amount: " + taxAmount);
			System.out.println("Total Ammount: " + totalTpay);
			
			
				
		}

	}


