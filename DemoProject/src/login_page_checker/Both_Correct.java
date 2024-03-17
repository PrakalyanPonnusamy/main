package login_page_checker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Both_Correct {
	@Test
	@Parameters({"username","password"}) // Using at parameter to get username and password
	public void BothCorrect(String name, String pass) { // here we are passing the paramenters inside the method for the execution
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://testphp.vulnweb.com/login.php");
		WebElement Uname = driver.findElement(By.name("uname"));
		Uname.sendKeys(name);;
		WebElement Pass = driver.findElement(By.name("pass"));
		Pass.sendKeys(pass);
		WebElement Button = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/form/table/tbody/tr[3]/td/input"));
		Button.click();	
		driver.quit();
		
	}
}
