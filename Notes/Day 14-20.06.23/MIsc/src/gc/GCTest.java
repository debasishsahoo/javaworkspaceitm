package gc;

public class GCTest {
	String objRef;

	public GCTest(String objRef) {
		this.objRef = objRef;
	}

	public static void main(String[] args) {
		System.out.println("hi");
		GCTest t1 = new GCTest("t1");
		GCTest t2 = new GCTest("t2");
		t1 = t2;
// Invoke garbage collection.
		System.gc();
	}

	@Override
	/*
	 * Overriding finalize method to check whether object previously referenced by
	 * objRef is garbage collected or not.
	 */
	protected void finalize() throws Throwable {
		System.out.println("Object previously referenced by " + this.objRef + " is successfully garbage collected.");
	}
}