package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class programobjectmodel {

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("fld-e"));
	}
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.name("fld-p1"));
	}
	public static WebElement signin(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[1]/div/section/main/div[2]/div/div/div[1]/div/div/div/div/div/form/div[3]/button"));
	}
}
