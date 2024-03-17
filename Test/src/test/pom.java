package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pom {
public static WebElement username(WebDriver driver) {
	return driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
}
public static WebElement password(WebDriver driver) {
	return driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
}
public static WebElement click(WebDriver driver) {
	return driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]"));
}
}
