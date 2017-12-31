package cn.mldn.exception;

public class TestDemo {

	public static void main(String[] args) {
		
		try {
//		System.out.println(MyMath.div(10, 2));
			
			throw new Exception("这个一个错误的异常");
			
		}
		catch (Exception e){
			
			e.printStackTrace();
		}
	}

}
