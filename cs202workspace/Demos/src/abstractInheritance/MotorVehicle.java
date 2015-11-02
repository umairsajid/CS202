package abstractInheritance;

public abstract class MotorVehicle extends Vehicle {
	protected double engineDisplacementInCc;
	protected String fuelType;
	protected String manufacturer;

	public void register() {
		System.out.println("Registered " + manufacturer + " vehicle with DMV");
	}
}

