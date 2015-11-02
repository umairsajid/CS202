package abstractInheritance;

public class Car extends MotorVehicle {

	public Car(String manufacturerIn, double weightInKgIn, double displacementIn, String fuelTypeIn){
		manufacturer=manufacturerIn;
		weightInKg = weightInKgIn;
		engineDisplacementInCc = displacementIn;
		fuelType = fuelTypeIn;
		speedInKmPerHr = 0;
		direction = new Direction();
	}

	@Override
	protected void steer(double bearing, double angle) {
		// replace the following with code to steer a car
		direction = new Direction(bearing, angle);
	}

	@Override
	protected void accelerate(double speedIncrement) {
	// replace the following with code to accelerate like a car
		speedInKmPerHr += speedIncrement;
	}

	public String toString() {
		return  manufacturer + " car with a " + engineDisplacementInCc + " cc " + fuelType + " engine weighs " + 		weightInKg + " kg and is going " + speedInKmPerHr +" KPH "  + direction.toString();
	}
}
