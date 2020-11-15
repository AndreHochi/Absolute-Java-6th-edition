package c02p13;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Weight {

	public static void main(String[] args) {

		Scanner fileIn = null;
		
		try {
		
			fileIn = new Scanner(new FileInputStream("D:\\Java_code\\Absolute Java 6th\\src\\c02p13\\Weights.txt"));
		
		}
		
		catch (FileNotFoundException e) {
		
			System.out.println("File not found.");
			System.exit(0);

		}
		
		String name, junk;
		
		
		int feet, inches, ideal;
		
		name = fileIn.nextLine();
		feet = fileIn.nextInt();
		inches = fileIn.nextInt();
		
		ideal = (feet - 5) * 12 * 5 + (inches * 5) + 110;
		
		System.out.println(name + ", Assuming you are " + feet + " feet and " + inches + " inches tall your ideal bodyweight is " + ideal + " pounds.");
		
		junk = fileIn.nextLine();
		
		name = fileIn.nextLine();
		feet = fileIn.nextInt();
		inches = fileIn.nextInt();
		
		ideal = (feet - 5) * 12 * 5 + (inches * 5) + 110;
		
		System.out.println(name + ", Assuming you are " + feet + " feet and " + inches + " inches tall your ideal bodyweight is " + ideal + " pounds.");
		
		junk = fileIn.nextLine();
		
		name = fileIn.nextLine();
		feet = fileIn.nextInt();
		inches = fileIn.nextInt();
		
		ideal = (feet - 5) * 12 * 5 + (inches * 5) + 110;
		
		
		System.out.println(name + ", Assuming you are " + feet + " feet and " + inches + " inches tall your ideal bodyweight is " + ideal + " pounds.");

	}

}
