package cn.mldn.enums;

//class Color{
//	
////	private String title;
////	private static final Color Red = new Color("��ɫ");
////	private static final Color Green = new Color("��ɫ");
////	private static final Color Blue = new Color("��ɫ");
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
//	RED("��ɫ"){
//		public String getTitle() {
//			return this.toString();
//		}
//		
//	},BLUE("��ɫ"){
//		public String getTitle() {
//			return this.toString();
//		}
//	},GREEN("��ɫ"){
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
	MALE("��"),FEMALE("Ů");
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
		
		return "����" + this.name + ",����" + this.age + ",�Ա�" + this.sex;
		
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
//		System.out.println("���Ǻ�ɫ");
//		break;
//	case GREEN:
//		System.out.println("������ɫ");
//		break;
//	case BLUE:
//		System.out.println("������ɫ");
//		break;
//	}
	
		Person p = new Person("����",20,Sex.MALE);
	
		System.out.println(p);
		
		
		
	}

}
