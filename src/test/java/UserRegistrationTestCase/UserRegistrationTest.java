package UserRegistrationTestCase;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserRegistrationTest {
	
	@Test
	public void welcomeMessageTest()
	{
		UserRegistration userRegistration=new UserRegistration();
		String welcomeMessageResult=userRegistration.welcomeMessage("Welcome to user registration");
		assertSame("Welcome to user registration",welcomeMessageResult);
	}
	
	@Test
	public void userFirstNameTest()
	{
		boolean firstNameResult=UserRegistration.firstNameValidation("Tejesh");		
		assertEquals(true, firstNameResult);
	}
	@Test
	public void userLastNameTest()
	{
		boolean lastNameResult=UserRegistration.LastNameValidation("Tejesh Vakka");		
		assertEquals(true, lastNameResult);
	}
	

	
}
