package OOPs;

public class BookRunner {

	public static void main(String[] args) {
		Book_getter_setter info = new Book_getter_setter("Hello World",14.12, "122a1sd3:", "Bill Gate");
		System.out.println(info.getTitle()+info.getPrice());
		info.getisbn();// now I'm not able to change the isbn bco it private now
		
		info.setTitle("Charly", "103");// with helps of setter i changed the value of the book
		System.out.println(info);
		System.out.println(info.getauthor());
		
        //info.isbn = "11112211121";
       // System.out.println(info);
		
		
	}

}
