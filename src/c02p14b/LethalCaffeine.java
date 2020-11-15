package c02p14b;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LethalCaffeine {

	public static void main(String[] args) {
		
		Scanner fileIn = null;
		
		try {
			
			fileIn = new Scanner(new FileInputStream("D:\\Java_code\\Absolute Java 6th\\src\\c02p14b\\drink.txt"));
			
		}
		
		catch (FileNotFoundException e) {
		
			System.out.println("File not found.");
			System.exit(0);
		
		}
		
		String name;
		double gramsPerDrink, numDrinks;

		name = fileIn.nextLine();
		gramsPerDrink = fileIn.nextDouble();
		
		numDrinks = 10000/gramsPerDrink;
		
		System.out.println("Assuming " + name + " has " + gramsPerDrink + "g per drink then it would take " + numDrinks + " drinks to kill you with caffeine overdose.");
		
	}

}
