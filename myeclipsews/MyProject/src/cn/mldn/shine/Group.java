package cn.mldn.shine;

public class Group {

	private int gid;
	private String title;
	
	private Role[] roles;
	private Action[] actions;
	
	
	public Group(int gid,String title) {
		this.gid = gid;
		this.title = title;
	}
	
	public void setRoles(Role[] roles) {
		this.roles = roles;
	}
	
	public void setActions(Action[] actions) {
		this.actions = actions;
	}
	
	public Action[] getActions() {
		return this.actions;
	}
	
	public Role[] getRoles() {
		return this.roles;
	}
	
	public String getInfo() {
		
		return "权限组编号：" + this.gid + "，名称：" + this.title;
		
	}
	
}
