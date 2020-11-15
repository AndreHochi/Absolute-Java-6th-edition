package c02p12;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LoveAndHate {
	
	public static void main(String[] args) {
		
		Scanner fileIn = null;
		
		try {
		
			fileIn = new Scanner(new FileInputStream("D:\\Java_code\\Absolute Java 6th\\src\\c02p12\\text.txt"));
		
		}
		
		catch (FileNotFoundException e) {
		
			System.out.println("File not found.");
			System.exit(0);
		
		}
		
		String speech;
		
		speech = fileIn.nextLine();
		
		System.out.println("From the sentence, " + speech);		
		speech = speech.replace("hate", "love");
		System.out.println("We now have, " + speech);
		
	}
	
}
