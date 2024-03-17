package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Openchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		// to access the web browser
		WebDriver driver = new EdgeDriver();
		// to access the certain URL
		driver.get("http://google.com");
		//to Quit the entire browser
		driver.quit();
	}

}
