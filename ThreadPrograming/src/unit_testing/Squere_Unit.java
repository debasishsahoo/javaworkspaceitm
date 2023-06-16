package unit_testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class Squere_Unit {

	@Test
	public void test() {
		HelloWorld obj=new HelloWorld();
		int output=obj.Squere(4);
		assertEquals(16,output);
	}

}
