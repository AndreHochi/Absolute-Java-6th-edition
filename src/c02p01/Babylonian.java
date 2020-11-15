package c02p01;

import java.util.Scanner;

public class Babylonian {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number to be square rooted.");
		
		float n = keyboard.nextInt();
		float guess = n/2;
		
		float r;
		
		r = n / guess;
		guess = (guess + r)/2;
		r = n / guess;
		guess = (guess + r)/2;
		r = n / guess;
		guess = (guess + r)/2;
		r = n / guess;
		guess = (guess + r)/2;
		r = n / guess;
		guess = (guess + r)/2;
		r = n / guess;
		guess = (guess + r)/2;
		
		System.out.printf("The square root is %.2f", guess);
		
		keyboard.close();
		
	}
	
}
