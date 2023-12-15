package interview;

import java.util.Scanner;

public class scanner { 


	public static void main(String[] args) {
//		Scanner message = new Scanner(System.in);
//		System.out.println("What is your first Name");
//		String name = message.next();
//		
//		System.out.println("What is your age");
//		int age = message.nextInt();
//		
//		System.out.println("What is the total?");
//		int nums = message.nextInt();
		
//		Scanner math = new Scanner(System.in);
//		
//		System.out.println("Enter first ");
//		int a = math.nextInt();
//		System.out.println("Enter the second number ");
//		int b = math.nextInt();
//		int sum = a +b;
//		System.out.println("Totla is: " + sum);
//		
//		Scanner obj = new Scanner(System.in);
//		int sum = 0;
//		int number;
//		
//		do {
//		System.out.println("Enter number");
//		
//		 number = obj.nextInt();
//		 sum= sum+number;
//			
//		}while(number!=1);
//	
//		System.out.println("Total Number is :" + sum);
		
//		Scanner obj = new Scanner(System.in);
//		
//		System.out.println("Enter your number");
//		
//		do {
//			System.out.println("Enter your Number");
//			
//			b = obj.nextInt();
//			 a = a+b;
//		}while(b!=0);
//		System.out.println("Total Number is:" + a);
		
		// what is Scanner?
		// its a class, we are creating it to capture the entries from the keyboard
		// at runtime
		

		// ask the user to enter their user name
		// ask the user to enter their password
		// compare the user name and password
		// if both are correct, print "Valid Credentials!"
		// if any of them are not correct, print "Invalid Credentials!"
		Scanner sc = new Scanner(System.in);
		// we assume that this data was fetched from the database
		String userName = "user123";
		String password = "Pass321$#@";
		
		System.out.println("Please enter your user name: ");
		String userNameEntry = sc.nextLine();

		System.out.println("Please enter your password: ");
		String passwordEntry = sc.nextLine();

		System.out.println("user " + userName.equals(userNameEntry));
		System.out.println("pass " + password.equals(passwordEntry));


//		String tempStars = "";
//
//		for (int i = 0; i < passwordEntry.length(); i++) {
//		tempStars += "*";
//		}
//
//		System.out.println("Your entries: ");
//		System.out.println("User Name: " + userNameEntry);
//		System.out.println("Password: " + tempStars);

		}
		
	}


