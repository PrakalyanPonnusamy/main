package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Linkexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.bestbuy.com/?intl=nosplash");
		
		driver.findElement
		(By.xpath("/html/body/main/div[2]/div[4]/div/div[1]/div[2]/div/div/div/div/div/div/div[1]/div/div/div/div/div/div/ul/li[1]/a/div[2]")).click();
		
	}

}
