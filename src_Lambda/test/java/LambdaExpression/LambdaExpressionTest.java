package LambdaExpressions;

import static org.junit.Assert.*;
import org.junit.Test;
public class LambdaExpressionTest {

	@Test
	public void NameTest()
    	{
		try {
			try {
				LambdaExpressions name = new LambdaExpressions();
                		boolean output = name.checkName("ilta");
                		assertTrue(output);
			}
			catch (NullPointerException e) {
                		e.printStackTrace();
            		}
		}
		catch (InvalidInputExceptionLambda e) {
            		e.printStackTrace();
        	}
    	}

	@Test
	public void EmailIdTest()
	{
		try
		{	try
			{
           			LambdaExpressions newEmail = new LambdaExpressions();
                		boolean output = newEmail.email("abc1234@gmail.com");
                		assertTrue(output);
            		}
            		catch(NullPointerException e)
             		{
                		e.printStackTrace();
             		}
       		}
		catch(InvalidInputExceptionLambda e)
		{
			e.printStackTrace();
		}
	}

	@Test
	public void MobileTest()
	{
		try
		{
			try
			{
           			LambdaExpressions phoneNumber = new LambdaExpressions();
                		boolean output = phoneNumber.mobileNumber("91 1204356789");
                		assertTrue(output);
            		}
             		catch (NullPointerException e)
            		{
                		e.printStackTrace();
             		}
       		}
       		catch(InvalidInputExceptionLambda e)
       		{
           		e.printStackTrace();
       		}
        }

	@Test
	public void PasswordTest()
	{
		try
		{
			try
            		{
           			LambdaExpressions passWord = new LambdaExpressions();
               			boolean output = passWord.password("Thomas#2@87B");
               			assertTrue(output);
            		}
            		catch (NullPointerException e)
            		{
                		e.printStackTrace();
            		}
       		}
	 	catch(InvalidInputExceptionLambda e)
       		{
           		e.printStackTrace();
      	 	}
    	}
}
