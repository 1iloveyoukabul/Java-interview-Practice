package OOPs;

public class Ruuner {
public static void main(String[] args) {
	StudentClass obj = new StudentClass();// object is instance of the class
	obj.firstName = "John,";
	obj.lastName = "Alex,";
	obj.age = 20;
	obj.phoneNumber = "804-296-3312.";
	
	
	//System.out.println(obj.firstName+" "+ obj.lastName + ": Age "+ obj.age+  ":(Phon#"+obj.phoneNumber+")");
	
	
	StudentClass obj2 = new StudentClass("David", "Allen", 55, "8043332211");
	obj.printall();
	obj2.printall();
}
}
