package OOPs;

public class ContactBook {
	
	Contact[] myContact;
	int index;
	
	public ContactBook(int size) {
		this.myContact = new Contact [size];
		this.index = 0;
	}
	public void addContact(Contact obj) {
		if(index >= myContact.length) {
			System.out.println("The contact book is full");
			return ;
		}else {
		myContact[index++]=obj;
		System.out.println("Contact added");
		return ;
			
			
	}}
	
	public String toString() {
		String res = "\n-----------------------------\n"+  
	"Contact Book";
		res += "\n-----------------------------";
		return res;
	
}}


