package c02p08;

import java.util.Scanner;

public class ThreeWords {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Type in 3 words seperated by commas.");
		
 		keyboard.useDelimiter("\\D");
		
		String w1;
		String w2;
		String w3;
		
		w1 = keyboard.next();
		w2 = keyboard.next();
		w3 = keyboard.next();

		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);

		keyboard.close();
		
	}

}
