package cn.mldn.jing;

public class Book {
	
//	private String title;
//	private double price;
//	
//	private static String pub = "清华大学出版社";
//	
//	public Book(String title,double price) {
//		
//		this.title = title;
//		this.price = price;
//		
//	}
//	
//	public static void setPub(String p) {
//		
//		pub = p;
//		
//	}
//	
//	public String getInfo() {
//		
//		return "图书名称：" + this.title + "，价格：" + this.price + "，出版社：" + this.pub;
//		
//	}
	
	private static int num =0;
	
	public Book() {
		
		num++;
		
		System.out.println("这是第" +num + "个产生的对象");
		
	}
	
	
	
	
	
	
}
