package cn.mldn.link;

public class Book {
	
	private String title;
	private double price;
	
	public Book(String title,double price) {
		this.title = title;
		this.price = price;
	}
	
	public String getInfo() {
		return "ͼ�����ƣ�" + this.title + "���۸�" + this.price;
	}
	
	public boolean compare(Book book) {
		
		if(this == book) {
			return true;
		}
		if(book == null) {
			return false;
		}
		if(this.title.equals(book.title)&&this.price==book.price) {
			return true;
		}
		return false;
	}
	
}
