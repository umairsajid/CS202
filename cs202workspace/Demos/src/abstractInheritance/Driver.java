package abstractInheritance;

public class Driver {

	public static void main(String[] args) {
		Vehicle shredder = new Car("Mazda", 1000, 1900, "gasoline");
		System.out.println(shredder);
		shredder.register();
		shredder.accelerate(20);
		shredder.steer(270, 0);
		System.out.println(shredder);

		System.out.println();
		Vehicle hindenburg = new Motorcycle("BMW", 230, 594, "gasoline");
		hindenburg.steer(70, 0);
		hindenburg.accelerate(90);
		System.out.println(hindenburg);

		System.out.println();
		Vehicle porky = new Motorcycle("Harley-Davidson", 400, 1200);
		porky.accelerate(150);
		porky.steer(180, 45);
		System.out.println(porky);
		
		System.out.println();
		Vehicle abductor = new UFO(3200, 34, "Milky Way", true, 50000);
		abductor.register();
		abductor.accelerate(2);
		abductor.steer(360, 75);
		System.out.println(abductor);
		
		System.out.println();
		Vehicle partyShip = new DarthHavenShip(42000, 234, "Empire of the Darths'", false, 67000000);
		partyShip.accelerate(56);
		partyShip.steer(630, 134);
		System.out.println(partyShip);
	}

}

