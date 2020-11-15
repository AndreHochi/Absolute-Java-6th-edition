package c02p03;

import java.util.Scanner;

public class divide {

	public static void main(String[] args) {
	
		int dividend;
		int divisor;
		int quotient;
		int remainder;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your dividend then enter the divisor.");
		
		dividend = keyboard.nextInt();
		divisor = keyboard.nextInt();
		
		quotient = dividend / divisor;
		remainder = dividend % divisor;
		
		System.out.println("The dividend is " + dividend);
		System.out.println("The divisor is " + divisor);
		System.out.println("The quotient is " + quotient);
		System.out.println("The remainder is " + remainder);
		
		keyboard.close();
		
	}
	
}
