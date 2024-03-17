package bestbuy_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class weppage_bestbuy_automation {
	@SuppressWarnings("deprecation")
	@Test
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.bestbuy.com/?intl=nosplash");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, FindBy_Bestbuy.class);
		FindBy_Bestbuy.searchbox.sendKeys("6252354");
		FindBy_Bestbuy.searchbox.sendKeys(Keys.ENTER);
		FindBy_Bestbuy.addtocart.click();
		FindBy_Bestbuy.gotocart.click();
		FindBy_Bestbuy.checkout.click();
		FindBy_Bestbuy.guesty_login.click();
	}

}
