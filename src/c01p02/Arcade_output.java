package c01p02;

public class Arcade_output {

	public static void main(String[] args) {
		
		int startingCoupons = 57;
		int conversionCandies = 10;
		int conversionGumballs = 3;
		int numCandies;
		int numGumballs;
		int numCoupons;		
		
		numCandies = startingCoupons / conversionCandies;
		numCoupons = startingCoupons % conversionCandies;
		numGumballs = numCoupons / conversionGumballs;
		numCoupons = numCoupons % conversionGumballs;
		
		System.out.println("For " + startingCoupons + " coupons you can get " + numCandies + " candy bars, " + numGumballs + " gumballs, and have " + numCoupons + " coupons left over.");

		
	}

}
