package cn.mldn.refer;

public class TestDemo {

	public static void main(String[] args) {
		
		Member m = new Member(1,"张大");
		Member chd = new Member(2,"张二");
		Car c = new Car("奥拓");
		Car cc = new Car("拖拉机");
		
		m.setCar(c);
		c.setMemeber(m);
		
		chd.setCar(cc);
		cc.setMemeber(chd);
		m.setChild(chd);
		
		
		System.out.println(m.getCar().getInfo());
		System.out.println(c.getMember().getInfo());
		System.out.println(m.getChild().getInfo());
		System.out.println(m.getChild().getCar().getInfo());
		
		
	}
	public static void fun(Message temp) {
		
		temp.setInfo("world");
		
		
	}

}
