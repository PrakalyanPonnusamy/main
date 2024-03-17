package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Image {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/praka/Desktop/Sel%20Wp/Image.html");

		
		WebElement Image = driver.findElement(By.xpath("/html/body/img"));
		if(Image.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("Broken Image");
		}else {
			System.out.println("Not Broken");
		}
		}}