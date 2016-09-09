package com.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMath {
	
	SimpleMath simpleMath = null;
	
	@Before
	public void setUp() throws Exception {
		simpleMath = new SimpleMath();
	}
	
	@Test
	public void fetchMailboxDataTest(){
		Assert.assertEquals(9, simpleMath.sum(4, 5));
	}

}
