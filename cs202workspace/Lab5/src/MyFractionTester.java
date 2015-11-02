import static org.junit.Assert.*;

import org.junit.Test;


public class MyFractionTester {

	public void testObejectCreated() {
		MyFraction f1 = new MyFraction(3, 2, '+');
		assertNotNull(f1);
	}
	
	@Test
	public void testConstructor() {
		MyFraction f1 = new MyFraction(3, 2, '+');
		int actualNumerator = f1.getNumerator();
		int actualDenominator = f1.getDenominator();
		char actualSign = f1.getSign();
		int expectedNumerator = 3;
		int expectedDenominator = 2;
		char expectedSign = '+';
		assertEquals(actualNumerator, expectedNumerator);
		assertEquals(actualDenominator, expectedDenominator);
		assertEquals(actualSign, expectedSign);
	}
	
	@Test
	public void testSetNumerator() {
		MyFraction f1 = new MyFraction(3, 2, '+');
		int newNumerator = 5;
		f1.setNumerator(newNumerator);
		assertEquals(f1.getNumerator(), newNumerator);
	}
	
	@Test
	public void testSetDenominator() {
		MyFraction f1 = new MyFraction(3, 2, '+');
		int newDeno = 7;
		f1.setDenominator(newDeno);
		assertEquals(f1.getDenominator(), newDeno);
	}
	
	@Test
	public void testSetSign() {
		MyFraction f1 = new MyFraction(3, 2, '+');
		char newSign = '-';
		f1.setSign(newSign);
		assertEquals(f1.getSign(), newSign);
	}
	
	@Test
	public void testAddition1() {
		//when signs are both "+"
		//expectedSum = "19/15";
		MyFraction f1 = new MyFraction(3, 5, '+');
		MyFraction f2 = new MyFraction(2, 3, '+');
		f1.add(f2);
		int expNum = 19;
		int expDen = 15;
		char expSign = '+';
		assertEquals(f2.getNumerator(), expNum);
		assertEquals(f2.getDenominator(), expDen);
		assertEquals(f2.getSign(), expSign);
		
	}
	
	@Test
	public void testAddition2() {
		//when sign of f1 = '+' and sign of f2 = '-'
		//expectedSum = "-1/15";
		MyFraction f1 = new MyFraction(3, 5, '+');
		MyFraction f2 = new MyFraction(2, 3, '-');
		f1.add(f2);
		int expNum = -1;
		int expDen = 15;
		char expSign = '-';
		assertEquals(f2.getNumerator(), expNum);
		assertEquals(f2.getDenominator(), expDen);
		assertEquals(f2.getSign(), expSign);
		
	}
	
	@Test
	public void testAddition3() {
		//when signs are both "-"
		//expectedSum = "-19/15";
		MyFraction f1 = new MyFraction(3, 5, '-');
		MyFraction f2 = new MyFraction(2, 3, '-');
		f1.add(f2);
		int expNum = -19;
		int expDen = 15;
		char expSign = '-';
		assertEquals(f2.getNumerator(), expNum);
		assertEquals(f2.getDenominator(), expDen);
		assertEquals(f2.getSign(), expSign);
		
	}
	
	@Test
	public void testAddition4() {
		//when sign of f1 = '-' and sign of f2 = '+'
		//expectedSum = "1/15";
		MyFraction f1 = new MyFraction(3, 5, '-');
		MyFraction f2 = new MyFraction(2, 3, '+');
		f1.add(f2);
		int expNum = 1;
		int expDen = 15;
		char expSign = '+';
		assertEquals(f2.getNumerator(), expNum);
		assertEquals(f2.getDenominator(), expDen);
		assertEquals(f2.getSign(), expSign);
		
	}
	
	@Test
	public void testSubtraction1() {
		//when signs are both "+"
		//expectedSum = "-4/2";
		MyFraction f1 = new MyFraction(1, 2, '+');
		MyFraction f2 = new MyFraction(5, 2, '+');
		f1.subtract(f2);
		int expNum = -4;
		int expDen = 2;
		char expSign = '+';
		assertEquals(f2.getNumerator(), expNum);
		assertEquals(f2.getDenominator(), expDen);
		assertEquals(f2.getSign(), expSign);
		
	}
	
	@Test
	public void testSubtraction2() {
		//when sign of f1 = '+' and sign of f2 = '-'
		//expectedSum = "6/2";
		MyFraction f1 = new MyFraction(1, 2, '+');
		MyFraction f2 = new MyFraction(5, 2, '-');
		f1.subtract(f2);
		int expNum = 6;
		int expDen = 2;
		char expSign = '+';
		assertEquals(f2.getNumerator(), expNum);
		assertEquals(f2.getDenominator(), expDen);
		assertEquals(f2.getSign(), expSign);
		
	}
	
	@Test
	public void testSubtraction3() {
		//when signs are both "-"
		//expectedSum = "4/2";
		MyFraction f1 = new MyFraction(1, 2, '-');
		MyFraction f2 = new MyFraction(5, 2, '-');
		f1.subtract(f2);
		int expNum = 4;
		int expDen = 2;
		char expSign = '+';
		assertEquals(f2.getNumerator(), expNum);
		assertEquals(f2.getDenominator(), expDen);
		assertEquals(f2.getSign(), expSign);
		
	}
	
