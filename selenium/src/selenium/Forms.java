package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;

public class Forms {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//EdgeOptions EdgeOptions = new EdgeOptions(); // creating an object for options
		//EdgeOptions.addArguments("--start-maximized"); // adding an argument to get the page to be maximized
		//WebDriver driver = new EdgeDriver(EdgeOptions); // creating an object for driver
		
		//BESTBUY FORM
		driver.get("https://www.bestbuy.com/identity/newAccount?token=tid%3A564deb9e-c3b8-11ee-83eb-02684064dadf");
		
		
		// Using web element to store the values for easy understanding later
		WebElement Firstname = driver.findElement(By.id("firstName"));
		Firstname.sendKeys("Prakalyan");
		WebElement Lastname = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		Lastname.sendKeys("Ponnusamy");
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("prakalyanj@gmail.com");
		
		
		// Append the text with the first name  
		Firstname.sendKeys(" Jana");
		
		//Get the  value of the text box and display that in output
		WebElement phonenumber = driver.findElement(By.id("phone"));
		phonenumber.sendKeys("9842295971");
		String value = phonenumber.getAttribute("value");
		System.out.println(value);
		
		
		// to check a box is disabled or not 
		WebElement password = driver.findElement(By.id("fld-p1"));
		password.sendKeys("9842241585");
		// password.clear(); this is used to clear something that is already available
		Boolean Enabled = password.isEnabled();
		System.out.println(Enabled);
		
		
		
		
	}

}
