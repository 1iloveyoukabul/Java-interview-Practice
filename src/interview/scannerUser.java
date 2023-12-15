package interview;

import java.util.Scanner;

public class scannerUser {
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
//		
//        String useNam = "user123";// result will be true
//        String password = "pass123";
//        
//        System.out.println("Please Enter Usre Name ");
//        String userEntr = scr.next();
//        
//        System.out.println("Please Enter Password");
//        String PasswordEntr = scr.next();
//        
//        System.out.println("User Enter: " + useNam.equals(userEntr));
//        System.out.println("Password Enter: " +password.equals(PasswordEntr));
		
		// created user and password
//		String user = "123";
//		String password = "hello";
//		
//		System.out.println("Pease Enter your user");
//		String userInfo = scr.next();
//		
//		System.out.println("Please Entery your password");
//		String passInfo = scr.next();
//		
//		System.out.println("Usre Info " + user.equals(userInfo));
//		System.out.println("Password Info " + passInfo.equals(password));
		
		
		

		// event controlled while loop
		// this is a loop that is waiting for an event to occur to stop

		// the condition is that if the entry is not stop, then continue looping
		String entry = " ";

		// while (true ) { body } if the condition is true, we run the loop
		//

		while(entry.equals("stop") == false) {
		entry = scr.nextLine();
		
         System.out.println(entry);
		
		}
		
	}}

