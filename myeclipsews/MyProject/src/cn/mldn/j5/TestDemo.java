package cn.mldn.j5;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(add(1,2));
		
		//System.out.println(add(10,20));
		
//		System.out.println(add(new int[] {10,20}));
		
		int[] data = new int[] {1,2,3,4,5};
		
		for(int x : data) {
			System.out.println(x);
		}
		
	}
	
	public static int add(int ... data) {
		int sum = 0;
		for(int x=0;x<data.length;x++) {
			sum+=data[x];
		}
		return sum;
	}
	
	
	
}
