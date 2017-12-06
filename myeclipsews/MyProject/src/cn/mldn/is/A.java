package cn.mldn.is;

public class A {

	private B b;
	public A() {
		
		this.b = new B(this);
		this.b.get();
	}
	public void print() {
		System.out.println("Hello World!!");
	}
}
