package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("C:/Users/praka/Desktop/Sel%20Wp/tooltip.html");
		
		WebElement tooltip = driver.findElement(By.xpath("/html/body/div"));
		String tt = tooltip.getText(); // Printing the text with the help of get text, and also we can use title to get the text
		System.out.println(tt);
		//span
	}

}
