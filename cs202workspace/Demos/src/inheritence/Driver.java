package inheritence;

public class Driver {

	public static void main(String[] args) {
		Car shredder = new Car(1000, 100, 2400, "gasoline", "Mazda");
		System.out.println(shredder);
		shredder.accelerate(20);
		shredder.steer(270, 15);
		System.out.println(shredder);
	}
}

