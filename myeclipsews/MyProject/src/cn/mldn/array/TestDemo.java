package cn.mldn.array;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortArray arr = new SortArray(3);
		
		System.out.println(arr.add(100));
		
		System.out.println(arr.add(20));
		
		System.out.println(arr.add(19));
		
		System.out.println(arr.add(100));
		
		int[] temp = arr.getData();
		
		for(int x=0;x<temp.length;x++) {
			System.out.println(temp[x]);
		}
		

	}

}
