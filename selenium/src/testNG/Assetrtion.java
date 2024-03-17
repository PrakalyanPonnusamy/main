package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class Assetrtion {
	String Name = "Prahalya";
	public void checkequal() {
		Assert.assertEquals(Name, "Prahalya"); // this will just comapre the actual and the expected values
	}
}
