package cn.mldn.inner;

class Outer {
	
	private  String msg = "Hello World!";
	
	public void fun(final int num) {
		
		final double score = 99.9;
		
		class Inner{
			
			public void print() {
				
				System.out.println(Outer.this.msg);
				System.out.println(num);
				System.out.println(score);
					
			}
		}
		
		new Inner().print();
		
	}
	
//	public void fun() {
////		inner in = new inner();
//		//in.info = "312";
////		System.out.println(in.info);
//		
//		//new inner().print();
//		
//		
//		
//		
//	}
	
	
}
