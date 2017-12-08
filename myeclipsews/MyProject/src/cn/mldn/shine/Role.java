package cn.mldn.shine;

public class Role {
	
	private int rid;
	private String title;
	private Admin admins [];
	private Group groups [];
	
	public Role(int rid,String title) {
		this.rid = rid;
		this.title = title;
	}
	
	public void setAdmins(Admin[] admins) {
		this.admins = admins;
	}
	
	public void setGroups(Group[] groups) {
		this.groups = groups;
	}
	
	public Group[] getGroups() {
		return this.groups;
	}
	
	public Admin[] getAdmins() {
		return this.admins;
	}
	
	public String getInfo() {
		return "½ÇÉ«±àºÅ£º" + this.rid +"Ãû³Æ£º" + this.title;
	}
	
	
	
}
