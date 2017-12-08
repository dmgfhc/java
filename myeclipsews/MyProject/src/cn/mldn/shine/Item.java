package cn.mldn.shine;

public class Item {

	private int iid;
	private String name;
	private String note;
	
	private Subitem subitems [];
	private Product products [];
	
	public Item(int iid,String name,String note) {
		this.iid = iid;
		this.name = name;
		this.note = note;
	}
	
	public void setSubitems(Subitem[] subitems) {
		this.subitems = subitems;
	}
	
	public void setProducts(Product[] products) {
		this.products = products;
	}
	
	public Subitem[] getSubitems() {
		return this.subitems;
	}
	
	public Product[] getProducts() {
		return this.products;
	}
	
	
	public String getInfo() {
		return "À¸Ä¿±àºÅ" + this.iid + "£¬Ãû³Æ£º" + this.name + "£¬ÃèÊö£º" + this.note;
	}
	
	
}
