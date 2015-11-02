package abstractInheritance;

public class Motorcycle extends MotorVehicle {

	public Motorcycle(String manufacturerIn, double weightInKgIn, double displacementIn, String fuelTypeIn){
		manufacturer=manufacturerIn;
		weightInKg = weightInKgIn;
		engineDisplacementInCc = displacementIn;
		fuelType = fuelTypeIn;
		speedInKmPerHr = 0;
		direction = new Direction();
	}

	public Motorcycle(String manufacturerIn, double weightInKgIn, double displacementIn){
		manufacturer=manufacturerIn;
		weightInKg = weightInKgIn;
		engineDisplacementInCc = displacementIn;
		fuelType = "gasoline";
		speedInKmPerHr = 0;
		direction = new Direction();
	}

	@Override
	protected void accelerate(double speedIncrement) {
	// replace the following with code to accelerate like a motorcycle
		speedInKmPerHr += speedIncrement;
	}

	@Override
	protected void steer(double bearing, double angle) {
	// replace the following with code to steer a motorcycle
		direction=new Direction(bearing, angle);
	}

	public String toString() {
		return  manufacturer + " motorcycle with a " + engineDisplacementInCc + " cc " + fuelType + " engine weighs " + weightInKg + " kg and is going " + 			speedInKmPerHr +" KPH "  + direction.toString();
	}
}
