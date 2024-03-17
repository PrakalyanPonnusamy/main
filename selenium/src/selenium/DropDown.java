package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.phptravels.net/signup");
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"signup\"]/div/div/div/div[3]/div[1]/div/div/button/div"));
		
		//This is used to select the values
		
		Select select = new Select(dropdown);
		//select the values using Index
//		select.selectByIndex(2);
//		//Thread.sleep(3000); >> for reducing the execution time
//		//select the values using Value
//		select.selectByValue("cat");
		//Thread.sleep(3000);
		//select the values using visible text
		select.selectByValue("india");
		
		
		
//		// select the value using send keys
//		
//		dropdown.sendKeys("Rabbit");
//		
//		List<WebElement> listofoptions = select.getOptions();
//		int size = listofoptions.size();
//		System.out.println(size);
//		
//		// As multi selecting is not available in we page, 
//		
//		// First we have to find the element,then we have to use Select method to select the items 
//		// same as that of (//This is used to select the values)
//		//Select select = new Select(dropdown);
//		//select.selectByIndex(1);
//		//select.selectByIndex(2);
//		//select.selectByIndex(3); // have to enter the required stuff's index
		

	}

}
