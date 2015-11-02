
public class Example {


	public static void main(String[] args) {
		char[][] pic1 = {{'x','x','x'},
				 		 {'x','x','x'},
				 		 {'x','x','x'}};
		char[][] pic2 = {{'o','o','o'},
				 		 {'o','o','o'},
				 		 {'o','o','o'}};
		
		char[][][] pictures = {pic1, pic2};
		
		printArray(pictures[0]);

	}

	public static void printArray(char[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
			}

	}
}
