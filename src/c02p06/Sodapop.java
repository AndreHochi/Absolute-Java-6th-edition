package c02p06;

import java.util.Scanner;

public class Sodapop {
	
	public static void main(String[] args) {
		
		double weightMouse, weightEnd, killMouse, killHuman, numCans, sweetCan = .001;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the amount in kgs the weight of the mouse, the weight of the sweetener used to kill the mouse, and your weight.");
		
		weightMouse = keyboard.nextDouble();
		killMouse = keyboard.nextDouble();
		weightEnd = keyboard.nextDouble();
		
		killHuman = (killMouse/ weightMouse) * weightEnd;
		numCans = killHuman / sweetCan;
		
		System.out.println("Considering it takes " + killMouse + "kg to kill a " + weightMouse + 
						   "kg mouse it should take " + killHuman + "kg to kill a " + weightEnd + 
						   "kg human. This is about " + numCans + " cans of soda.");
		
		keyboard.close();
		
	}

}
