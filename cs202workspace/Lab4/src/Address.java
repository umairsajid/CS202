
public class Address {
	private int streetNum;
	private String streetName;
	private int apartmentNum;
	private String city;
	private String state;
	private int zipcode;
	
	public Address(){}
	
	//constructor for addresses with an apartment number
	public Address(int streetNum, String streetName, int apartmentNum, String city, String state, int zipcode){
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.apartmentNum = apartmentNum;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	//constructor for addresses without an apartment number
	public Address(int streetNum, String streetName, String city, String state, int zipcode){
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	public void setAddress(int streetNum, String streetName, int apartmentNum, String city, String state, int zipcode){
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.apartmentNum = apartmentNum;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	public void setAddress(int streetNum, String streetName, String city, String state, int zipcode){
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public int getStreetNum() {
		return streetNum;
	}

	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getApartmentNum() {
		return apartmentNum;
	}

	public void setApartmentNum(int apartmentNum) {
		this.apartmentNum = apartmentNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	
	public String toString(){
		if(apartmentNum == 0){ 
			return "Address:" + streetNum + " " + streetName + " " + " \n\t" +
					city + " " + state + ", " + zipcode;
		}
		else{
			return "Address:" + streetNum + " " + streetName + " " + apartmentNum + " \n\t" +
					city + " " + state + ", " + zipcode;
		}
	}
	
}