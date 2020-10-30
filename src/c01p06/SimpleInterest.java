package c01p06;

public class SimpleInterest {

	public static void main(String[] args) {
		
		double princi_amnt = 1000;
		double int_rate = .05;
		double no_of_yrs = 5;
		double sim_int;

		sim_int = (princi_amnt * int_rate * no_of_yrs)/100;
				
		System.out.println("From the principal amount of " +
						   princi_amnt + " and the inital interest rate of " +
						   int_rate + " and the number of years being " +
						   no_of_yrs + " the simple interest is "+
						   sim_int);
		
	}

}
