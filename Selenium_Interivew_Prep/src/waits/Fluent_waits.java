package waits;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_waits {

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
//		WebElement Sign_in_btn = driver.findElement(By.id("signInSubmit"));
//		Sign_in_btn.click();
		
		Wait <WebDriver> wait = new FluentWait<WebDriver>(driver) // using the wait interface we are creating an object with fluentwait for driver 
				//<WebDriver> --> this is to avoid the type castings
				.withTimeout(Duration.ofSeconds(10)) // this helps in providing the time out 
				.pollingEvery(Duration.ofSeconds(3)) // this is for Polling, like this will give certain time and then it will check for the Webelement in DOM
				.ignoring(NoSuchElementException.class); // This will help to ignore the Nosuchelement at the time of polling and timeout
		WebElement profile =  wait.until(new Function<WebDriver, WebElement>() { // We are creating a function with wait.until for Webdriver and webelements
			public WebElement apply(WebDriver driver) {   // apply is a default method that used to find the webdriver driver and return what we need from the web driver, given below
				
				return driver.findElement(By.id("signInSubmit"));	
			}
		});
	profile.click();

	}

}
