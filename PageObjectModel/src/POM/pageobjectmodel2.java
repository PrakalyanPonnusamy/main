package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageobjectmodel2 {
	public static WebElement firstname(WebDriver driver) {
		return driver.findElement(By.id("firstName"));
	}
	public static WebElement lastnmae(WebDriver driver) {
		return driver.findElement(By.id("lastName"));
	}
	public static WebElement email(WebDriver driver) {
		return driver.findElement(By.id("email"));
	}
	public static WebElement passowrd(WebDriver driver) {
		return driver.findElement(By.id("fld-p1"));
	}
	public static WebElement confirm(WebDriver driver) {
		return driver.findElement(By.id("reenterPassword"));
	}
	public static WebElement phone(WebDriver driver) {
		return driver.findElement(By.id("phone"));
	}

}
