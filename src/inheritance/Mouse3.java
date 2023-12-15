package inheritance;

public class Mouse3 extends Mouse{

	int price;

	public Mouse3() {
		super();
		this.price = 0;
	}
	public Mouse3(int price) {
		super();
		this.price = price;
		
}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mouse3 [price=\\n"+super.toString() + price + "]";
	}}
