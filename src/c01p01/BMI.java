package c01p01;

/*Chapter 1, Programming Project 1
 * Write a program that calculates and outputs the BMI. 
 * Assume various input values wherever required.
 */

public class BMI {

	public static void main(String[] args) {
		
		float weight = 135;
		float height = 10;
		float bmi;
		
		bmi = weight/(height * height);
		System.out.println("For the weight of " + weight + "kg, and the height of " + height + "m, the BMI is " + bmi + ".");
		

	}

}
