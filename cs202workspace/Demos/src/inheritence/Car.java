package inheritence;

public class Car extends MotorVehicle{

	private double throttleSetting;
	private String manufacturer;

	//public Car(){}

	public Car(double weightInKgIn, double speedIn, double displacementIn, String fuelTypeIn, String manufacturerIn){
		super(weightInKgIn, speedIn, displacementIn, fuelTypeIn);
		manufacturer = manufacturerIn;
		throttleSetting = 0;

	}

	@Override
	protected void accelerate(double speedIncrement){
		double origSpeed = speedInKmPerHr;
		while(speedInKmPerHr < origSpeed + speedIncrement && throttleSetting <= 10){
			graduallyOpenThrottle(speedIncrement);

		}
		// then close the throttle a little, etc.
	}

	private void graduallyOpenThrottle(double speedIncrement){
		// use your imagination.  This is a cheap example
		throttleSetting = 3;
		speedInKmPerHr += speedIncrement;
	}

	public String toString(){
		return "Manufacturer; " + manufacturer + ": throttle; " + throttleSetting + ": \n" + super.toString();
	}
}

