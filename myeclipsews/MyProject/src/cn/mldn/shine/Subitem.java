package cn.mldn.shine;

public class Subitem {

	private int sid;
	private String name;
	private String note;
	
	private Item item;
	private Product[] products;
	
	
	public Subitem(int sid,String name,String note) {
		this.sid = sid;
		this.name = name;
		this.note = note;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}
	
	public void setProducts(Product[] products) {
		this.products = products;
	}
	
	public Item getitem() {
		return this.item;
	}
	
	public Product[] getProducts() {
		return this.products;
	}
	
	
	public String getInfo() {
		return "×ÓÀ¸Ä¿±àºÅ" + this.sid + "£¬Ãû³Æ£º" + this.name + "£¬ÃèÊö£º" + this.note;
	}
	
	
	
	
}
