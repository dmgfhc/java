package cn.mldn.refer;

public class Car {
	
	private Member member;
	
	private String pname;
	
	public Car(String pname) {
		this.pname = pname;
	}
	
	public String getInfo() {
		return "³µµÄÃû×Ö£º" + this.pname;
	}
	
	public void setMemeber(Member member) {
		this.member = member;
	}
	
	public Member getMember() {
		return this.member;
	}
	
	
}
