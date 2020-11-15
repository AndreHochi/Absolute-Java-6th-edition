package c02p09;

import java.util.Scanner;

public class HateAndLove {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String speech;
		
		speech = keyboard.nextLine();
		
		System.out.println("From the sentence, " + speech);		
		speech = speech.replace("hate", "love");
		System.out.println("We now have, " + speech);
		
		keyboard.close();
		
	}

}
