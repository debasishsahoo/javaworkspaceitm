package mainthread;

class A {
	int i;
	boolean flag = false; 

	synchronized void deliver(int i) {
		if (flag)
			try {
				wait(); 
			} catch (InterruptedException ie) {
				System.out.println(ie);
			}
		this.i = i;
		flag = true; 
		System.out.println("Data Delivered: " + i);
		notify(); 
	}

	synchronized int receive() {
		if (!flag)
			try {
				wait(); 
			} catch (InterruptedException ie) {
				System.out.println(ie);
			}
		System.out.println("Data Received: " + i);
		flag = false; 
		notify();
		return i;
	}
}

class Thread10 extends Thread {
	A obj;

	Thread10(A obj) {
		this.obj = obj;
	}

	public void run() {
		for (int j = 1; j <= 5; j++) {
			obj.deliver(j);
		}
	}
}

class Thread20 extends Thread {
	A obj;

	Thread20(A obj) {
		this.obj = obj;
	}

	public void run() {
		for (int k = 0; k <= 5; k++) {
			obj.receive();
		}
	}
}

public class Communication {
	public static void main(String[] args) {
		A obj = new A(); 
		Thread10 t1 = new Thread10(obj);
		Thread20 t2 = new Thread20(obj);
		t1.start();
		t2.start();
	}
}