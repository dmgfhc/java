package cn.mldn.string;

public class StringDemo {

	public static void main(String[] args) {
		
//		String stra = new String("hello").intern();
//		
//		String strb = "hello";
//		
//		System.out.println(stra==strb);
//		String str = "hello";
//		char c = str.charAt(0);
//		System.out.println(c);
//		
//		String str = "123a423432";
//		
//		if(isNumber(str)) {
//			System.out.println("字符由字符串组成");
//		}else{
//			System.out.println("字符由非数字组成");
//		}
//		
//	}
//	
//	public static boolean isNumber(String temp) {
//		
//		char[] data = temp.toCharArray();
//		for(int x=0;x<data.length;x++) {
//			if(data[x]>'9' || data[x] <0) {
//				return false;
//			}
//		}
//		return true;
//	}
	
//	String str = "helloworld";
//	byte[] data = str.getBytes();
//	for(int x=0;x<data.length;x++) {
//		data[x]-=32;
//	}
//	System.out.println(new String(data));
//	System.out.println(new String(data,5,5));
	
//	String stra = "Hello";
//	String strb = "hELLO";
//	System.out.println(stra.equals(strb));
//	System.out.println(stra.equalsIgnoreCase(strb));
	
//	
//	String str = "helloworld";
//	
//	System.out.println(str.indexOf("world"));
//	
//	System.out.println(str.indexOf("l"));
//	
//	System.out.println(str.indexOf("l",5));
//	
//	System.out.println(str.lastIndexOf("l"));
		
//	String str = "##@@hello**";
//	System.out.println(str.startsWith("##"));
//	System.out.println(str.startsWith("@@",2));
//	System.out.println(str.endsWith("**"));
	
//	String str = "helloworld";
//	String resultA = str.replaceAll("l", "_");
//	String resultB = str.replaceFirst("l", "_");
//	System.out.println(resultA);
//	System.out.println(resultB);
		
//	String str = "helloworld";
//	String resultA = str.substring(5);
//	String resultB = str.substring(0, 5);
//	System.out.println(resultA);
//	System.out.println(resultB);
		
//	

//		
//	String str = "192.168.1.2";
//	String result[] = str.split("\\.");
//	for(int x=0;x<result.length;x++) {
//		System.out.println(result[x]);
//	}
		
//	
//	String stra = "hello";
//	String strb = stra + "world";
//	String strc = "hello world";
//	String strd = "hello" + " world";
//	System.out.println(stra == strc);
//	System.out.println(strb == strc);
//	System.out.println(strc == strd);
		
	String str = "(*(*Hello(*(*";
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
		
		
		
	}
}
