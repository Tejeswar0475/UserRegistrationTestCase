package UserRegistrationTestCase;

import java.util.regex.*;

public class UserRegistration {
	
	String welcomeMessage(String welcomeMessage)
	{		
		return welcomeMessage;
	}
	
	public static boolean firstNameValidation(String userInputFirstName)
	{
		Pattern firstNameRegExp=Pattern.compile("(^[A-Z]{1})[a-z]{2,}");
		Matcher matchResult=firstNameRegExp.matcher(userInputFirstName);
		boolean firstNameResult=matchResult.matches();
		return firstNameResult;
	}
		
}