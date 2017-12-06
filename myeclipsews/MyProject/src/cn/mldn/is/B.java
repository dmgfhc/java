package cn.mldn.is;

public class B {

	private A a;
	public B(A a) {
		this.a = a;
	}
	public void get() {
		this.a.print();
	}
}
