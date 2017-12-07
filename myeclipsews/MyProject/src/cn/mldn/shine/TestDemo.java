package cn.mldn.shine;

public class TestDemo {

	public static void main(String[] args) {
		
		Province pro = new Province(1,"河北省");
		
		City c1 = new City(1001,"唐山");
		City c2 = new City(1002,"秦皇岛");
		City c3 = new City(1003,"石家庄");
		
		c1.setProvince(pro);
		c2.setProvince(pro);
		c3.setProvince(pro);
		
		pro.setCities(new City[] {c1,c2,c3});
		
		System.out.println(c2.getProvince().getinfo());
		
		for(int x =0;x<pro.getCities().length;x++) {
			System.out.println(pro.getCities()[x].getInfo());
		}
		
	}

}
