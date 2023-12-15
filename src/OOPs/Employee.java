package OOPs;

public class Employee {
	// Encapsulatin to contro data
	
	private String firstName;
	private String midName;
	private String lastName;
	private int age;
	private String phone;
	private String email;
	private String address;
	private String city;
	private String country;
	private String zipCode;
	
	public Employee() {
		super();
		this.firstName = "";
		this.midName = "";
		this.lastName = "";
		this.age = 0;
		this.phone = "";
		this.email = "";
		this.address = "";
		this.city = city;
		this.country = "";
		this.zipCode = "";
	}
	
	public Employee(String firstName, String midName, String lastName, int age, String phone, String email,
			String address, String city, String country, String zipCode) {
		super();
		this.firstName = firstName;
		this.midName = midName;
		this.lastName = lastName;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.city = city;
		this.country = country;
		this.zipCode = zipCode;

}

	public Employee(String firstName, String lastName, String phone, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMidName() {
		return midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Employee Info: firstName " + firstName + ", midName " + midName + ", lastName " + lastName + ", age " + age
				+ ", phone " + phone + ", email " + email + ", address " + address + ", city " + city + ", country "
				+ country + ", zipCode " + zipCode;
	}}
