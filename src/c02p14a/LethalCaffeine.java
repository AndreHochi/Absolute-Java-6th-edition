package c02p14a;

import java.util.Scanner;

public class LethalCaffeine {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		double gramsPerDrink, numDrinks;
		
		System.out.println("Give the name of your drink then give the amount of grams of caffeine in the Drink.");
		
		name = keyboard.nextLine();
		gramsPerDrink = keyboard.nextDouble();
		
		numDrinks = 10000/gramsPerDrink;
		
		System.out.println("Assuming " + name + " has " + gramsPerDrink + "g per drink then it would take " + numDrinks + " drinks to kill you with caffeine overdose.");
		
				
	}

}
