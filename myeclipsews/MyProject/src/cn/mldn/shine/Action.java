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
		
		return "Ȩ�ޱ�ţ�" + this.aid + "�����ƣ�" + this.title + "��·��" + this.url;  
		
	}
	
	
	
	
}
