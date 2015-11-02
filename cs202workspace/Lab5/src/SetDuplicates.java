
public class SetDuplicates {

	public static void main(String[] args) {
		int[] set1 = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
		int[] array;
		
		array = printDistinctElements(set1);
		
		//System.out.println();
		
		for(int i = 0; i < set1.length; i++){
			System.out.print(set1[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		
		//eliminateDuplicates(set1);

	}

	public static int[] printDistinctElements(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            boolean isDistinct = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
                count++;
            }
        }
        
        int[] array = new int[count];
        int k = 0;
        
        for(int i=0;i<arr.length;i++){
            boolean isDistinct = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
            	array[k] = arr[i];
            	k++;
            }
        }
        
        return array;
    }
	
//public static void printDistinctElements(int[] arr){
//        
//        for(int i=0;i<arr.length;i++){
//            boolean isDistinct = false;
//            for(int j=0;j<i;j++){
//                if(arr[i] == arr[j]){
//                    isDistinct = true;
//                    break;
//                }
//            }
//            if(!isDistinct){
//                System.out.print(arr[i]+" ");
//            }
//        }
//    }
	
//	public static int[]eliminateDuplicates(int[] numbers){
//		for(int i = 0; i < numbers.length; i++){
//			boolean distinct = true;
//			for(int j = 0; j <= i; j++){
//				if (numbers[i] == numbers[j]){
//					distinct = false;
//
//				}
//				if (distinct){
//					System.out.print(numbers[i] + " ");
//				}
//			}
//		}
//		return numbers;
//	}

}
