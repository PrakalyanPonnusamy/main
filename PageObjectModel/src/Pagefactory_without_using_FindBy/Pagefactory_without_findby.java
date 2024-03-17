package Pagefactory_without_using_FindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Pagefactory_without_findby {
	public static WebElement username;
	public static WebElement password;
	

	@Test
	public void login() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		PageFactory.initElements(driver, Pagefactory_without_findby.class);
		username.sendKeys("prakalyan_ponnnusamy");
		password.sendKeys("Prakal@027");
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
		
		
		
		
	}
}
