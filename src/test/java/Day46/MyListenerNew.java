package Day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListenerNew implements ITestListener {

	public void onStart(ITestContext context) {
		System.out.println("Test Execution is started");
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test is failed");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is skipped");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test sExecution is completed");
	}
}
