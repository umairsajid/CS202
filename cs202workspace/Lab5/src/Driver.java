

public class Driver {

	public static void main(String[] args) {
		System.out.println("----------------------Fractions----------------------\n");
		MyFraction a1 = new MyFraction(3, 5, '+');		
		MyFraction a2 = new MyFraction(2, 3, '+');
		MyFraction a3 = new MyFraction(3, 5, '+');		
		MyFraction a4 = new MyFraction(2, 3, '-');
		MyFraction a5 = new MyFraction(3, 5, '-');		
		MyFraction a6 = new MyFraction(2, 3, '-');
		MyFraction a7 = new MyFraction(3, 5, '-');		
		MyFraction a8 = new MyFraction(2, 3, '+');
		System.out.println("Sum of Fraction " + a1  + " and Fraction "+  a2 + " = " + a1.add(a2));
		System.out.println("Sum of Fraction " + a3  + " and Fraction "+  a4 + " = " + a3.add(a4));
		System.out.println("Sum of Fraction " + a5  + " and Fraction "+  a6 + " = " + a5.add(a6));
		System.out.println("Sum of Fraction " + a7  + " and Fraction "+  a8 + " = " + a7.add(a8));

		System.out.println();
		
		MyFraction b1 = new MyFraction(1, 2, '+');		
		MyFraction b2 = new MyFraction(5, 2, '+');
		MyFraction b3 = new MyFraction(1, 2, '+');		
		MyFraction b4 = new MyFraction(5, 2, '-');
		MyFraction b5 = new MyFraction(1, 2, '-');		
		MyFraction b6 = new MyFraction(5, 2, '-');
		MyFraction b7 = new MyFraction(1, 2, '-');		
		MyFraction b8 = new MyFraction(5, 2, '+');
		System.out.println("Difference of Fraction " + b1  + " and Fraction "+  b2 + " = " + b1.subtract(b2));
		System.out.println("Difference of Fraction " + b3  + " and Fraction "+  b4 + " = " + b3.subtract(b4));
		System.out.println("Difference of Fraction " + b5  + " and Fraction "+  b6 + " = " + b5.subtract(b6));
		System.out.println("Difference of Fraction " + b7  + " and Fraction "+  b8 + " = " + b7.subtract(b8));
		
		System.out.println();
		
		MyFraction c1 = new MyFraction(4, 5, '+');		
		MyFraction c2 = new MyFraction(7, 8, '+');
		MyFraction c3 = new MyFraction(4, 5, '+');		
		MyFraction c4 = new MyFraction(7, 8, '-');
		MyFraction c5 = new MyFraction(4, 5, '-');		
		MyFraction c6 = new MyFraction(7, 8, '-');
		MyFraction c7 = new MyFraction(4, 5, '-');		
		MyFraction c8 = new MyFraction(7, 8, '+');
		System.out.println("Quotient of Fraction " + c1  + " and Fraction "+  c2 + " = " + c1.divide(c2));
		System.out.println("Quotient of Fraction " + c3  + " and Fraction "+  c4 + " = " + c3.divide(c4));
		System.out.println("Quotient of Fraction " + c5  + " and Fraction "+  c6 + " = " + c5.divide(c6));
		System.out.println("Quotient of Fraction " + c7  + " and Fraction "+  c8 + " = " + c7.divide(c8));
				
		System.out.println();
		
		MyFraction d1 = new MyFraction(3, 2, '+');		
		MyFraction d2 = new MyFraction(8, 9, '+');
		MyFraction d3 = new MyFraction(3, 2, '+');		
		MyFraction d4 = new MyFraction(8, 9, '-');
		MyFraction d5 = new MyFraction(3, 2, '-');		
		MyFraction d6 = new MyFraction(8, 9, '-');
		MyFraction d7 = new MyFraction(3, 2, '-');		
		MyFraction d8 = new MyFraction(8, 9, '+');
		System.out.println("Product of Fraction " + d1  + " and Fraction "+  d2 + " = " + d1.multiply(d2));
		System.out.println("Product of Fraction " + d3  + " and Fraction "+  d4 + " = " + d3.multiply(d4));
		System.out.println("Product of Fraction " + d5  + " and Fraction "+  d6 + " = " + d5.multiply(d6));
		System.out.println("Product of Fraction " + d7  + " and Fraction "+  d8 + " = " + d7.multiply(d8));
		
		
		
		System.out.println();
		System.out.println();
		
		
		
		
		System.out.println("-----------------------------------Sets-----------------------------------\n");
		
		int[] set1 = {1, 2, 2, 3, 1, 5};
		MySet s1 = new MySet(set1);		
		int[] set2 = {5, 6, 7, 5, 7, 6};
		MySet s2 = new MySet(set2);
		System.out.print("Union of Set { ");
		for(int i = 0; i < set1.length; i++){
			System.out.print(set1[i] + " ");
		}
		System.out.print("} and Set { ");
		for(int i = 0; i < set2.length; i++){
			System.out.print(set2[i] + " ");
		}
		System.out.println("} = " + s1.add(s2));

		System.out.println();
		
		int[] set3 = {1, 2, 2, 3, 6, 5};
		MySet s3 = new MySet(set3);		
		int[] set4 = {5, 6, 7, 7, 7, 6};
		MySet s4 = new MySet(set4);
		System.out.print("Intersection of Set { ");
		for(int i = 0; i < set3.length; i++){
			System.out.print(set3[i] + " ");
		}
		System.out.print("} and Set { ");
		for(int i = 0; i < set4.length; i++){
			System.out.print(set4[i] + " ");
		}
		System.out.println("} = " + s3.subtract(s4));
		
		System.out.println();
		
		int[] set5 = {1, 2, 3};
		MySet s5 = new MySet(set5);		
		int[] set6 = {3, 4};
		MySet s6 = new MySet(set6);
		System.out.print("Symmetric Difference of Set { ");
		for(int i = 0; i < set5.length; i++){
			System.out.print(set5[i] + " ");
		}
		System.out.print("} and Set { ");
		for(int i = 0; i < set6.length; i++){
			System.out.print(set6[i] + " ");
		}
		System.out.println("} = " + s5.multiply(s6));
				
		System.out.println();
		
		int[] set7 = {7, 8, 7, 5};
		MySet s7 = new MySet(set7);		
		int[] set8 = {5, 4, 4, 2, 2, 1};
		MySet s8 = new MySet(set8);
		System.out.print("Relative Complement of Set { ");
		for(int i = 0; i < set7.length; i++){
			System.out.print(set7[i] + " ");
		}
		System.out.print("} and Set { ");
		for(int i = 0; i < set8.length; i++){
			System.out.print(set8[i] + " ");
		}
		System.out.println("} = " + s7.divide(s8));
		
	}

}
