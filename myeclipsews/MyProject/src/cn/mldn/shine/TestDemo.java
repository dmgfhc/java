package cn.mldn.shine;

public class TestDemo {

	public static void main(String[] args) {
		
//		Province pro = new Province(1,"�ӱ�ʡ");
//		
//		City c1 = new City(1001,"��ɽ");
//		City c2 = new City(1002,"�ػʵ�");
//		City c3 = new City(1003,"ʯ��ׯ");
//		
//		c1.setProvince(pro);
//		c2.setProvince(pro);
//		c3.setProvince(pro);
//		
//		pro.setCities(new City[] {c1,c2,c3});
//		
//		System.out.println(c2.getProvince().getinfo());
//		
//		for(int x =0;x<pro.getCities().length;x++) {
//			System.out.println(pro.getCities()[x].getInfo());
//		}
		
		Item item = new Item(1,"��������","-");
		Subitem suba = new Subitem(1001,"����","-");
		Subitem subb = new Subitem(1002,"����","-");
		Product proa = new Product(9001,"����",500.0);
		Product prob = new Product(9002,"����",3000.0);
		Product proc = new Product(9003,"�˵�",1000.0);
		Product prod = new Product(9004,"ˮ����",80.0);
		
		suba.setItem(item);
		subb.setItem(item);
		suba.setProducts(new Product[] {proa,prob});
		subb.setProducts(new Product[] {proc,prod});
		item.setSubitems(new Subitem[] {suba,subb});
		item.setProducts(new Product[] {proa,prob,proc,prod});
		proa.setItem(item);
		prob.setItem(item);
		proc.setItem(item);
		prod.setItem(item);
		proa.setSubitem(suba);
		prob.setSubitem(suba);
		proc.setSubitem(subb);
		prod.setSubitem(subb);
		
		System.out.println(item.getInfo());
		
		for(int x=0;x<item.getSubitems().length;x++) {
			System.out.println("\t|-" + item.getSubitems()[x].getInfo());
			for(int y=0;y<item.getSubitems()[x].getProducts().length;y++) {
				System.out.println("\t\t|-" + item.getSubitems()[x].getProducts()[y].getInfo());
			}
		}
		
		
	}

}
