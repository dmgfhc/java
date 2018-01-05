package cn.mldn.enums;

//class Color{
//	
////	private String title;
////	private static final Color Red = new Color("红色");
////	private static final Color Green = new Color("绿色");
////	private static final Color Blue = new Color("蓝色");
////	
////	private Color(String title) {
////		this.title = title;
////	}
////	
////	public static Color getInstance(int ch) {
////		
////		switch(ch) {
////		case 1:
////			return Red;
////		case 2:
////			return Green;
////		case 3:
////			return Blue;
////		default:
////			return null;
////		
////		}
////	}
////	
////	public String toString() {
////		return this.title;
////	}
//	
//	
//	
//	
//}

//interface Message{
//	
//	public String getTitle();
//	
//}

//enum Color implements Message{
//	
//	RED("红色"){
//		public String getTitle() {
//			return this.toString();
//		}
//		
//	},BLUE("蓝色"){
//		public String getTitle() {
//			return this.toString();
//		}
//	},GREEN("绿色"){
//		
//		public String getTitle() {
//			return this.toString();
//		}
//	};
//	private String title;
//	private Color(String title) {
//		this.title = title;
//	}
//	public String toString() {
//		return this.title;
//	}
//	
//}

//enum Color{
//	
//	RED,GREEN,BLUE;
//	
//}

enum Sex{
	MALE("男"),FEMALE("女");
	private String title;
	private Sex(String title) {
		this.title = title;
	}
	public String toString() {
		return this.title;
	}
}

class Person{
	
	private String name;
	private int age;
	private Sex sex;
	
	public Person(String name,int age,Sex sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public String toString() {
		
		return "姓名" + this.name + ",年龄" + this.age + ",性别" + this.sex;
		
	}
}


class TestDemo {

	public static void main(String[] args) {
		
//		Color red = Color.RED;
//		System.out.println(red);
		
//		Message msg = Color.RED;
//		
//		System.out.println(msg.toString());
	
//	for(Color c:Color.values()) {
//		
//		System.out.println(c);
//		
//	}
		
//	Color c = Color.RED;
//	
//	switch(c) {
//	
//	case RED:
//		System.out.println("这是红色");
//		break;
//	case GREEN:
//		System.out.println("这是绿色");
//		break;
//	case BLUE:
//		System.out.println("这是蓝色");
//		break;
//	}
	
		Person p = new Person("韩超",20,Sex.MALE);
	
		System.out.println(p);
		
		
		
	}

}
