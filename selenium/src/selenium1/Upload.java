package selenium1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Upload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/praka/Desktop/Sel%20Wp/Upload.html");
		
		WebElement Upload = driver.findElement(By.xpath("/html/body/div/input"));
		Thread.sleep(3000);
		Upload.sendKeys("C:\\Users\\praka\\Documents\\error.txt");


	}

}
