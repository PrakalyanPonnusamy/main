package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Openwiki {

	public static void main(String[] args) {
		//Basic Stuffs ref. @Openchrome
		System.setProperty("webdriver.edge.driver","C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("http://Google.com");
		
		// Find an element from the web browser with the help of name, and then enter values using send keys and hit ENTER
		driver.findElement(By.name("q")).sendKeys("jana"+Keys.ENTER);
		
		

	}

}
