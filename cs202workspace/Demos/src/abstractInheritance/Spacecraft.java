package abstractInheritance;

public abstract class Spacecraft extends Vehicle {
	// this class could have a hierarchy of abstract and concrete classes under it
	protected int hoverCapacity;
	protected double speedInLightYears;
	protected String galaxyOfOrigin;
	protected boolean probingRoom;
	
	public void register() {
		System.out.println("This spacecraft from the " + galaxyOfOrigin + " galaxy has been officially registered by the InterGalactic Police.");
	}
	
	}

