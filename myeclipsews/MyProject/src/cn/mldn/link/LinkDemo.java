package cn.mldn.link;

public class LinkDemo {

	public static void main(String[] args) {
		
		Link all = new Link();
		
		all.add(new Book("JAVA开发",79.8));
		
		all.add(new Book("JSP开发",69.8));
		
		all.add(new Book("ORACLE开发",89.8));
		
		System.out.println("保存书的个数：" + all.size());
		
		System.out.println(all.contains(new Book("JAVA开发",79.8)));
		
	//	all.remove(new Book("ORACLE开发",89.8));
		
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
