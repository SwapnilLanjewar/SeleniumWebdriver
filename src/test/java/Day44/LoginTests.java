package Day44;

import org.testng.annotations.Test;

public class LoginTests 
{
	@Test(priority=1, groups="Sanity")
	void LoginByEmail() 
	{
		System.out.println("This is login by Email");
	}
	
	@Test(priority=2, groups="Sanity")
	void LoginByFacebook() 
	{
		System.out.println("This is login by Facebook");
	}
	
	@Test(priority=3, groups="Sanity")
	void LoginByTwitter() 
	{
		System.out.println("This is login by Twitter");
	}
}
