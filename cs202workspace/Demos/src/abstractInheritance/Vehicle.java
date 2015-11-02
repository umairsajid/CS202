package abstractInheritance;

public abstract class Vehicle {
	protected double weightInKg;
	protected double speedInKmPerHr;
	protected Direction direction;
	protected String color;

	public String getColor(){return color;}

	protected abstract void accelerate(double speedIncrement);

	protected abstract void register();

	protected abstract void steer(double bearing, double angle);
}

