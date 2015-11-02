
public class LCD {


	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		
		int lcd = lcd(a, b);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(lcd);
		
		int x = -1;
		int y = -5;
		
		int difference = x - y;
		
		System.out.println(difference);

	}

	private static int lcd(int a, int b) {	
		int s = 1;
		int t = 1;
		
		for(int i = 1;;i++){
			s = a * i;
			for(int j = 1; t < s; j++){
				t = b * j;
			}
			if(s == t){
				break;
			}
		}
		
		return s;
	}

}
