
public class Example3 {

	public static void main(String[] args) {
		int randomNum = 1 + (int)(Math.random() * ((8 - 1) + 1));
		
		int[] placeholders = new int[randomNum];
		
		for(int i = 0; i < placeholders.length; i++) {
			placeholders[i] = 95;
		}
		
		for (int i = 0; i < placeholders.length; i++) {
			  System.out.print((char)placeholders[i] + " ");
			}


	}

}
