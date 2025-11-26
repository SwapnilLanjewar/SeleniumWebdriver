package Day43.pack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {

	@BeforeTest
	void firsttest() {
		System.out.println("This is 1");
	}

	@Test
	void secondtest() {
		System.out.println("This is 2");
	}

}
