package selenium1;

//import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/praka/Desktop/Sel%20Wp/selectable.html");
		
		// To know the length of the list in the web page, we have to include the li seperately, as the selenium will take the complete OL for execution
		List <WebElement> selectable = driver.findElements(By.xpath("//*[@id=\"selectable-list\"]/li"));
		int size = selectable.size();
		System.out.println(size);
		
		
		Actions action = new Actions(driver); // when we use actions we have to use build and perform 
		action.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build().perform();
		//action.keyDown(Keys.CONTROL) >>>> Keys down will press and hold the key (keys.Control) >>>> for clicking the control key and holding it 
		// click(selectable.get(0)) >>> this is used for selecting the items from the list element which we have given above 
		// Boild and perform is used when we use actions 
		
		//		action.clickAndHold(selectable.get(0));
		//		action.clickAndHold(selectable.get(1));
		//		action.clickAndHold(selectable.get(2)); // Here we have to enter everythin new
		//		action.build().perform();

	}

}
