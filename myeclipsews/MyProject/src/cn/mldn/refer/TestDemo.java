package cn.mldn.refer;

public class TestDemo {

	public static void main(String[] args) {
		
		Member m = new Member(1,"�Ŵ�");
		Member chd = new Member(2,"�Ŷ�");
		Car c = new Car("����");
		Car cc = new Car("������");
		
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
