package cn.mldn.shine;

public class Product {
	
	private int pid;
	private String name;
	private double price;
	
	private Item item;
	private Subitem subitem;
	
	public Product(int pid,String name,double price) {
		
		this.pid = pid;
		this.name = name;
		this.price = price;

	}
	
	public void setItem(Item item) {
		this.item = item;
	}
	
	public void setSubitem(Subitem subitem) {
		this.subitem = subitem;
	}
	
	public Item getItem() {
		return this.item;
	}
	
	public Subitem getSubitem() {
		return this.subitem;
	}
	
	public String getInfo() {
		return "商品编号" + this.pid + "，名称：" + this.name + "，价格：" + this.price;
	}
	
	
	
}
