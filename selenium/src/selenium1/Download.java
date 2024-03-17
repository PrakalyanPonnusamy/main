package selenium1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Download {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/praka/Desktop/Sel%20Wp/Download.html");

		
		WebElement Download = driver.findElement(By.linkText("Download Excel Sheet"));
		Download.click();
		Thread.sleep(3000);
		
		
		File FileLocation = new File("C:\\Users\\praka\\Downloads");
		File[] AllFiles =  FileLocation.listFiles();  // this is type that is available in Java that helps to find the files in Windows, and to list them 
		
		for (File file : AllFiles) {
			if(file.getName().equals("example.xlsx")) { //  first we have to get the name of the file then we have to check if that is equals to the value that we are entering
				System.out.println("File is Found in Downloads");
				break;
			}
		}
	}
}
