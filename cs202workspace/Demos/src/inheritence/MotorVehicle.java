package inheritence;

public class MotorVehicle extends Vehicle {
	private double engineDisplacementInCc;
	private String fuelType;

//	public MotorVehicle(){
//		// this one implicitly calls Vehicle's constructor
//	}

	public MotorVehicle(double weightInKgIn, double speedIn, double displacementIn, String fuelTypeIn){
		super(weightInKgIn, speedIn);
		engineDisplacementInCc = displacementIn;
		fuelType = fuelTypeIn;
	}

	// also override steer() to change direction in a way appropriate for a car

	//getters and setters omitted

	public String toString(){
		return "engine displacement; " + engineDisplacementInCc + ": fuelType; " + fuelType + ": \n" + super.toString();

	}
}

