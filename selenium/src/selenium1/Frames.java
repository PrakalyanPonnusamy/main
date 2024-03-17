package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("file:///C:/Users/praka/Desktop/Sel%20Wp/frames.html");
		
		driver.switchTo().frame(0);  // This is to switch the Driver from the base window to the frame window, as the frames are refereed for other webpage
		WebElement firstframe = driver.findElement(By.xpath("/html/body/div/p[2]/a"));
		firstframe.click();
		
		driver.switchTo().defaultContent(); // this is used to switch the driver to the old old default page
		
		WebElement button1 = driver.findElement(By.xpath("/html/body/div/button[1]")); // to switch to the default inside the frame
		button1.click();
		
		driver.switchTo().frame(1); // if there is nested frame i.e, frame inside frame  we have to first switch to base frame then to the nested one
		//Example :
		// driver.switchTo().frame(1);
		// driver.switchTo().frame(0); this is the nested frame 
		
		WebElement secondframe = driver.findElement(By.xpath("/html/body/div/p[2]/a"));
		secondframe.click();
		
		driver.switchTo().defaultContent(); // this is used to switch the driver to the old old default page
		
		WebElement button2 = driver.findElement(By.xpath("/html/body/div/button[2]")); // to switch to the default inside the frame
		button2.click();
		
		
		// To display how many iframe tags are in our webpage
		List<WebElement> totalframes = driver.findElements(By.tagName("iframe")); // using the tagname we can find that
		int size = totalframes.size();
		System.out.println(size); 
		
		

	}

}
