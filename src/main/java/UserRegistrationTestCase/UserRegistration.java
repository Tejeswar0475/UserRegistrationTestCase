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

	public static boolean mobileFormatValidation(String userInputMobileFormat)
	{

		Pattern mobileFormatRegExp=Pattern.compile("^[0-9]{2}\\s[0-9]{10}");
		Matcher matchResult=mobileFormatRegExp.matcher(userInputMobileFormat);
		boolean mobileFormatResult=matchResult.matches();
		return mobileFormatResult;
	}

	public static boolean minimunCharectersValidation(String userInputminEightChar)
	{

		Pattern minCharRegExp=Pattern.compile("^[A-Za-z0-9]{8,}$");
		Matcher matchResult=minCharRegExp.matcher(userInputminEightChar);
		boolean minCharResult=matchResult.matches();
		return minCharResult;
	}
	
	public static boolean minimunOneUpperCaseValidation(String userInputminUpperCase)
	{

		Pattern minUpperCaseRegExp=Pattern.compile("^[A-Za-z0-9]{8,}$");
		Matcher matchResult=minUpperCaseRegExp.matcher(userInputminUpperCase);
		boolean minUpperCaseResult=matchResult.matches();
		return minUpperCaseResult;
	}
	
}

