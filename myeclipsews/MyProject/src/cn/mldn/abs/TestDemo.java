package cn.mldn.abs;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fun(new Robot());
		fun(new Human());
		fun(new Pig());
		
	}
	
	public static void fun(Action act) {
		
		act.command(Action.EAT);
		act.command(Action.SLEEP);
		act.command(Action.WORK);
		
	}

}
