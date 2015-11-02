package inheritence;

public class Vehicle {
	private double weightInKg;
	protected double speedInKmPerHr;
	protected Direction direction;

	//public Vehicle(){}

	public Vehicle(double weightInKgIn, double speedIn){
		weightInKg = weightInKgIn;
		speedInKmPerHr = speedIn;
		direction = new Direction(0,0);
	}

	protected void steer(double bearing, double angle){
		direction.setDirection(bearing, angle);
	}

	protected void accelerate(double speedIncrement){
		speedInKmPerHr += speedIncrement;
	}

	public String toString(){
		return "vehicle weighs " + weightInKg + " kg: is going " + speedInKmPerHr +": /n"  + direction.toString() + "\n";
	}
}

