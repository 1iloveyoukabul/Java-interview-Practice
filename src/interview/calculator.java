package interview;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a number: ");
		int entery1 = sc.nextInt();
		
		System.out.println("Please Entery another Number: ");
		int entery2 = sc.nextInt();
		
		System.out.println("Pease choss from the follwing Opertors");
		System.out.println("1 : +");
		System.out.println("2 : *");
		System.out.println("3 : -");
		System.out.println("4 : %");
		System.out.println("5 : /");
		
		int operator = sc.nextInt();
		switch(operator) {
		case 1:
			System.out.println(entery1 + entery2 +(entery1 + entery2));
			break;
		case 2:
			System.out.println(entery1 + entery2 +(entery1 * entery2));
			break;
		case 3:
			
			System.out.println(entery1 + entery2 +(entery1 - entery2));
			break;
		case 4:
			System.out.println(entery1 + entery2 +(entery1 % entery2));
			break;
		case 5:
			System.out.println(entery1 + entery2 +(entery1 / entery2));
			default:
				
				System.out.println("Invalid Number");
		}

		
		

	}

}
