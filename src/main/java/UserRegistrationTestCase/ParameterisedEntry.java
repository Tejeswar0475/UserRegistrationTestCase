package UserRegistrationTestCase;
	
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class ParameterisedEntry
	{
	    boolean Name(String name)
	    {
	        Pattern nameRegex = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,12}$");
	        Matcher nameMatch = nameRegex.matcher(name);
	        return nameMatch.matches();
	    }
	    boolean mobileNumber(String number)
	    {
	        Pattern numberRegex = Pattern.compile("^[0-9]{2}\s[1-9]{1}[0-9]{9}$");
	        Matcher numberMatch = numberRegex.matcher(number);
	        return numberMatch.matches();
	    }
	    boolean email(String email)
	    {
	        Pattern emailRegex = Pattern.compile("^([a-zA-Z0-9]+)([_+.-]{1}[a-z0-9]+)*@([A-Za-z0-9]+).([a-z]{2,4})((.[a-z]{2,3})?)$");
	        Matcher emailMatch = emailRegex.matcher(email);
		boolean result = emailMatch.matches();
	        if (result)
	            return true;
	        else
	            return false;        
	    }
	    boolean password(String password)
	    {
	        Pattern passwordRegex = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!_%*#?&]{1})[a-zA-Z0-9@$!_%*#?&]{8,}$");
	        Matcher passwordMatch = passwordRegex.matcher(password);
	        return passwordMatch.matches();
	    }
	    

}
