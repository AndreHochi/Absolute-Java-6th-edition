package c01p04;

public class sodapop {

	public static void main(String[] args) {

		double weightMouse = .05, weightStart = 80, weightEnd = 60, sweetCan = .001, killMouse = .001, killHuman, numCans;
		
		killHuman = (killMouse/ weightMouse) * weightEnd;
		numCans = killHuman / sweetCan;
		
		System.out.println("Considering it takes " + killMouse + "kg to kill a " + weightMouse + 
						   "kg mouse it should take " + killHuman + "kg to kill a " + weightEnd + 
						   "kg human. This is about " + numCans + " cans of soda. So get to losing some weight you " + weightStart + "kg big guy.");
		

	}

}
