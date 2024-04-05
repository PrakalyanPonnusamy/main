package Close_VS_Quit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Close_Quit {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.bestbuy.com/?intl=nosplash");
		
		
		WebElement Yardbird = driver.findElement(By.linkText("Yardbird"));
		Yardbird.click();
		
		driver.close();   // this will close the primary focused window, for the driver (i.e, bestbuy.com)
		
		driver.quit();    // this will close the entire browser (both best buy and yardbird)

	}

}
