package c02p02;

import java.util.Scanner;

public class pig_latin {

	public static void main(String[] args) {
		
		String nameFirst;
		String nameLast; 
		String pigLatin;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your first name then enter your last name");

		nameFirst = keyboard.next();
		nameLast = keyboard.next();
		
		pigLatin = nameFirst.substring(1,2).toUpperCase() + nameFirst.substring(2) + nameFirst.substring(0,1) + "ay" + " " + nameLast.substring(1,2).toUpperCase() + nameLast.substring(2) + nameLast.substring(0,1) + "ay";
		
		System.out.println("For first name " + nameFirst + " and last name " + nameLast + " your pig latin name is " + pigLatin);

		keyboard.close();

	}

}
