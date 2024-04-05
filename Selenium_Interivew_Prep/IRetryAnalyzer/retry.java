package IRetryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class retry {

	@Test(retryAnalyzer = iretry.class)
	public void jana() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void gokul() {
		Assert.assertEquals(false, true);
	}
}
