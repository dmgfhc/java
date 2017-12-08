package cn.mldn.compare;

class Info {

	private String msg = "hello";
	
	public void print() {
		System.out.println("msg=" + msg);
	}
	
	public void fun(Info temp) {
		temp.msg = "È¡ÏûÄÚÈİ";
	}
	
}
