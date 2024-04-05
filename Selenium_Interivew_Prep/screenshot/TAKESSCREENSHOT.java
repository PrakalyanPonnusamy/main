package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class TAKESSCREENSHOT {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\praka\\\\eclipse-workspace\\\\selenium\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		
		TakesScreenshot screeshot = (TakesScreenshot) driver;  // We have to choose interface that is used to take the screen shot, and what is used to take the scrreen shot i.e driver
		File Source = screeshot.getScreenshotAs(OutputType.FILE); // which output type we are using, that we use it in Outputtype
		File destination = new File("D://jana.png");  //the destination that where we need to store the image
		FileHandler.copy(Source, destination);  // linking both sorce and destination
		
		

	}

}
