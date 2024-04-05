package Retry_test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retrylistner implements IRetryAnalyzer{
int testfailed = 0;
int retry = 4;
	@Override
	public boolean retry(ITestResult result) {
		if(testfailed<retry) {
			testfailed++;
			return true;
		}
		return false;
	}

}
