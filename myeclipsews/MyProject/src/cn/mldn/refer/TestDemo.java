package cn.mldn.refer;

public class TestDemo {

	public static void main(String[] args) {
		
		Message msg = new Message("Hello");
		fun(msg);
		System.out.println(msg.getInfo());
		
	}
	public static void fun(Message temp) {
		
		temp.setInfo("world");
		
		
	}

}
