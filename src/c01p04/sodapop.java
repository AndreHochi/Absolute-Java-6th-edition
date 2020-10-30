package c01p04;

public class sodapop {

	public static void main(String[] args) {

		double weightMouse = .05;
		double weightStart = 80;
		double weightEnd = 60;
		double sweetCan = .001;
		double killMouse = .001;
		double killHuman;
		double numCans;
		
		killHuman = (killMouse/ weightMouse) * weightEnd;
		numCans = killHuman / sweetCan;
		
		System.out.println("Considering it takes " + killMouse + "kg to kill a " + weightMouse + 
						   "kg mouse it should take " + killHuman + "kg to kill a " + weightEnd + 
						   "kg human. This is about " + numCans + " cans of soda. So get to losing some weight you " + weightStart + "kg big guy.");
		

	}

}
