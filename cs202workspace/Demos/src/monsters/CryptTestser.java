package monsters;

import static org.junit.Assert.*;

import org.junit.Test;

public class CryptTestser {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testCryptCreated(){
		String location = "Transylvania";
		Crypt c = new Crypt(location);
		assertNotNull(c);		
	}
	
	@Test
	public void testCryptLocation(){
		String location = "Transylvania";
		Crypt c = new Crypt(location);
		assertEquals(c.getLocation(), location);		// careful; this tests ==, not .equals()		c
	}
	
	@Test
	public void testSetCryptLocation(){
		String firstLocation = "Transylvania";
		Crypt c = new Crypt(firstLocation);
		String secondLocation = "Wisborg";
		c.setLocation(secondLocation);
		assertEquals(c.getLocation(), secondLocation);		
	}
	
	@Test
	public void testToString(){
		String location = "Transylvania";
		Crypt c = new Crypt(location);
		assertNotNull(c.toString());		
	}

}
