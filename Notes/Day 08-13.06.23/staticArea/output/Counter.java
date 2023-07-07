package staticArea.output;

public class Counter {
	 int count1 = 0;
	  static int count2 = 0;

	  Counter() {
	    count1++;
	    count2++;
	    System.out.println("Counter1: " + count1);
	    System.out.println("Counter2: " + count2);
	  }

	  public static void main(String args[]) {
	    Counter c1 = new Counter();
	    Counter c2 = new Counter();
	    Counter c3 = new Counter();
	  }
}
