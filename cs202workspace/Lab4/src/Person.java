
public abstract class Person {
	protected String name;
	protected String phoneNumber;
	protected Address address;
	protected String emailAddress;
	
	protected abstract void address(int streetNum, String streetName, int apartmentNum, String city, String state, int zipcode);
	
	protected abstract void address(int streetNum, String streetName, String city, String state, int zipcode);

	public String getName() {
		return name;
	}
	
	

}
