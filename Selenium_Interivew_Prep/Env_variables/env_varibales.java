package Env_variables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class env_varibales {

	public static void main(String[] args) {
		
		// Set environment variables and do this 
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
	}

}
