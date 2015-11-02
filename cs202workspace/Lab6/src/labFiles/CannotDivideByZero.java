package labFiles;

public class CannotDivideByZero {

	public static void main(String[] args) {
//		double x = 34;
//		
//		double y = 0;
//		
//		double z = x / 0;
//		
		//		System.out.println(z);
		try{
			double x[] = new double[3];

			x[0] = 20;

			for(int i = 0; i < x.length + 1; i++){
				System.out.println(x[i]);
			}
		}catch(Exception e){
			System.out.println("The array went out of BOUNDS. Check your loop.");
		}
	}

}
