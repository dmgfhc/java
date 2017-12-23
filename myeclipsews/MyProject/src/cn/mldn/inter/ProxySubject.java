package cn.mldn.inter;

public class ProxySubject implements Subject {

	private Subject subject;
	
	public ProxySubject(Subject subject) {
		
		this.subject = subject;
	}
	
	public void prepare() {
		System.out.println("׼������");
	}
	
	public void make() {
		this.prepare();
		subject.make();
		this.destroy();
	}
	
	public void destroy() {
		System.out.println("���̽���");
	}
	
	
}
