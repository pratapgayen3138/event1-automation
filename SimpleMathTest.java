package test.java.com.event;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;

import main.java.com.event.SimpleMath;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class SimpleMathTest {
	
	@InjectMocks
	private SimpleMath sMath;
	@Rule
	public final ExpectedException expectedException = ExpectedException.none();

	@Before
	public void setUp() throws Exception {
		 MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testSum() {
		 int i =2;
		 int j =3;
		 int k =5;
		 int actRslt = sMath.sum(i, j);
		 org.junit.Assert.assertEquals(k, actRslt);
		 
		 
	}

		@Test
	public void testSubtraction() {
			 int i =5;
			 int j =2;
			 int k =3;
			 int actRslt = sMath.subtraction(i, j);
			 org.junit.Assert.assertEquals(k, actRslt);	 
	}

			@Test
	public void testMultiplication() {
			 int i =5;
			 int j =2;
			 int k =10;
			 int actRslt = sMath.multiplication(i, j);
			 org.junit.Assert.assertEquals(k, actRslt);	 
	}

	@Test
	public void testDivison() {
	int i =10;
	int j =2;
	int k =5;
	int actRslt =0;
	try {
		actRslt = sMath.divison(i, j);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	org.junit.Assert.assertEquals(k, actRslt);	
	}
	@Test
	public void testDivisonExp() {
	
		try {
			final Exception exception = new Exception("Divider can't be zero");
			Mockito.when(sMath.divison(any(int.class),any(int.class))).thenThrow(exception);
			expectedException.expect(Exception.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	}

	@Test
	public void testEqualIntegers() {
		
		int a = 2;
		int b= 2;
		boolean expRslt = true;
		boolean rslt = sMath.equalIntegers(a, b);
		assertEquals(expRslt,rslt);
	
	}

}
