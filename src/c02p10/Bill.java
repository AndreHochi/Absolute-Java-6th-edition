package c02p10;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String name1, name2, name3, junk;
		int quantity1, quantity2, quantity3;
		double price1, price2, price3;
		double total1, total2, total3;
		double subtotal, finalprice;
		
		double sales = .0625;
		
		System.out.println("Input name of item 1:");
		
		name1 = keyboard.nextLine();
		System.out.println(name1);
				
		System.out.println("Input quantity of item 1: ");
		
		quantity1 = keyboard.nextInt();
		System.out.println(quantity1);
		
		System.out.println("Input price of item 1: ");
		
		price1 = keyboard.nextDouble();
		System.out.println(price1);
		junk = keyboard.nextLine();
		
		System.out.println("Input name of item 2: ");
		
		name2 = keyboard.nextLine();
		System.out.println(name2);
				
		System.out.println("Input quantity of item 2: ");
		
		quantity2 = keyboard.nextInt();
		System.out.println(quantity2);
		
		System.out.println("Input price of item 2: ");
		
		price2 = keyboard.nextDouble();
		System.out.println(price2);
		junk = keyboard.nextLine();

		System.out.println("Input name of item 3: ");
		
		name3 = keyboard.nextLine();
		System.out.println(name3);
				
		System.out.println("Input quantity of item 3: ");
		
		quantity3 = keyboard.nextInt();
		System.out.println(quantity3);
		
		System.out.println("Input price of item 3: ");
		
		price3 = keyboard.nextDouble();
		System.out.println(price3);
		
		total1 = quantity1 * price1;
		total2 = quantity2 * price2;
		total3 = quantity3 * price3;
		
		subtotal = (total1 + total2 + total3);
		
		sales = sales * subtotal;
		
		finalprice = (total1 + total2 + total3) + sales;
		
		System.out.printf("%-30s%-10s%-10s%-10s \n", "Item", "Quantity", "Price", "Total");
		System.out.printf("%-30s%-10d%-10.2f%-10.2f \n", name1, quantity1, price1, total1);
		System.out.printf("%-30s%-10d%-10.2f%-10.2f \n", name2, quantity2, price2, total2);
		System.out.printf("%-30s%-10d%-10.2f%-10.2f \n", name3, quantity3, price3, total3);
		System.out.printf("%-30s%-10s%-10s%-10.2f \n", "Subtotal", " ", " ", subtotal);
		System.out.printf("%-30s%-10s%-10s%-10.2f \n", "6.25% sales tax", " ", " ", sales);
		System.out.printf("%-30s%-10s%-10s%-10.2f \n", "Total", " ", " ", finalprice);

		keyboard.close();
		
	}

}
