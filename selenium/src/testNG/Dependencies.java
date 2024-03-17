package testNG;

import org.testng.annotations.Test;

public class Dependencies {
	@Test(enabled = true)				// all the methos depends on this Main method if this fails everything will fail
	public void HighSchool() {
		System.out.println("High school");
	}
	@Test(dependsOnMethods = "HighSchool", enabled = true) // we can also use enable here as well
	public void HighSec() {
		System.out.println("Higher Secondary");
	}
	@Test(dependsOnMethods = "HighSec")
	public void College() {
		System.out.println("College");
	}
}
