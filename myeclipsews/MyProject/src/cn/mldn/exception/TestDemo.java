package cn.mldn.exception;

public class TestDemo {

	public static void main(String[] args) {
		
		try {
//		System.out.println(MyMath.div(10, 2));
			
			throw new Exception("���һ��������쳣");
			
		}
		catch (Exception e){
			
			e.printStackTrace();
		}
	}

}
