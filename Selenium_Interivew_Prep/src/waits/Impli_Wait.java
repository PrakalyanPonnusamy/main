package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Impli_Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\praka\\\\eclipse-workspace\\\\selenium\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
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

	}

}
