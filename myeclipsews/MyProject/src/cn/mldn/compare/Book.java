package cn.mldn.compare;

public class Book {
	
	private String title;
	private double price;
	
	public Book(String title,double price) {
		this.title = title;
		this.price = price;
	}
	
	public boolean compare(Book book) {
		
		if(book == null) {
			return false;
		}
		
		if(this == book) {
			return true;
		}
		
		if(this.title.equals(book.title) && this.price == book.price) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public String getTtile() {
		return this.title;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	
	
}
