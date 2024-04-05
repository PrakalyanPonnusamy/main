package Retry_test;

import org.testng.annotations.Test;
import org.testng.Assert;


public class retry {
	@Test
	public void first() {
		Assert.assertEquals(true, true);
	}
	@Test
	public void second() {
		Assert.assertEquals(true, true);
	}
}
