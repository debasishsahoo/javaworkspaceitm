package staticArea;

public class StaticClass {

	static class VipUsers {
	    public void displayVipUsers() {
	      System.out.println("Welcome Vip User");
	    }
	  }
	
	class NormalUsers {
	    public void displayNormalUsers() {
	      System.out.println("Welcome Normal User");
	    }
	  }
	
	public static void main(String args[]) {
	    //Nested static class doesn't require instantiation of the outer class
		StaticClass.VipUsers vip = new StaticClass.VipUsers();
	    vip.displayVipUsers();

	    /*Below line will throw error as the non-static class require 
	        instantiation of the outer class
	        Users.NormalUsers normal = new Users.NormalUsers();*/

	    //Nested non-static class require instantiation of the outer class
	    StaticClass users = new StaticClass();
	    StaticClass.NormalUsers normal = users.new NormalUsers();
	    normal.displayNormalUsers();
	  }

}
