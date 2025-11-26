package Day44;

import org.testng.annotations.Test;

public class SignUpTests  
{
	@Test(priority=1, groups="Regression")
	void signupbyEmail() 
	{
		System.out.println("This is signup by Email");
	}
	
	@Test(priority=2, groups="Regression")
	void signupbyFacebook() 
	{
		System.out.println("This is signup by Facebook");
	}
	
	@Test(priority=3, groups="Regression")
	void signupbyTwitter() 
	{
		System.out.println("This is signup by Twitter");
	}
}
