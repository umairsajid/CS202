import java.util.ArrayList;

public class Test {


	public static void main(String[] args) {
		ArrayList<Ellipsoid> test = new ArrayList<Ellipsoid>();
		
		test.add(new Ellipsoid(32.65, 45.2, 12.98));
		test.add(new Ellipsoid(77.77, 28.62, 17.34));
		
		System.out.println(test.get(1).getRadius1());
		System.out.println(test.get(1).getRadius2());
		System.out.println(test.get(1).getRadius3());
		System.out.println(test.get(1).getArea());

	}

}
