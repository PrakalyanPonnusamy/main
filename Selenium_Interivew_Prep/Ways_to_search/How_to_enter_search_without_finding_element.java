package Ways_to_search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

public class How_to_enter_search_without_finding_element {
static WebElement q;
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		
		//driver.switchTo().activeElement().sendKeys("Coimb \n");
		PageFactory.initElements(driver, How_to_enter_search_without_finding_element.class);
		q.sendKeys("tirppur \n");
		
	}

}
