package Cucumber.Cucumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class ca {
	Calci c=new Calci();
	

	@Test
	public void test() {
		assertEquals(5,c.add(2, 3));
		assertEquals(6,c.mul(2, 3));
	}

}
