package c02p05;

import java.util.Scanner;

public class GPA {
	
	public static void main(String[] args) {
		
		float percentage;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Insert your percentage.");
		
		percentage = keyboard.nextFloat();
		
		percentage = (percentage/100)*4;
		
		System.out.printf("Your gpa is %.0f", percentage);
		
		keyboard.close();
		
	}

}
