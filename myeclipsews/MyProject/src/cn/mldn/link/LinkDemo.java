package cn.mldn.link;

public class LinkDemo {

	public static void main(String[] args) {
		
		Link all = new Link();
		
		all.add(new Book("JAVA����",79.8));
		
		all.add(new Book("JSP����",69.8));
		
		all.add(new Book("ORACLE����",89.8));
		
		System.out.println("������ĸ�����" + all.size());
		
		System.out.println(all.contains(new Book("JAVA����",79.8)));
		
	//	all.remove(new Book("ORACLE����",89.8));
		
		Book[] books = all.toArray();
		
		for(int i=0;i<books.length;i++) {
			System.out.println(books[i].getInfo());
		}
		
		
		
		
	}
	
//	public static void print(Node current) {
//		
//		if(current == null) {
//			return;
//		}
//		
//		System.out.println(current.getDate());
//		
//        print(current.getNext());
//		
//	}
	
	

}
