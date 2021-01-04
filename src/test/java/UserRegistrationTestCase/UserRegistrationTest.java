package UserRegistrationTestCase;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserRegistrationTest {

	public void welcomeMessageTest()
	{
		UserRegistration userRegistration=new UserRegistration();
		String welcomeMessageResult=userRegistration.welcomeMessage("Welcome to user registration");
		assertSame("Welcome to user registration",welcomeMessageResult);
	}
}
