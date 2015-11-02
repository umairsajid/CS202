
public class MyFraction implements MyMath<MyFraction> {
	
	private int numerator;
	private int denominator;
	private char sign;
	
	
	public MyFraction(int numerator, int denominator, char sign){
		this.numerator = numerator;
		this.denominator = denominator;
		this.sign = sign;
	}


	public int getNumerator() {
		return numerator;
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}
	
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public char getSign() {
		return sign;
	}
	
	public void setSign(char sign) {
		this.sign = sign;
	}


	@Override
	public MyFraction add(MyFraction o) {
		int sum = 0;
		if(this.denominator == o.denominator){
			if(this.sign == '-'){
				this.numerator = this.numerator * -1;
			}
			if(o.sign == '-'){
				o.numerator = o.numerator * -1;
			}
			sum = this.numerator + o.numerator;
			o.setNumerator(sum);
			return o;
		}
		else if(this.denominator != o.denominator){
			int lcd;
			int s = 1;
			int t = 1;
			
			for(int i = 1;;i++){
				s = this.denominator * i;
				for(int j = 1; t < s; j++){
					t = o.denominator * j;
				}
				if(s == t){
					break;
				}
			}			
			lcd = s;
			
			int numToMultiply1 =lcd/this.denominator;
			int numToMultiply2 =lcd/o.denominator;
			
			this.setNumerator(numToMultiply1 * this.numerator);
			this.setDenominator(numToMultiply1 * this.denominator);
			
			o.setNumerator(numToMultiply2 * o.numerator);
			o.setDenominator(numToMultiply2 * o.denominator);
			
			if(this.sign == '-'){
				this.numerator = this.numerator * -1;
			}
			if(o.sign == '-'){
				o.numerator = o.numerator * -1;
			}
			sum = this.numerator + o.numerator;
			o.setNumerator(sum);
			
			return o;
		}
		else{
			return null;
		}
	}

	@Override
	public MyFraction subtract(MyFraction o) {
		int difference = 0;
		if(this.denominator == o.denominator){
			if(this.sign == '-'){
				this.numerator = this.numerator * -1;
			}
			if(o.sign == '-'){
				o.numerator = o.numerator * -1;
			}
			if(o.numerator > 0){
				difference = this.numerator - o.numerator;
			}
			if(o.numerator < 0){
				o.numerator = o.numerator * -1;
				difference = this.numerator + o.numerator;
				o.setSign('+');
			}
			o.setNumerator(difference);
			return o;
		}
		else if(this.denominator != o.denominator){
			int lcd;
			int s = 1;
			int t = 1;
			
			for(int i = 1;;i++){
				s = this.denominator * i;
				for(int j = 1; t < s; j++){
					t = o.denominator * j;
				}
				if(s == t){
					break;
				}
			}			
			lcd = s;
			
			int numToMultiply1 =lcd/this.denominator;
			int numToMultiply2 =lcd/o.denominator;
			
			this.setNumerator(numToMultiply1 * this.numerator);
			this.setDenominator(numToMultiply1 * this.denominator);
			
			o.setNumerator(numToMultiply2 * o.numerator);
			o.setDenominator(numToMultiply2 * o.denominator);
			
			if(this.sign == '-'){
				this.numerator = this.numerator * -1;
			}
			if(o.sign == '-'){
				o.numerator = o.numerator * -1;
			}
			if(o.numerator > 0){
				difference = this.numerator - o.numerator;
			}
			if(o.numerator < 0){
				o.numerator = o.numerator * -1;
				difference = this.numerator + o.numerator;
				o.setSign('+');
			}
			o.setNumerator(difference);
			
			return o;
		}
		else{
			return null;
		}
	}

	@Override
	public MyFraction divide(MyFraction o) {
		int num = o.numerator;
		int den = o.denominator;
		o.setNumerator(den);
		o.setDenominator(num);
		
		if(this.sign == '-'){
			this.numerator = this.numerator * -1;
		}
		if(o.sign == '-'){
			o.numerator = o.numerator * -1;
		}
		if(this.numerator < 0 && o.numerator < 0){
			o.setNumerator(this.numerator * o.numerator);
			o.setDenominator(this.denominator * o.denominator);
			o.setSign('+');
		}
		else{
			o.setNumerator(this.numerator * o.numerator);
			o.setDenominator(this.denominator * o.denominator);
		}
		
		return o;
	}

	@Override
	public MyFraction multiply(MyFraction o) {
		if(this.sign == '-'){
			this.numerator = this.numerator * -1;
		}
		if(o.sign == '-'){
			o.numerator = o.numerator * -1;
		}
		if(this.numerator < 0 && o.numerator < 0){
			o.setNumerator(this.numerator * o.numerator);
			o.setDenominator(this.denominator * o.denominator);
			o.setSign('+');
		}
		else{
			o.setNumerator(this.numerator * o.numerator);
			o.setDenominator(this.denominator * o.denominator);
		}
		
		return o;
	}

	
	public String toString(){
		if(sign == '+'){
			return numerator +"/" + denominator;
		}
		else if (sign == '-' && numerator > 0){
			return (sign) + (numerator +"/" + denominator);
		}
		else if(numerator < 0){
			return numerator +"/" + denominator;
		}
		else return null;
	}
}
