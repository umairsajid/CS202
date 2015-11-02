
public class ParsingExample {

	public static void main(String[] args) {
		String fiveString = "5";
		
		//won't work since you can't add an integer and a string.
		//int result = 20 + fiveString;
		
		//this will make result 25
		int result = 20 + Integer.parseInt(fiveString);
		
		System.out.println(result);

	}

}
