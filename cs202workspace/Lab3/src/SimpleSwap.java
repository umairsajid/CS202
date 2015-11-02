import java.util.ArrayList;


public class SimpleSwap {


	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int number1 = 8;
		list.add(number1);
		
		int number2 = 24;
		list.add(number2);
		
		int number3 = 16;
		list.add(number3);
		
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		
		//int min = Integer.MAX_VALUE;
		
		int k = 2;
		boolean stop = false;
		
		while(stop == false){
			int min = Integer.MAX_VALUE;
			for(int j = 0; j <= k; j++){
				if(list.get(j) < min){
					min = list.get(j);
				}

				list.get(k).compareTo(min);
				if(list.get(k) > min && list.get(j) == min){
					int temp;
					temp = list.get(k);
					list.set(k, list.get(j));
					list.set(j, temp);
				}
			}
			if(list.get(2) < list.get(1) && list.get(1) < list.get(0)){
				stop = true;
			}
			else{
				k--;
			}
		}
		
//		for(int i = 2; i >= 0; i--){
//			list.get(i).compareTo(min);
//			if(list.get(i) > min){
//				int temp;
//				temp = list.get(i);
//				list.set(i, min);
//				min = temp;
//			}			
//		}
		
		System.out.println();
				
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		
//		int val1 = 0;
//		int val2 = val1 + 2;
//		
//		int temp = val1;
//		val1 = val2;
//		val2 = temp;
//		
//		System.out.println(val1);
//		System.out.println(val2);
//		System.out.println(temp);
		
		
	}

}
