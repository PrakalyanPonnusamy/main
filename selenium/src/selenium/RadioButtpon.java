package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButtpon {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/praka/Desktop/dummy.html");

		// To check a Radio Button
		WebElement check = driver.findElement(By.xpath("//*[@id=\"option1\"]"));
		check.click();
		// To check weather the button is clicked or not 
		WebElement checked = driver.findElement(By.xpath("//*[@id=\"option1\"]"));
		Boolean status1 = checked.isSelected();
		System.out.println(status1);
		WebElement unchecked = driver.findElement(By.xpath("//*[@id=\"option3\"]"));
		Boolean status2 = unchecked.isSelected();
		System.out.println(status2);
		
		
	}

}
