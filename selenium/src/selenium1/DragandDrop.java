package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/praka/Desktop/Sel%20Wp/dragdrop.html");
		
		WebElement From = driver.findElement(By.id("drag1"));
		WebElement To = driver.findElement(By.id("drag2"));
		WebElement frame = driver.findElement(By.id("drag-container"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(From, To).build().perform();  // to drag and drop the items in webpage ( Build and perform is used to built the steps and perform actions)
		//Tried redoing the same process, vise versha
		actions.clickAndHold(From).moveToElement(frame).release().build().perform(); //  this performs > click and hold > movetoelement > release > build > perform
	}

}
