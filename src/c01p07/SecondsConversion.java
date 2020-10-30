package c01p07;

public class SecondsConversion {

	public static void main(String[] args) {
		
		int startingSeconds = 50391;
		int hours;
		int minutes;
		int leftoverSeconds;

		hours = startingSeconds / 3600;
		leftoverSeconds = startingSeconds % 3600;
		minutes = leftoverSeconds / 60;
		leftoverSeconds = leftoverSeconds % 60;
		
		System.out.println(startingSeconds + " seconds converts in to " + hours + " hours " + minutes + " minutes and " + leftoverSeconds + " seconds.");
		
	}

}
