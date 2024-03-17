package addidas;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WebpageAutomation {

@Test
	public void praveen() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.staging.adidas.com.my");
		Thread.sleep(30000);
		PageFactory.initElements(driver, pageobjectmodel.class);
		pageobjectmodel.RejectAll_Button.click();
		pageobjectmodel.search.sendKeys("IC2075");
		pageobjectmodel.search.sendKeys(Keys.ENTER);
//		Thread.sleep(5000);
//		pageobjectmodel.yellow_tshirt.click();
		
		
		
		

	}}