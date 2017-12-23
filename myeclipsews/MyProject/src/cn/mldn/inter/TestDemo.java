package cn.mldn.inter;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//X x = new X();
		
//		A a = new X();
//		
//		B b = (B)a;
//		
//		//a.print();
//		
//		//b.get();
//		
//		System.out.println(a instanceof A);
//		
//		System.out.println(a instanceof B );
		
//		Computer com = new Computer();
//		
//		com.plugin(new Flash());
//		
//		com.plugin(new Print());
		
//		Subject subject = new ProxySubject(new RealSubject());
//		
//		subject.make();
		
	Fruit fruit = Factory.getInstance("orange");	
	
	fruit.eat();
		
		
		
	}

}
