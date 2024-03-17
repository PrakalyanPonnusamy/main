package selenium1;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0); // As it wasinside frame i have used thisn line
		WebElement calender = driver.findElement(By.id("datepicker")); 
		//calender.sendKeys("02/18/2024"+Keys.ENTER); // find the element and used send keys to enter the value to the text box
		
		calender.click();
		
		WebElement CalenderPage = driver.findElement(By.xpath("//a[@title=\"Next\"]")); //Manual Xpath creation, 
		//we have added the <a> tag followinf that title and what is the title, we can also use the normal xpath as well
		CalenderPage.click();
		driver.findElement(By.xpath("//a[contains(text(),'10')]")).click(); // This is manual xpath cration for Getting a text
		
		

	}

}
