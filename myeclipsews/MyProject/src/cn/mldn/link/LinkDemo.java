package cn.mldn.link;

public class LinkDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Node root = new Node("��ͷ");
//		
//		Node n1 = new Node("����A");
//		
//		Node n2 = new Node("����B");
//		
//		
//		root.setNext(n1);
//		
//		n1.setNext(n2);
		
//		Node currentNode = root;
		
//		while(currentNode!=null) {
//			System.out.println(currentNode.getDate());
//			currentNode = currentNode.getNext();
//		}
		
		//print(root);
		
		Link link = new Link();
		
		link.add("hello");
		link.add("WORLD");
		link.add("MLDN");
		link.add("www");
		
		link.print();
		
		
		
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
