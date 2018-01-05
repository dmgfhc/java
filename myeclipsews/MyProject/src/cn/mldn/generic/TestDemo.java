package cn.mldn.generic;

class MessageImpl<String> implements IMessage<String>{
	
	public void print(String t) {
		
		System.out.println(t);
		
	}
	
	
	
}





public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Point p = new Point();
//		
//		p.setX(10);
//		
//		p.setY(20);
//		
//		int x = (Integer)p.getX();
//		
//		int y = (Integer)p.getY();
//		
//		System.out.println("x×ø±ê£º" + x + "£¬y×ø±ê£º" + y);
		
//		Message<String> m1 = new Message<String>();
//		Message<Integer> m2 = new Message<Integer>();
//		
//		m1.setMsg("321");
//		
//		fun(m1);
		
//		m2.setMsg(990);
//		
//		fun(m2);
		IMessage<String> msg = new MessageImpl();
		msg.print("Hello World");
		
		System.out.println(fun("311"));
		
	}
	
	public static<T> T fun(T t) {
		
		return t;
		
	}
	

}
