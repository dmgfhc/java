package cn.mldn.shine;

public class TestDemo {

	public static void main(String[] args) {
		
		Province pro = new Province(1,"�ӱ�ʡ");
		
		City c1 = new City(1001,"��ɽ");
		City c2 = new City(1002,"�ػʵ�");
		City c3 = new City(1003,"ʯ��ׯ");
		
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
