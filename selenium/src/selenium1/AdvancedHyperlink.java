package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AdvancedHyperlink {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.bestbuy.com/?intl=nosplash");

		//Navigate and come Back to the original page
		WebElement ComeBack = driver.findElement(By.linkText("Deal of the Day"));
		ComeBack.click();
		driver.navigate().back();

		//Where this is going i.e, the link
		WebElement WhereAmIGoing = driver.findElement(By.linkText("Top Deals"));
		String Going = WhereAmIGoing.getAttribute("href");
		System.out.println("This page will go here >> >> >> "+Going);


		//Broken Link Checking

		WebElement Brokenlink = driver.findElement(By.linkText("Top Deals"));
		Brokenlink.click();

		String Title = driver.getTitle();
		if(Title.contains("404")) {
			System.out.println("The Link is Borken");
		}else {
			System.out.println("The Link is Not Broken");
		}

		driver.navigate().back();

		//Again Going to Deal of Day Page 

		WebElement DOTD = driver.findElement(By.linkText("Deal of the Day"));
		DOTD.click();
		driver.navigate().back();
		//Finding the Number of Links in the webpage

		List<WebElement> Links = driver.findElements(By.tagName("a"));
		int size = Links.size();
		System.out.println(size);


	}

}
