package abstractInheritance;

public class Direction {
	private double bearing, angleToGround;

	public Direction(){}

	public Direction(double bearingIn, double angleIn){
		bearing = bearingIn;
		angleToGround = angleIn;
	}

	public void setDirection(double bearingIn, double angleIn){
		bearing = bearingIn;
		angleToGround = angleIn;
	}

	public String toString(){
		return "Bearing: " + bearing + ": Angle: " + angleToGround;
	}
}
