package Get_VS_NavigateTo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Get_and_navigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.bestbuy.com/?intl=nosplash"); 
		// this will have the entire history of the driver like. back, forward, refresh etc...
		// This will load the browser very fast, and won't wait until the dom displays 
		driver.get("https://www.amazon.in/");  
		// it wont have any history
		// But it will wait until the DOM appears
		
	}

}
