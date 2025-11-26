package Day43.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {
	@AfterTest
	void thirdtest() {
		System.out.println("This is 3");
	}

	@Test
	void fourthtest() {
		System.out.println("This is 4");
	}
}
