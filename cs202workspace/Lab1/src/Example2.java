
public class Example2 {

	public static void main(String[] args) {
	    int[][] frame = {
	    					{32, 32, 43, 45, 45, 45, 43, 32, 32},
	    					{32, 32, 32, 32, 32, 32, 124, 32, 32},
	    					{32, 32, 32, 32, 32, 32, 124, 32, 32},
	    					{32, 32, 32, 32, 32, 32, 124, 32, 32},
	    					{32, 32, 32, 32, 32, 32, 124, 32, 32},
	    					{32, 32, 32, 32, 32, 32, 124, 32, 32},
	    					{61, 61, 61, 61, 61, 61, 61, 61, 61},
	    				};
	    
	    for(int i = 0; i < frame.length; i++) {
			for(int j = 0; j < frame[0].length; j++){
				System.out.print((char)frame[i][j] + " ");
			}
			System.out.println();
		}
	}

}

//for(int i = 0; i < secondArray.length; i++) {
//	secondArray[i] = firstArray[i];
//}
