package Get_Links;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Get_Links {

	public static void main(String[] args) throws InterruptedException {
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Game of thrones \n");
		
		Thread.sleep(5000);
		List<WebElement> links_list =  driver.findElements(By.xpath("//a")); // All the links are inside the a tag
				for (WebElement webElement : links_list) { // for each loop to iterate the values
					String elements = webElement.getAttribute("href"); //  inside the a tag href will be there we have to get th elinks fomr that tab, oru tag kulla irruka items yeadukanum na get attribute athae oru text yeadukanum na gettext
					
					if(elements==null) {
						//System.out.println("");
					}
					else {
						System.out.println(elements);
					}
				}
		
	}

}
