package waits;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class expli_waits {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\praka\\\\eclipse-workspace\\\\selenium\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.amazon.in/");
		WebElement sign_in = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		sign_in.click();
		WebElement Username = driver.findElement(By.id("ap_email"));
		//driver.switchTo().frame(Username);
		Username.sendKeys("Prakalyanj@gmail.com");
		WebElement Continue_button = driver.findElement(By.id("continue"));
		Continue_button.click();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("9842241585");
		WebElement Sign_in_btn = driver.findElement(By.id("signInSubmit"));
		Sign_in_btn.click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 10); 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	// this line should be used like the above one but It is in deprecated so we are ising Duration.ofSeconds(10) ref :https://stackoverflow.com/questions/71761074/the-constructor-webdriverwaitchromedriver-int-is-undefined
		wait.until(ExpectedConditions.elementToBeClickable(By.id("signInSubmit")));

	}

}
