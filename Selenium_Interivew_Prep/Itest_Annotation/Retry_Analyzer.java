package Itest_Annotation;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Analyzer implements IRetryAnalyzer{
	int initial=0;
	int retry=4;
	@Override
	public boolean retry(ITestResult result) {
		if(initial<retry) {
			initial++;
			return true;
		}
		return false;
	}

}
