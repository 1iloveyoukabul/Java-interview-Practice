package OOPs;

public class Student {
	// Encapsulation
	
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private boolean status;
	
	Student(){
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
		this.phone = "";
		this.status = false;
	}
	Student(String firstName,String lastName, int age, String phone, boolean status){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phone = phone;
		this.status = status;
	}
	// getter, we can give access to read the value and cant change it
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
  public String getPhone() {
	  return phone;
  }
  
  public boolean getStatus() {
	  return status;
  }
  
  // setter, we give access to change the value or writ
  
  public void setFirstName(String firstName) {
	  this.firstName = firstName;
  }
  public void setLastName(String lastName) {
	  this.lastName = lastName;
	  
  }
  public void setAge(int age) {
	  this.age = age;
	  
  }
  
  public void setPhone(String phone) {
	  if(phone.length()!=10) {
		  System.out.println("Phone Number must be 10 digit");
  }else {
	  this.phone = phone;
  }}
  public void setStatus(boolean status) {
	  this.status = status;
  }
  @Override
  public String toString() {
	return "Firs Name " +firstName + ",Last Name " + lastName+ ",Age " + age+ ",Phone" + phone+ 
			",Status " + status;
	  
  }
}
