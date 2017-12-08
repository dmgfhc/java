package cn.mldn.compare;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1 = new Book("JAVA开发",79.8);
	
		Book b2 = new Book("JAVA开发",79.7);
		
		if(b1.compare(b2)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
	
	

}
