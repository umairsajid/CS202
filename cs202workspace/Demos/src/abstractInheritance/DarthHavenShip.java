package abstractInheritance;

public class DarthHavenShip extends Spacecraft {
	
	public DarthHavenShip(int hoverCapacity, double speedInLightYears, String galaxyOfOrigin, boolean probingRoom, double weightInKg){
		this.hoverCapacity = hoverCapacity;
		this.speedInLightYears = speedInLightYears;
		this.galaxyOfOrigin = galaxyOfOrigin;
		this.probingRoom = probingRoom;
		this.weightInKg = weightInKg;
		speedInKmPerHr = 0;
		direction = new Direction();
	}

	@Override
	protected void accelerate(double speedIncrement) {
		speedInLightYears += speedIncrement;
		
	}

	@Override
	protected void steer(double bearing, double angle) {
		direction = new Direction(bearing, angle);
		
	}
	
	public String toString(){
		return "A ship that is the haven for all \"Darths'\" with a hover capacity of " + hoverCapacity + "; Speed in Light Years: " + speedInLightYears + "; Galaxy of Origin: " + 
				galaxyOfOrigin + "; ProbingRoom?: " + probingRoom + "; UFO weighs: " + weightInKg + "; " + direction.toString() + ".";
	}
}
