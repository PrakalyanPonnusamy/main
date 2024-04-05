package types_of_refresh;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.bouncycastle.crypto.KeyEncapsulation;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Refresh_types {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\praka\\\\eclipse-workspace\\\\selenium\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("amazon.com");
		
		
		//First method to refresh, by using the navigate to function 
		
		
//		driver.navigate().to("https://www.google.com/");
//		WebElement search = driver.findElement(By.name("q"));
//		search.sendKeys("amazon.com");
//		driver.navigate().refresh();
		
		
		//By using the getcurrenturl, this will get the current url and pass to driver, it is like a re execution
		
		
		driver.get(driver.getCurrentUrl());
		
		// Javscript executer
		
		JavascriptExecutor executer = (JavascriptExecutor) driver;
	     executer.executeScript("location.reload()");
	     
	     
	     
	     //Robot pressing and releasing the f5 key
	     
	     Robot robot = new Robot();
	     robot.keyPress(KeyEvent.VK_F5);
	     robot.keyRelease(KeyEvent.VK_F5);
	     WebElement search11 = driver.findElement(By.name("q"));
		search11.sendKeys("bestbuy.com");
	     
	}

}
