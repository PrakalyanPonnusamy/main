package Selecting_search_suggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class using_txt {

	public static void main(String[] args) throws InterruptedException {
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://www.google.com");


		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("game of thrones");
		Thread.sleep(1000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//following::li"));  // Nomal finding of the webelemt by using manual path
		for (WebElement webElement : suggestion) { // 
			String text = webElement.getText(); // Getting the text and storing it in the string type
			//System.out.println(text);
			
			if(text.contains("cast")){   // if the above string contains "case" making the system to click that
				webElement.click();
				break; // To stop the browser here
			}
		}

	}
}