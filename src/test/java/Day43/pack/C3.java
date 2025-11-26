package Day43.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class C3 {
	@BeforeSuite
	void fifth() 
	{
		System.out.println(99999);
	}
	
	@AfterSuite
	void sixth() 
	{
		System.out.println("1010101010");
	}

}
