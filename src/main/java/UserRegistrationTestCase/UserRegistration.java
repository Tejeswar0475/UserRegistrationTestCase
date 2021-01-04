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
	
	public static boolean lastNameValidation(String userInputLastName)
	{
		Pattern lastNameRegExp=Pattern.compile("([A-Z]{1}[a-z]{2,}(\\s{1}){0,}[A-Z]{1}[a-z]{2,})");
		Matcher matchResult=lastNameRegExp.matcher(userInputLastName);
		boolean lastNameResult=matchResult.matches();
		return lastNameResult;
	}
	
	public static boolean emailValidation(String userInputEmail)
	{
		
		Pattern emailRegExp1=Pattern.compile("^([a-zA-Z0-9]+)([_+.-]{1}[a-z0-9]+)*@([A-Za-z0-9]+).([a-z]{2,4})((.[a-z]{2,3})?)$");				
		Matcher matchResult1=emailRegExp1.matcher(userInputEmail);	
		boolean emailResult1=matchResult1.matches();
							
		return emailResult1;
	}
		
}