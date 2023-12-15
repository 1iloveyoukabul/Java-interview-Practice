package interview;

import java.awt.geom.Arc2D.Double;

public class substring { 

	public static void main(String[] args) {
//		double num = 1099.99;
//		int quantity = 5;
//		double total = num * 5;
//		double taxable = total * 6 /100 + total;
//		
//		System.err.println(taxable);
//				
//		double itemPrice = 1099.99;
//		int quantity = 5;
//		double amount = itemPrice * quantity;
//		System.out.println("Price before tax: " +amount);
//		
//		double taxableAmount = amount * 6 /100;
//		System.out.println("Total Tax Amoun: " + taxableAmount);
//		
//		double TotalAmount = taxableAmount + amount;
//		System.out.println("Payable Amount: "+ TotalAmount);
		//Create main method
		//Create variable applePrice = 1.12; 
		//Create variable orangePrice = 0.99;
		//Create variable appleQuantity = 9.5; 
		//Create Variable orangeQuantity = 12.34; 
		// Find sub-total
		// add 2.43% tax
		// Print total payable amount;
//		System.out.println("===============================================================================");
//		
//        double applePrice = 1.12;
//        double appleQuantity = 9.5;
//        
//        double orangePrice = 0.99;
//        double orangeQuanity = 12.34;
//        
//        double appleAmount = applePrice * appleQuantity;
//        double orangeAmount = orangePrice * orangeQuanity ;
//        
//        double subtotal = appleAmount + orangeAmount;
//        System.out.println("Subtotal Amount: " + subtotal);
//        double payTax = subtotal * 2.43 /100;
//        
//        System.out.println("Tax: " + payTax  );
//        double FruitTotalAmount = subtotal + payTax;
//        System.out.println("Payable Amount: " +FruitTotalAmount);
//		
//		double mous = 60;
//		double quantity = 6;
//		double total = mous * quantity;
//		System.out.println(total);
//		
//		double taxPercentage = 6;
//		double subtotal = taxPercentage* total /100;
//		System.out.println(subtotal);
//		
//		double taxtamount = total * 6/100 ;
//		System.out.println(taxtamount);
//double subtotalAMount = total + taxtamount;
//System.out.println(subtotalAMount);


//double nums = 50 % 3;
//System.out.println(nums);
		
		// substring
//		String index = "alexandria";
		//int length = indexNumber.length();
		//System.out.println(length);
		
		
//		
//		String strs = index.substring(3);
//		System.out.println(strs);
//
//		String fullAddress = "85962 Taney Avenue, Fall Church , CA , 56219";
//		String street = fullAddress.substring(0, 19);
//		
//		System.out.println("Street: " + street);
//		String city = fullAddress.substring(20, 33);
//		System.out.println("City: " +city);
//		
//		String state = fullAddress.substring(34, 39);
//		System.out.println("State :" + state);
//		
//		String zipCode = fullAddress.substring(39, 44);
//		System.out.println(zipCode);
//		System.out.println(fullAddress);
//		//find first, middle and last letter in above String.
		
//How to find date year, month and day
//	String date = "03-05-2023";
//     String year = date.substring(6);
//     System.out.println("Year:" + year);
//     String day = date.substring(4, 5);
//     System.out.println("Day:" + day);
//     String month = date.substring(0, 2);
//     System.out.println("Month:" + month);

    // Find a blank space.
     // differnce isEmpty will return fals if there is space inide ther String " "
     // isBlank will return true if there is space inside the String "   "
//     String blankSpace = " ";
//     
//     boolean city = blankSpace.isEmpty();// use isEmpty method if u want check the String is empty or not
//     System.out.println(city);
//		
//     String space = " Allen";
//     boolean space1 = space.isBlank();
//     System.out.println(space1);
//    
//     String str = "Richmond";
//     String strs = str.substring(2);
//     System.out.println(strs);
//     
//     String index1 = "Richmond";
//     int index2 = index1.indexOf("h");
//     System.out.println(index2);

//		String TextLength = "Afghanistan";
//		int a = TextLength.length();
//		System.out.println(a);
//		String b = TextLength.substring(0, 5);
//		System.out.println(b);
//		
//		System.out.println(TextLength.substring(3));
   
//		String message = "Wellcome to Tekschool";
//		int message1 = message.length();
//		System.out.println(message1);
//		char message2 = message.charAt(6);
//		System.out.println("Charctar number 6 is " + message2);
//		String message3 = message.toUpperCase();
//		System.out.println(message3);
//		
       // Finding Grades 
//		double grade = 70;
//		String grading = " ";
//		if(grade>= 90) {
//			grading = "A";
//		}else if(grade>= 80) {
//			grading = "B";
//		}else if(grade>= 70) {
//			grading = "C";
//			System.out.println(grading);
//			
//			System.out.println("*********************************************************************");
			
			double carSpeed = 89;
			String speedingTicketIs = " ";
			if(carSpeed>= 100) {
				speedingTicketIs = "Reckless driving.";
			}else if(carSpeed>= 90) {
				speedingTicketIs = "Speeding Ticket.";
			}else if(carSpeed>= 78) {
				speedingTicketIs = "Warrning.";
			}
				System.out.println("Driver disobeyed the traffic law:" + speedingTicketIs);
				
				
				System.out.println("=====================================================");
				
				double temperature = 0;
				String temp = " ";
				if(temperature>= 100) {
					temp = "Very Hot Outside";
				}else if(temperature>= 90) {
				}
					String str = " ";// it still return fals
					boolean str1 = str.isEmpty();
					System.out.println(str1);
					
					String message = "Welcome to TekSchool"; //it still return true becase there blank space insid quotations
					boolean message1 = message.isBlank();
					System.out.println(message1);
					
					String char1 = "Welcome to TekSchool";
					char b = char1.charAt(5);
					System.out.println(b);
					
					String submessage = char1.substring(0, 6).toUpperCase();
					System.out.println(submessage);
					
					int age = 21;
					int age1 = 22;
					if( age>age1) {
						System.out.println("You can drive age is " + age);
					}else {
						System.out.println("Under the age can not dirve ");
					}
					
					String mess = "Wellcome to School";
					int mes = mess.indexOf("e");
					System.out.println("litter e " + mes);
					
					String mess1 = mess.substring(1);
					
					System.out.println(mess1);
					
					String mess2 = mess.substring(0, 7).toUpperCase();
					//System.out.println(mess2);
				}
	
				
			}
			
		
            
		
		
	


