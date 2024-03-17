package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		for (int i=0;i<10;i++) {
			driver.navigate().to("https://www.google.com/");
			driver.switchTo().newWindow(WindowType.WINDOW);
			
		}

	}

}
