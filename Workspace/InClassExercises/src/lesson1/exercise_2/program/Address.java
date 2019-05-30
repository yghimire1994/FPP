package lesson1.exercise_2.program;

/**
 * Stores data for an address. In this application,
 * an Employee may have a home address and also a work Address.
 * 
 * @author pcorazza
 */
public class Address {
	private String street;
	private String city;
	private String state;
	private String zip;
	public Address(String street, String city, String state, String zip) {
		this.street=street;
		this.city=city;
		this.state=state;
		this.zip=zip;
	}
	/**
	 * Provides a string representation of an address.
	 */
	@Override
public String toString() {
	return "\n"+street+" "+city+" "+zip;
	
}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
//	public static void main(String[] args) {
//		Address a = new Address("111 Washington Ave", 
//				"Fairfield", "IA", "52556");
//		//Prints address to the console
//		System.out.println(a.toString());
//	}
}
