package OOPs;

public class product {
	String name;
	String description;
	double price;
	String seller;
	double rating;

	// it will call deafult constructor if i dont add arrgument insid the parantecee
	public product() {// constructor must initialze the above veraibles
		name = "";
		description = "";
		price = 0;
		seller = "";
		int rating = 0;
	}
	// parmeterzed constrcutor
	public product(String Nm,String dsc,double prc,String sell,double rat) {
		name = Nm;
		description = dsc;
		price = prc;
		seller = sell;
		rating = rat;
		
	}
		
	public void printiPhone() {// both methods work
		System.out.println("Name: " + name + "Descriptins: " + description + " Price : " +  price+" "+ 
						 "Seller: "  +  seller +  "Rating: " + rating);
	}
		public String printiPhon() {// method to print and stored variable in String inf.
					String inf = "Name: " + name + "Descriptins: " + description + " Price : " +  price+" "+ 
						 "Seller: "  +  seller +  "Rating: " + rating;
				System.out.println(inf);
				return inf;
				
			
			}

	}

