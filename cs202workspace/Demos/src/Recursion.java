import javax.swing.JOptionPane;


public class Recursion {

	public static int factorialRecursive(int intIn){
		if(intIn == 0 || intIn == 1){
			return 1;
		}
		return intIn * factorialRecursive(intIn - 1);
	}

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog(null,  "Please "
				+ "enter the number whose factorial you would like to compute"));
		JOptionPane.showMessageDialog(null,  "The factorial of " + num + " is " + 
				factorialRecursive(num));
	}


}
