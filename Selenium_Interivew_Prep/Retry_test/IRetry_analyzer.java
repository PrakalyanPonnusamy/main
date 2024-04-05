package Retry_test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IRetry_analyzer {
	@Test(retryAnalyzer = retrylistner.class)
	public void firstone(){
		Assert.assertEquals(false, true);
	}
	@Test(retryAnalyzer = retrylistner.class)
	public void secondone() {
		Assert.assertEquals(false, false);
	}

}
