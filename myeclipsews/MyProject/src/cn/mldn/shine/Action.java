package cn.mldn.shine;

public class Action {
	
	private int aid;
	private String title;
	private String url;
	
	private Group group;
	
	public Action(int aid,String title,String url) {
		this.aid = aid;
		this.title = title;
		this.url = url;
	}
	
	public void setGroup(Group group) {
		this.group = group;
	}
	
	public Group getGroup() {
		return this.group;
	}
	
	public String getInfo() {
		
		return "权限编号：" + this.aid + "，名称：" + this.title + "，路劲" + this.url;  
		
	}
	
	
	
	
}
