package cn.mldn.object;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Link all = new Link();
//		
//		all.add("A");
//		
//		all.add("B");
//		
//		all.add("C");
//		
//		Object[] data = all.toArray();
//		
//		for(int x=0;x<data.length;x++) {
//			String str = (String)data[x];
//			System.out.println(str.toString());
//		}
		
		PetShop shop = new PetShop();
		
		shop.add(new Cat("��è",10));
		
		shop.add(new Cat("��è",20));
		
		shop.add(new Cat("��è",30));
		
		shop.add(new Dog("����",10));
		
		shop.add(new Dog("����",20));
		
		shop.add(new Dog("�׹�",30));
		
		Link all = shop.search("��");
		
		Object obj[] = all.toArray();
		
		for(int x =0;x<obj.length;x++) {
			
			System.out.println(obj[x]);
		}
		
		
		
		
	}

}
