package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithSortables {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("file:///C:/Users/praka/Desktop/Sel%20Wp/ListItems.html");
		
		List<WebElement> Drag = driver.findElements(By.xpath("//*[@id=\"sortable\"]/li")); // Here we have to use li in the xpath to get the list inside the ordered  list
		int size = Drag.size();			// Finding the size
		System.out.println(size);
		WebElement from = Drag.get(4);  // Storing from in a WebElement variable 
		WebElement to = Drag.get(0);	// Storing to in a WebElement variable
		Actions action = new Actions(driver); 	//Actions is to perform some actions
		
		//action.clickAndHold(from);
//		action.dragAndDrop(from, to);   // i just simply used drag and drop feature to draga nd drop the contents on the webpage
//		action.release(to);				// Relaesing it in the position that we need
//		action.build().perform();  		// as usual we are using builld and perform
		
		action.clickAndHold(from);  // Click and hold feature to cclick and hold an element
		action.moveToElement(to);	// Move the element for moving the elements
		action.release(to); 		// rELEASING IT WHERE WE NEED
		action.build().perform();	// Normal build and perform to do some actions
		
		

	}

}
