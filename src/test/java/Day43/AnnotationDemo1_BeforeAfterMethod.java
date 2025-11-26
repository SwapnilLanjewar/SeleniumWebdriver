package Day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*Login
 * Search
 * Logout
 * Login
 * AdvanceSearch
 * Logout
 */


public class AnnotationDemo1_BeforeAfterMethod {

	     @BeforeMethod
		void login() 
		{
			System.out.println("This is Login");
		}
		
		@Test
		void search() 
		{
			System.out.println("This is search");
		}
		
		@Test
		void advancesearch() 
		{
			System.out.println("This is advance search");
		}
		
		@AfterMethod
		void logout() 
		{
			System.out.println("This is Logout");
		}
	}

