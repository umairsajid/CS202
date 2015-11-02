package monsters;

import static org.junit.Assert.*;

import org.junit.Test;

public class VampireTester {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testLocation() {
		String name = "Orlok";
		String location = "Transylvania";
		Vampire v = new Vampire(name, location);
		assertEquals(v.getLocation(), location);		
	}

	@Test
	public void testCloneIsNewVampire(){
		String name = "Orlok";
		String location = "Transylvania";
		Vampire v1 = new Vampire(name, location);
		Vampire v2 = (Vampire) v1.clone();   //clone() returns an object, but it is a Vampire
		assertNotSame(v1, v2);		
	}	
	
	@Test
	public void testCloneName(){
		String name = "Orlok";
		String location = "Transylvania";
		Vampire v1 = new Vampire(name, location);
		Vampire v2 = (Vampire) v1.clone();   //clone() returns an object, but it is a Vampire
		assertTrue(v1.getName().equals(v2.getName()));		
	}
		
	@Test
	public void testCloneLocation(){
		String name = "Orlok";
		String location = "Transylvania";
		Vampire v1 = new Vampire(name, location);
		Vampire v2 = (Vampire) v1.clone();   //clone() returns an object, but it is a Vampire
		assertTrue(v1.getLocation().equals(v2.getLocation()));		
	}
	
	@Test
	public void testCloneChangeLocation(){
		String name = "Orlok";
		String location = "Transylvania";
		Vampire v1 = new Vampire(name, location);
		Vampire v2 = (Vampire) v1.clone();   
		v2.setLocation("Burbank");
		assertFalse(v1.getLocation().equals(v2.getLocation()));		
	}


}
