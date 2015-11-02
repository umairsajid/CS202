package inheritence;

public class Direction {
	private double bearing, angleToGround;

	public Direction(double bearingIn, double angleIn){
		bearing = bearingIn;
		angleToGround = angleIn;
	}

	public void setDirection(double bearingIn, double angleIn){
		bearing = bearingIn;
		angleToGround = angleIn;
	}

	// setters and getters omitted

	public String toString(){
		return "Bearing: " + bearing + ": Angle: " + angleToGround;
	}
}

