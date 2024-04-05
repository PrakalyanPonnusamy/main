package Ways_to_press_enter;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Enter_Press {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		
		WebElement searchbox = driver.findElement(By.name("q"));
		//searchbox.sendKeys("jana"+Keys.ENTER);
		
//		searchbox.sendKeys("Coimbatore");
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
//		searchbox.sendKeys("erode");
//		searchbox.submit();
		
		searchbox.sendKeys("Avinshi \n");
		
		
		//These are the three 4 types to click enter key
		
	}

}
