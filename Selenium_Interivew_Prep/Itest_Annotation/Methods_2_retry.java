package Itest_Annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Methods_2_retry {
	@Test
	public void firstr() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void second() {
		Assert.assertEquals(false, true);
	}
}
