package cn.mldn.shine;

public class Admin {

	private String aid;
	private String password;
	private Role role;
	
	public Admin(String aid,String password) {
		this.aid = aid;
		this.password = password;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	public Role getRole() {
		return this.role;
	}
	
	public String getInfo() {
		
		return "π‹¿Ì‘±±‡∫≈" + this.aid + "√‹¬Î" + this.password;
	}
	
	
	
}
