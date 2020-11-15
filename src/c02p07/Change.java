package c02p07;

import java.util.Scanner;

public class Change {
	public static void main(String[] args) {
		
		int change;
		int quarter;
		int dime;
		int nickle;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter price of item\r\n (from 25 cents to a dollar, in 5-cent increments):");
		
		change = keyboard.nextInt();
		
		quarter = change / 25;
		change = change % 25;
		dime = change / 10;
		change = change % 10;
		nickle = change / 5;
		
		System.out.println("You bought an item for 45 cents and gave me a dollar,");
		System.out.println("so your change is");
		System.out.println(quarter + " quarters");
		System.out.println(dime + " dime");
		System.out.println(nickle + " nickle");
		
		keyboard.close();
		
	}
}
