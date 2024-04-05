package Get_Links;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Green_colored_links_cite {

	public static void main(String[] args) throws InterruptedException {
		EdgeOptions edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.get("https://www.google.com");
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("game of thrones \n");
		Thread.sleep(3000);
		List<WebElement> all_links = driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div/cite")); // xpath creation to get the text from the webpage
		for (WebElement webElement : all_links) {
			System.out.println(webElement.getText());
		}
		
	}

}
