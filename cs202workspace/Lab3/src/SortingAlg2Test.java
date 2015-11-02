import java.util.ArrayList;
import java.util.Collections;

public class SortingAlg2Test {
	/*create a sorting algorithm from the following:
	 * 
	 * starting from the end of the list:		
	 * for each element in the list going backwards
	 * find the minimum element of the list
	 * exchange the minimum element with the current element
	 * NOTE: When finding the minimum, you should only search from your current position, to the beginning of the list.
	 */
	public static void main(String[] args) {
		ArrayList<Double> listOfDoubles = new ArrayList<Double>();
		
		double number1 = 234.54;
		double number2 = 789.35;
		double number3 = 541.76;
		double number4 = 980.09;
		double number5 = 101.75;
		double number6 = 1291.54;
		double number7 = 421.49;
		double number8 = 601.69;
		double number9 = 399.21;
		double number10 = 903.54;
		
		listOfDoubles.add(number1);
		listOfDoubles.add(number2);
		listOfDoubles.add(number3);
		listOfDoubles.add(number4);
		listOfDoubles.add(number5);
		listOfDoubles.add(number6);
		listOfDoubles.add(number7);
		listOfDoubles.add(number8);
		listOfDoubles.add(number9);
		listOfDoubles.add(number10);
		
		for(int i = 0; i < 10; i++){
			System.out.println(listOfDoubles.get(i));
		}
		
		System.out.println();
		
//		double minimum = Double.MAX_VALUE;
		
		boolean stop = false;
		int swapCount = 0;
		int comparisonCount = 0;
		
		while(stop == false){			
		for(int i = 9; i >= 1; i--){			
			listOfDoubles.get(i).compareTo(listOfDoubles.get(i - 1));
			comparisonCount++;
			if(listOfDoubles.get(i - 1) < listOfDoubles.get(i)){	
				double temp = listOfDoubles.get(i);
				listOfDoubles.set(i, listOfDoubles.get(i-1));
				listOfDoubles.set(i-1, temp);
				swapCount++;
			}
		}
		if(listOfDoubles.get(9) < listOfDoubles.get(8) && listOfDoubles.get(8) < listOfDoubles.get(7) && listOfDoubles.get(7) < listOfDoubles.get(6) && listOfDoubles.get(6) < listOfDoubles.get(5) && listOfDoubles.get(5) < listOfDoubles.get(4) && listOfDoubles.get(4) < listOfDoubles.get(3) && listOfDoubles.get(3) < listOfDoubles.get(2) && listOfDoubles.get(2) < listOfDoubles.get(1) && listOfDoubles.get(1) < listOfDoubles.get(0)){
			stop = true;
		}
		}
		
		for(int i = 0; i < 10; i++){
			System.out.println(listOfDoubles.get(i));
		}
		
		System.out.println("Number of comparisons: " + comparisonCount + "\nNumber of swaps: " + swapCount);
		
	}

}

