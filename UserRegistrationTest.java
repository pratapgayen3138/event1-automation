package main.java.com.event;

import static org.junit.Assert.*;

import main.java.com.event.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class UserRegistrationTest extends User {
	
	@InjectMocks
	private UserRegistration usrReg;

	@Before
	public void setUp() throws Exception {
		 MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testUserRegistration() {
		
		
	}

	@Test
	public void testValidate() {
		
	boolean usrRegExp = false;
	boolean usrRegAct = true;
	User usr = new User();
	usr.setAge(20);
	usr.setEmail("xyz@gmail.com");
	usr.setName("Test");
	try {
		usrRegExp = usrReg.validate(usr);
	} catch (RegistrationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
	assertEquals(usrRegExp, usrRegAct)	;
	}

	@Test
	public void testValidateFirstName() {
		
		String str =  "Test User";
		boolean expResult = false;
		boolean actResult = true;
		try {
			expResult = usrReg.validateFirstName(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(actResult,expResult);
	}

	@Test
	public void testValidateEmailAddress() {

		boolean  expResult = true;
		boolean actResult = true;
		String email  = "xyz@gmail.com";
		try {
			expResult = usrReg.validateEmailAddress(email);
		} catch (RegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expResult, actResult);
	}

	@Test
	public void testValidateAge() {

		 int age = 25;
		 boolean expAge = true;
		 boolean actAge = true;
		 try {
			actAge= usrReg.validateAge(age);
		} catch (RegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 assertEquals(expAge, actAge);
	}

}
