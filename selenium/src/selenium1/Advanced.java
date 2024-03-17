package selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Advanced {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\praka\\\\eclipse-workspace\\\\selenium\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.bestbuy.com/?intl=nosplash");
		
		// Storing the old window
		
		String oldwindow = driver.getWindowHandle();  // copies the current window, for switching lately
		
		// opening a tab in the new window
		
		WebElement Yardbird = driver.findElement(By.linkText("Yardbird"));
		Yardbird.click();
		Set<String> handles = driver.getWindowHandles();  // this will help to move the control from the parent to the child window
		for (String string : handles) {                   // Using for loop we can make a loop of handles, from handles it will pick the child and store it in the String 
			driver.switchTo().window(string);			  // Here we are switching the window
		}
		WebElement productstab =  driver.findElement(By.id("products-menu-trigger"));
		productstab.click();
		Thread.sleep(2000);
		driver.close();
		
		// Switching to Old window
		
		driver.switchTo().window(oldwindow);
		
		// Opening the tabs to check how many tabs are there in the screen
		
		WebElement Tabs = driver.findElement(By.linkText("Yardbird"));
		Tabs.click();
		int Nooftabs = driver.getWindowHandles().size();
		System.out.println(Nooftabs);
		Thread.sleep(2000);
		
		// Closing all the tabs except the parent
		
		Set<String> gethandles = driver.getWindowHandles();
		for (String string2 : gethandles) {
			if(!string2.equals(oldwindow)){ // if not equal to the old window, the switch to that window then close that window
				driver.switchTo().window(string2);
				driver.close(); 	
				
				
			}
			
		}
		
		driver.quit();
		
	}

}
// for loop is used for iterating the tabs that are opened