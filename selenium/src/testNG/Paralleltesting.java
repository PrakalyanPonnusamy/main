package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Paralleltesting {
@Test
public void Google() {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
	WebDriver driver =new EdgeDriver();
	driver.get("https://www.google.com/");
	driver.quit();
}
@Test
public void Bing() {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
	WebDriver driver =new EdgeDriver();
	driver.get("https://www.bing.com/");
	driver.quit();
}

}
