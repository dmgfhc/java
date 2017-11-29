package cn.mldn.demo;

class book{
	
	private String title;
	private double price;
	
 public book(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}
public book() {
		super();
	}
String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
	public String toString() {
		return "book [title=" + title + ", price=" + price + "]";
	}
}

public class Hello {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}

}
