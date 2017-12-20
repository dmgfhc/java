package cn.mldn.poly;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new B();
		
		System.out.println(a instanceof A);
		
		System.out.println(a instanceof B);
		
		if(a instanceof A) {
			
			B b = (B)a;
			a.print();
		}
		
		
	}

}
