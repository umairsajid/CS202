import static org.junit.Assert.*;

import org.junit.Test;


public class MySetTester {

	@Test
	public void testObjectCreated() {
		int[] set1 = {1, 2, 2, 3, 1, 5};
		MySet s1 = new MySet(set1);
		assertNotNull(s1);
	}
	
	@Test
	public void testContructor() {
		int[] set1 = {1, 2, 2, 3, 1, 5};
		MySet s1 = new MySet(set1);
		int[] expSet = {1, 2, 3, 5};
		assertArrayEquals(s1.getSet(), expSet);
	}
	
	@Test
	public void testSetSets() {
		int[] set1 = {1, 2, 2, 3, 1, 5};
		MySet s1 = new MySet(set1);
		int[] set2 = {5, 6, 7, 8};
		s1.setSet(set2);
		int[] expSet = {5, 6, 7, 8};
		assertArrayEquals(s1.getSet(), expSet);
	}
	
	@Test
	public void testUnion() {
		int[] set1 = {1, 2, 2, 3, 1, 5};
		MySet s1 = new MySet(set1);		
		int[] set2 = {5, 6, 7, 5, 7, 6};
		MySet s2 = new MySet(set2);
		s1.add(s2);
		int[] expSet = {1, 2, 3, 5, 6, 7};
		assertArrayEquals(s2.getSet(), expSet);
	}
	
	@Test
	public void testIntersection() {
		int[] set1 = {1, 2, 2, 3, 6, 5};
		MySet s1 = new MySet(set1);		
		int[] set2 = {5, 6, 7, 7, 7, 6};
		MySet s2 = new MySet(set2);
		s1.subtract(s2);
		int[] expSet = {6, 5};
		assertArrayEquals(s2.getSet(), expSet);
	}
	
	@Test
	public void testSymmetricDifferece() {
		int[] set1 = {1, 2, 3};
		MySet s1 = new MySet(set1);		
		int[] set2 = {3, 4};
		MySet s2 = new MySet(set2);
		s1.multiply(s2);
		int[] expSet = {1, 2, 4};
		assertArrayEquals(s2.getSet(), expSet);
	}
	
	@Test
	public void testRelativeComplement() {
		int[] set1 = {7, 8, 7, 5};
		MySet s1 = new MySet(set1);		
		int[] set2 = {5, 4, 4, 2, 2, 1};
		MySet s2 = new MySet(set2);
		s1.divide(s2);
		int[] expSet = {7, 8};
		assertArrayEquals(s2.getSet(), expSet);
	}

}
