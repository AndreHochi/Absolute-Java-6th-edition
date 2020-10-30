package c01p09;

public class IdealBodyweight {

	public static void main(String[] args) {

		int feet = 6;
		int inches = 3;
		int ideal;
		
		ideal = (feet - 5) * 12 * 5 + (inches * 5) + 110;
		
		System.out.println("Assuming you are " + feet + " feet and " + inches + " inches tall your ideal bodyweight is " + ideal + " pounds");
		
	}

}
