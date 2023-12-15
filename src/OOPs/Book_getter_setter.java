package OOPs;

public class Book_getter_setter {
	
	// tile,price, isbn, author
	
	// to encapsulate. make the variables private
	// private = you can access private only within the class
	
	private String title;
	private double price;
	private String isbn;
	private String author;
	
	public Book_getter_setter() {
		this.title = "";
		this.price = 0;
		this.isbn = isbn;
		this.author = "";
	}
		public Book_getter_setter(String title,double price,String isbn,String author) {
			this.title = title;
			this.price = price;
			this.isbn = isbn;
			this.author = author;
		}
		// getter method are read access
		public String getTitle() {
			return title;
		}
		
		public double getPrice() {
			return price;
		}
		public String getisbn() {
			return isbn;
			
		}
		public String getauthor() {
			return author;
		}
		// setter. with this method we can change the value
		public void setTitle(String title, String pin) {
			if(pin.equals("123")) {
		this.title = title;
			System.out.println("Title changed");
		}else {
			System.out.println("Invalde pin");
		}
			
		}
		 public void setPrice(double price) {
			 this.price = price;
		 }
		 
//		 public void setisbn(String isbn) {
//			 this.isbn = isbn;
//		 }
		 
		 public void setAuthor(String author) {
			 this.author = author;
		 }
		// getter and setter method will give us access to the private variables 
		//of the class.they are  optional
		
		// setters write access
		
		
		
		
		@Override
			public String toString() {
				return "Book Information" + " Title:," + " "+ title+ " "+ "price,\n"
			+ price + " "+ "ISBN,"+ " "+isbn+ " "+ "Author," +" "+ author;
			}
			
	}


