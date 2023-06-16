package unit_testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class Qube_Unit {

	@Test
	public void test() {
		HelloWorld obj=new HelloWorld();
		int output=obj.Qube(4);
		assertEquals(64,output);
	}

}
