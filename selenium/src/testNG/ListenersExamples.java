package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersExamples implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("ON TEST START");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("ON TEXT SUCCESS");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("ON TEST FAILURE");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("ON TEST SKIPPED");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("ON TEST FAILED WITH SUCCESS PERCENT");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("ON TEST FAILED WITH TIMEOUT");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("ON START");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("ON FINISH");
	}

}
