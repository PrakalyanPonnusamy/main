package Selecting_search_suggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selecting_suggestions_using_position {

	public static void main(String[] args) throws InterruptedException {
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://www.google.com");
		
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("game of thrones");
		Thread.sleep(1000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//following::li"));
		int position = 0;	//initilizing the position
		for (WebElement webElement : suggestion) { 
			System.out.println(webElement.getText());  //  To get the text
			
			position++;  //increamenting the postion to get which we need
			
			if (position==3) {
				webElement.click();
				break;    // click on the 3rd position and break the process
			}
			
			
		}
		
		
	}

}
