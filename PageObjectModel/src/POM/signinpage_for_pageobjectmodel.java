package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class signinpage_for_pageobjectmodel {
	@Test
	public void email(){
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.bestbuy.com/identity/signin?token=tid%3Ac3e817e4-da8f-11ee-8bc6-0637a1a849d7");
		
		
		//programobjectmodel programobjectmodel = new programobjectmodel();
		programobjectmodel.username(driver).sendKeys("prakalyanj@gmail.com");
		programobjectmodel.password(driver).sendKeys("Prakal@027");
		programobjectmodel.signin(driver).click();
//		WebElement username = driver.findElement(By.name("fld-e"));
//		username.sendKeys("prakalyanj@gmail.com");
//		WebElement password = driver.findElement(By.name());
//		password.sendKeys("Prakal@027");
//		WebElement signinbutton = driver.findElement(By.xpath("/html/body/div[1]/div/section/main/div[2]/div/div/div[1]/div/div/div/div/div/form/div[3]/button"));
//		signinbutton.click();
	}
}
