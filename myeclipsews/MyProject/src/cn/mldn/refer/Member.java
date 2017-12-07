package cn.mldn.refer;

public class Member {
	
	private int mid;
	private String name;
	private Member child;
	
	private Car car;
	
	public Member(int mid,String name) {
		this.mid = mid;
		this.name = name;
	}
	
	public String getInfo() {
		return "ÈËÔ±±àºÅ£º" + this.mid + ",ĞÕÃû£º" + this.name;
	}
	
	public void setChild(Member child) {
		this.child = child;
	}
	
	public Member getChild() {
		return this.child;
	}
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	public Car getCar() {
		return this.car;
	}
}

