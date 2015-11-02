import java.util.ArrayList;


public class SortingAlg1Test {
	// I believe that this is basically bubble sort?

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
		
		int swapCount = 0;
		boolean stop = false;
		int k = listOfDoubles.size() - 1;
		
		while(stop == false){
			double min = Double.MAX_VALUE;
			
			for(int i = 0; i <= k; i++){
				if(listOfDoubles.get(i) < min){
					min = listOfDoubles.get(i);
				}
				
				listOfDoubles.get(k).compareTo(min);
				
				if(listOfDoubles.get(k) > min && listOfDoubles.get(i) == min){
					double temp;
					temp = listOfDoubles.get(k);
					listOfDoubles.set(k, listOfDoubles.get(i));
					listOfDoubles.set(i, temp);
					swapCount++;
				}
			}
			
			if(listOfDoubles.get(9) < listOfDoubles.get(8) && listOfDoubles.get(8) < listOfDoubles.get(7) && listOfDoubles.get(7) < listOfDoubles.get(6) && listOfDoubles.get(6) < listOfDoubles.get(5) && listOfDoubles.get(5) < listOfDoubles.get(4) && listOfDoubles.get(4) < listOfDoubles.get(3) && listOfDoubles.get(3) < listOfDoubles.get(2) && listOfDoubles.get(2) < listOfDoubles.get(1) && listOfDoubles.get(1) < listOfDoubles.get(0)){
				stop = true;
			}
			else{
				k--;
			}
		}
	
		
		for(int i = 0; i < 10; i++){
			System.out.println(listOfDoubles.get(i));
		}
		
		
		System.out.println("Number of swap occurences: " + swapCount);

	}

}
