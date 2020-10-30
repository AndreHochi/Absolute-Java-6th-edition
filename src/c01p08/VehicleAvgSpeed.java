package c01p08;

public class VehicleAvgSpeed {
	
	public static final double distance = 180;
	
	public static void main(String[] args) {
		
		double time;
		double averageSpeed;
		
		System.out.println("This program calculates vehicle average speed given a time and distance traveled.");
		time = 20.5;
		averageSpeed = distance / time;
		System.out.println("Car average speed is " + averageSpeed + " miles per hour.");
		
	}
	
}
