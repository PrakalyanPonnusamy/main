package IRetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class iretry implements IRetryAnalyzer {
	int totalruns=0;
	int retry=4;
	@Override
	public boolean retry(ITestResult result) {
		if(totalruns<retry) {
			totalruns++;
			return true;
		}
		return false;
	}
	

}
