package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",  "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/praka/Desktop/Sel%20Wp/alert.html");

		// Find the Element and Click, And a Pop up will be displayed , we have to hit OK on that
		//WebElement Example alert = driver.findElement(By.xpath("/html/body/div/div[1]/div/main/div/p[2]/a"));
		//Examplealert.click();
		//Alert alert = driver.switchTo().alert(); // this is to switch the control from the main webpage to the alert popup
		//Thread.sleep(1000);
		//alert.accept();		


		// Alert With click OK button
		WebElement Ok = driver.findElement(By.xpath("/html/body/button[1]"));
		Ok.click();
		Alert alert =  driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		
		//Alert with click OK or cancel Button
		WebElement Ok_Cancel = driver.findElement(By.xpath("/html/body/button[2]"));
		Ok_Cancel.click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(1000);
		alert2.accept();
		
		
		// Entering a text to the Box
		WebElement entertext = driver.findElement(By.xpath("/html/body/button[3]"));
		entertext.click();
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(1000);
		alert3.sendKeys("This is jana");
		Thread.sleep(1000);
		alert3.accept();
		
	}
}
