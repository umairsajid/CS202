import javax.swing.JOptionPane;


public class Recursion2 {
// gives fibonacci number
	public static int r_fib(int n){
		if(n <= 2){
			return 1;
		}
		else{
			return r_fib(n-1) + r_fib(n-2);
		}
	}

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog(null,  "Please "
				+ "enter the number whose factorial you would like to compute"));
		JOptionPane.showMessageDialog(null,  "The factorial of " + num + " is " + 
				r_fib(num));
	}

}
