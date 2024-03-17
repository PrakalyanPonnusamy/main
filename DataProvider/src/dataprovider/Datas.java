package dataprovider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Datas {
	String [][] credentials ={ // we are storing the user name and passsword in an array matrix
			{"test","test"},
			{"test1","test1"},
			{"test1","test"},
			{"test","test1"}
	};
	@DataProvider(name="dataprov") // Using dataprovider annotation to get the credentials from the array, and storing it with a name for further use and reference
	public String[][] dataproider() {
		return credentials;
	}
	@Test(dataProvider = "dataprov") //Using dataprovider with the name that is given above, like have wee have set priority and enabled, this willl get the values from the above one.
	public void name(String name, String pass)	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://testphp.vulnweb.com/login.php");
		WebElement Uname = driver.findElement(By.name("uname"));
		Uname.sendKeys(name);
		WebElement Pass = driver.findElement(By.name("pass"));
		Pass.sendKeys(pass);
		WebElement Button = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/form/table/tbody/tr[3]/td/input"));
		Button.click();	
		driver.quit();
	}

}
