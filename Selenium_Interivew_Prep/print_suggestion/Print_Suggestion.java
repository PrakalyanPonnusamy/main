package print_suggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Print_Suggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\praka\\\\eclipse-workspace\\\\selenium\\\\msedgedriver.exe");
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(options);
		driver.get("https://www.google.com");
		
		
		WebElement Searchbox = driver.findElement(By.name("q"));
		Searchbox.sendKeys("Game of thrones");
		Thread.sleep(1000);
		List<WebElement> lists = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//following::li"));
		for (WebElement webElement : lists) {
			System.out.println(webElement.getText());
}
		
		
	}
	

}
