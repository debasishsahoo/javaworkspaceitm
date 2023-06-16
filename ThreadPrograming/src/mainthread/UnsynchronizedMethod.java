package mainthread;

class Table {
	synchronized void printTable1(int x) // First synchronized method.
	  {
	    for(int i = 1; i <= 5; i++)
	    {
	      System.out.println(x * i);
	      try
	      {
	        Thread.sleep(400);
	      }
	      catch(InterruptedException ie)
	      {
	        System.out.println(ie);
	      }
	   }
	}
	synchronized void printTable2(int y) // Second synchronized method.
	{
	  for(int j = 1; j <= 5; j++)
	  {
	    System.out.println(y * j);
	    try
	    {
	      Thread.sleep(400);
	    }
	   catch(InterruptedException ie)
	   {
	      System.out.println(ie);
	   }
	  }
	}
}

class Thread1 extends Thread {
	Table t;
	Thread1(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable1(2);
	}
}
class Thread2 extends Thread {
	Table t;

	Thread2(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable2(10);
	}
}

public class UnsynchronizedMethod {
	public static void main(String[] args) {
		// Create an object of class Table.
		Table obj = new Table();
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		t1.start();
		t2.start();
	}
}
