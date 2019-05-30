package customer_data;

public class Address {
	private String street;
	private String city;
	private String state;
	private String zipcode;
	
	public Address(String street, String city, String state, String zipcode) {
		this.state=state;
		this.street=street;
		this.city=city;
		this.zipcode=zipcode;
	}
	
	//mutator/ setter
	
	public void setStreet(String street) {
		this.street=street;
	}
	public void setCity(String  city) {
		this.city=city;
	}
	public void setState(String state) {
		this.state=state;
	}
	public void setZipcode(String zipcode) {
		this.zipcode=zipcode;
	}
	
	//getter
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	public String getZipcode() {
		return zipcode;
	}
	@Override
	public String toString() {
		return street+" "+city+" "+state+" "+zipcode;
	}
	
	

}
