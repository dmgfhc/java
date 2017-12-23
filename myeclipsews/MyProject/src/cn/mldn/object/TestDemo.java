package cn.mldn.object;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link all = new Link();
		
		all.add("A");
		
		all.add("B");
		
		all.add("C");
		
		Object[] data = all.toArray();
		
		for(int x=0;x<data.length;x++) {
			String str = (String)data[x];
			System.out.println(str.toString());
		}
		
		
		
		
	}

}
