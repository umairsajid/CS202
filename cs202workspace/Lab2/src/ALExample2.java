import java.util.List;
import java.util.ArrayList;

public class ALExample2 {

	public static void main(String[] args) {
		List<Double> myList = new ArrayList<Double>();
		List<Double> testList = new ArrayList<Double>();
		final double PI = 3.14159;
		double fToCFactor = 5.0/9.0;
		double bodyTemperature = 98.6;
		myList.add(PI);
		myList.add(fToCFactor);
		myList.add(PI);
		testList.add(PI);
		testList.add(fToCFactor);
		testList.add(bodyTemperature);
		for(Double d: testList)
			System.out.println(myList.contains(d)?("The first occurrence of " + d + " in         myList is at position "+ myList.indexOf(d) + 
					" and the last occurrence is at  " + myList.lastIndexOf(d)): 
						"myList does not contain " + d);



	}

}
