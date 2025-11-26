package Day44;

import org.testng.Assert;
import org.testng.annotations.Test;

/*OpenApp
 * Login
 * Search
 * Advancesearch
 * Logout
 */

public class DependencyMethods 
{
	@Test(priority=1)
	void OpenApp() 
	{
		Assert.assertTrue(false);
	}
	
	@Test(priority=2, dependsOnMethods= {"OpenApp"})
	void Login() 
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=3)
	void Search() 
	{
		Assert.assertEquals("ABC", "ABC");
	}
	
	@Test(priority=4, dependsOnMethods= {"Login"})
	void Advancesearch() 
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=5)
	void Logout() 
	{
		Assert.assertTrue(true);
	}
}
