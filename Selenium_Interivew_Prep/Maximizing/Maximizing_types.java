package Maximizing;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Maximizing_types {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\praka\\\\eclipse-workspace\\\\selenium\\\\msedgedriver.exe");
		
		
		EdgeOptions edgeOptions = new EdgeOptions();	// This is an another menthod that is used to maximize at tha start of the browser
		edgeOptions.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(edgeOptions); 
		
		
		driver.get("https://www.google.com/");
		
		//driver.manage().window().maximize();  //Type 1 to do a normal maximize
		
//		Dimension dimension = new Dimension(1920, 1200);    // This is type 2, here we have to create an onject for dimension to give the H and W then using the set size we are executing that.
//		driver.manage().window().setSize(dimension);
		
		
		
	}

}
