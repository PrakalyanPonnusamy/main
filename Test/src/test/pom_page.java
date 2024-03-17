package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class pom_page {
	@Test
	public void login() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		
		pom.username(driver).sendKeys("prakalyan_ponnusamy");
		pom.password(driver).sendKeys("Prakal@027");
		pom.click(driver).click();
		
	}
}
