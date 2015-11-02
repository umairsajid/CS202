import java.util.List;
import java.util.ArrayList;

public class ALExample1 {

	public static void main(String[] args) {
		// create the list 
		List<Integer> myList = new ArrayList<Integer>();
		// add items to the list
		for(int counter = 0; counter < 10; counter++)
			myList.add(counter);
		// print the items in the list
		for(Integer i: myList) 
			System.out.println(i);
		// add another item to the list, then print
		myList.add(10);
		for(Integer i: myList) 
			System.out.println(i);
		// delete an item from the list, then print
		myList.remove(0);
		for(Integer i: myList) 
			System.out.println(i);
	}

}
