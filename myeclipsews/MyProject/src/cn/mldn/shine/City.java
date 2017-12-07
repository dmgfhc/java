package cn.mldn.shine;

public class City {

	private int cid;
	private String name;
	
	private Province province;
	
	public City(int cid,String name) {
		this.cid = cid;
		this.name = name;
	}
	
	public void setProvince(Province province) {
		this.province = province;
	}
	
	public Province getProvince() {
		
		return this.province;
	}
	
	
	public String getInfo() {
		return "���б��" + this.cid + "������" + this.name;
	}
	
}
