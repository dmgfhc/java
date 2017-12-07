package cn.mldn.shine;

public class Province {

	private int pid;
	private String name;
	
	private City[] cities;
	
	public Province(int pid,String name) {
		this.pid = pid;
		this.name = name;
	}
	
	public void setCities(City[] cities) {
		this.cities = cities;
	}
	
	public City[] getCities() {
		return this.cities;
	}
	
	public String getinfo() {
		
		return "Ê¡·Ý±àºÅ£º" + this.pid + "£¬Ãû³Æ" + this.name;
		
	}
	
	
	
}
