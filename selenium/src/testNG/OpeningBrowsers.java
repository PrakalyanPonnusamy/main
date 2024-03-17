package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class OpeningBrowsers {
	WebDriver driver;  // Since the driver is used in all the methods we are using driver in the main class so that it will be taken in all the drivers
	long starttime;//
	long endtime;  // we are initilizing the variable at the top of all
	@BeforeSuite
	public void allbrowsers(){  // we are creating a new method at the top of all browser as @beforesuite > that will be taken in all the @test
		starttime = System.currentTimeMillis();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		driver = new EdgeDriver();
	}
	@Test (priority = 0)
	public void Google() {
		driver.get("https://www.google.com/");
	}
	@Test (priority = 1)
	public void Bing() {
		driver.get("https://www.bing.com/#!");
	}
	@Test (priority = 2)
	public void DuckDuckGo() {
		driver.get("https://duckduckgo.com/&");
	}
	@AfterSuite
	public void Closingbrowser() {
		endtime = System.currentTimeMillis();
		driver.quit();
		long totaltime = endtime - starttime;
		System.out.println(totaltime);
		
	}
}
