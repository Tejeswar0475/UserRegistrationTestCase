package UserRegistrationTestCase;
	
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class ParameterisedEntry extends Exception
	{
	
	    boolean name1(String name) throws InvalidInputException
	    {

	        Pattern nameRegex = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,12}$");
	        Matcher nameMatch = nameRegex.matcher(name);
	        boolean result = nameMatch.matches();
	        if (result) {
	            return true;
	        }
	        else {
	            throw new InvalidInputException("Note: Enter name with First Letter Capital ");
	        }
	    }
	    boolean mobileNumber1(String number) throws InvalidInputException
	    {
	        Pattern numberRegex = Pattern.compile("^[0-9]{2}\s[1-9]{1}[0-9]{9}$");
	        Matcher numberMatch = numberRegex.matcher(number);
	        boolean result = numberMatch.matches();
	        if (result)
	        {
	            return true;
	        }
	        else {
	            throw new InvalidInputException("Note: Enter phone number n ths :91 1234567890: format");
	        }
	     }
	    boolean email1(String email) throws InvalidInputException
	    {
	        Pattern emailRegex = Pattern.compile("^([a-zA-Z0-9]+)([_+.-]{1}[a-z0-9]+)*@([A-Za-z0-9]+).([a-z]{2,4})((.[a-z]{2,3})?)$");
	        Matcher emailMatch = emailRegex.matcher(email);
	        boolean result = emailMatch.matches();
	        if(result) {
	            return true;
	        }
	        else {
	            throw new InvalidInputException("Note: Email should be as abc.xyz@gmail.com.on here xyz and .in optional ");
	        }
	    }
	    boolean password1(String password) throws InvalidInputException
	    {
	        Pattern passwordRegex = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!_%*#?&]{1})[a-zA-Z0-9@$!_%*#?&]{8,}$");
	        Matcher passwordMatch = passwordRegex.matcher(password);
	        boolean result = passwordMatch.matches();
	        if (result)
	        {
	            return true;
	        }else {
	            throw new InvalidInputException("Note password should have at minimum one uppercase and one numeric and exctly one special char  ");
	        }
	    }
	   
}
