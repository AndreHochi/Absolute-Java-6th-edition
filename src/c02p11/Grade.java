package c02p11;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Grade {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat pattern = new DecimalFormat("###.00");
		
		
		String name1, name2, name3, junk;
		int earned1 , earned2, earned3;
		int possible1, possible2, possible3;
		int totalearned, totalpossible;
		double grade;
		
		System.out.println("Input name of exersize 1:");
		
		name1 = keyboard.nextLine();
		System.out.println(name1);
				
		System.out.println("Input points recieved for exersize 1: ");
		
		earned1 = keyboard.nextInt();
		System.out.println(earned1);
		
		System.out.println("Input total possibe points for exersize 1: ");
		
		possible1 = keyboard.nextInt();
		System.out.println(possible1);
		junk = keyboard.nextLine();
		
		System.out.println("Input name of exersize 2:");
		
		name2 = keyboard.nextLine();
		System.out.println(name2);
				
		System.out.println("Input points recieved for exersize 2: ");
		
		earned2 = keyboard.nextInt();
		System.out.println(earned2);
		
		System.out.println("Input total possibe points for exersize 2: ");
		
		possible2 = keyboard.nextInt();
		System.out.println(possible2);
		junk = keyboard.nextLine();
		
		System.out.println("Input name of exersize 3:");
		
		name3 = keyboard.nextLine();
		System.out.println(name3);
				
		System.out.println("Input points recieved for exersize 3: ");
		
		earned3 = keyboard.nextInt();
		System.out.println(earned3);
		
		System.out.println("Input total possibe points for exersize 3: ");
		
		possible3 = keyboard.nextInt();
		System.out.println(possible3);
		junk = keyboard.nextLine();
		
		totalearned = earned1 + earned2 + earned3;
		totalpossible = possible1 + possible2 + possible3;
		grade = (totalearned / totalpossible) * 100;
		
		System.out.printf("%30s%10s%10s \n", "Exercize", "Score", "Total Possible");
		System.out.printf("%30s%10d%10d \n", name1, earned1, possible1);
		System.out.printf("%30s%10d%10d \n", name2, earned2, possible2);
		System.out.printf("%30s%10d%10d \n", name3, earned3, possible3);
		System.out.printf("%30s%10d%10d \n", "Total", totalearned, totalpossible);
		System.out.printf("Your total is "+ totalearned + " out of " + totalpossible + " or ");
		System.out.println(pattern.format(grade) + "%.");

		

		keyboard.close();
	}

}