	@Test
	public void testSubtraction4() {
		//when sign of f1 = '-' and sign of f2 = '+'
		//expectedSum = "-6/2";
		MyFraction f1 = new MyFraction(1, 2, '-');
		MyFraction f2 = new MyFraction(5, 2, '+');
		f1.subtract(f2);
		int expNum = -6;
		int expDen = 2;
		char expSign = '+';
		assertEquals(f2.getNumerator(), expNum);
		assertEquals(f2.getDenominator(), expDen);
		assertEquals(f2.getSign(), expSign);
		
	}
	
	@Test
	public void testDivision1() {
		//when signs are both "+"
		//expectedSum = "32/35";
		MyFraction f1 = new MyFraction(4, 5, '+');
		MyFraction f2 = new MyFraction(7, 8, '+');
		f1.divide(f2);
		int expNum = 32;
		int expDen = 35;
		char expSign = '+';
		assertEquals(f2.getNumerator(), expNum);
		assertEquals(f2.getDenominator(), expDen);
		assertEquals(f2.getSign(), expSign);
		
	}
	
	@Test
	public void testDivision2() {
		//when sign of f1 = '+' and sign of f2 = '-'
		//expectedSum = "-32/35";
		MyFraction f1 = new MyFraction(4, 5, '+');
		MyFraction f2 = new MyFraction(7, 8, '-');
		f1.divide(f2);
		int expNum = -32;
		int expDen = 35;
		char expSign = '-';
		assertEquals(f2.getNumerator(), expNum);
		assertEquals(f2.getDenominator(), expDen);
		assertEquals(f2.getSign(), expSign);
		
	}
	
	@Test
	public void testDivision3() {
		//when signs are both "-"
		//expectedSum = "32/35";
		MyFraction f1 = new MyFraction(4, 5, '-');
		MyFraction f2 = new MyFraction(7, 8, '-');
		f1.divide(f2);
		int expNum = 32;
		int expDen = 35;
		char expSign = '+';
		assertEquals(f2.getNumerator(), expNum);
		assertEquals(f2.getDenominator(), expDen);
		assertEquals(f2.getSign(), expSign);
		
	}
	
	@Test
	public void testDivision4() {
		//when sign of f1 = '-' and sign of f2 = '+'
		//expectedSum = "-32/35";
		MyFraction f1 = new MyFraction(4, 5, '-');
		MyFraction f2 = new MyFraction(7, 8, '+');
		f1.divide(f2);
		int expNum = -32;
		int expDen = 35;
		char expSign = '+';
		assertEquals(f2.getNumerator(), expNum);
		assertEquals(f2.getDenominator(), expDen);
		assertEquals(f2.getSign(), expSign);
		
	}
	
	@Test
	public void testMultiplication1() {
		//when signs are both "+"
		//expectedSum = "24/18";
		MyFraction f1 = new MyFraction(3, 2, '+');
		MyFraction f2 = new MyFraction(8, 9, '+');
		f1.multiply(f2);
		int expNum = 24;
		int expDen = 18;
		char expSign = '+';
		assertEquals(f2.getNumerator(), expNum);
		assertEquals(f2.getDenominator(), expDen);
		assertEquals(f2.getSign(), expSign);
		
	}
	
	@Test
	public void testMultiplication2() {
		//when sign of f1 = '+' and sign of f2 = '-'
		//expectedSum = "-24/18";
		MyFraction f1 = new MyFraction(3, 2, '+');
		MyFraction f2 = new MyFraction(8, 9, '-');
		f1.multiply(f2);
		int expNum = -24;
		int expDen = 18;
		char expSign = '-';
		assertEquals(f2.getNumerator(), expNum);
		assertEquals(f2.getDenominator(), expDen);
		assertEquals(f2.getSign(), expSign);
		
	}
	
	@Test
	public void testMultiplication3() {
		//when signs are both "-"
		//expectedSum = "24/18";
		MyFraction f1 = new MyFraction(3, 2, '-');
		MyFraction f2 = new MyFraction(8, 9, '-');
		f1.multiply(f2);
		int expNum = 24;
		int expDen = 18;
		char expSign = '+';
		assertEquals(f2.getNumerator(), expNum);
		assertEquals(f2.getDenominator(), expDen);
		assertEquals(f2.getSign(), expSign);
		
	}
	
	@Test
	public void testMultiplication4() {
		//when sign of f1 = '-' and sign of f2 = '+'
		//expectedSum = "-24/18";
		MyFraction f1 = new MyFraction(3, 2, '-');
		MyFraction f2 = new MyFraction(8, 9, '+');
		f1.multiply(f2);
		int expNum = -24;
		int expDen = 18;
		char expSign = '+';
		assertEquals(f2.getNumerator(), expNum);
		assertEquals(f2.getDenominator(), expDen);
		assertEquals(f2.getSign(), expSign);
		
	}

}
