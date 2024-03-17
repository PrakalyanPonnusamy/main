package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Suggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("file:///C:/Users/praka/Desktop/Sel%20Wp/Autofill.html");
		
		WebElement sendkey = driver.findElement(By.id("autocomplete-input"));
		sendkey.sendKeys("s");
		Thread.sleep(1000);
		List<WebElement> List = driver.findElements(By.xpath("//*[@id=\"suggestions\"]/li")); // this is to find how many items 
		//match with the sendkeys we have given above
		int size = List.size();
		System.out.println(size);
		// This part of program will do a loop and check weather the text is equal to what we have
		//entered if it is equal it wwill proceed with next steps
		
		for (WebElement webElement : List) {
			if(webElement.getText().equals("Sam")) {
				webElement.click();
				break;
			}
		}
		

	}

}
