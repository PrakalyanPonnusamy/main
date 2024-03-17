package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class login_for_pageonjectmodel2 {
	@Test
	public void webpage()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.bestbuy.com/identity/newAccount?token=tid%3A0e4d6985-db43-11ee-8196-0ab1451fca07");
		
//		WebElement account = driver.findElement(By.id("account-menu-account-button"));
//		account.click();
//		WebElement createaccount = driver.findElement(By.className("c-button c-button-outline c-button-sm create-account-btn"));
//		createaccount.click();
//		WebElement firstname = driver.findElement(By.id("firstName"));
//		firstname.sendKeys("jana");
//		WebElement last_name = driver.findElement(By.id("lastName"));
//		last_name.sendKeys("jana");
//		WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("prakalyanponnusamy@gmail.com");
//		WebElement Password = driver.findElement(By.id("fld-p1"));
//		Password.sendKeys("123456789");
//		WebElement Confirm = driver.findElement(By.id("reenterPassword"));
//		Confirm.sendKeys("123456789");
//		WebElement phone = driver.findElement(By.id("phone"));
//		phone.sendKeys("9842241585");
		
		
		//pageobjectmodel2 pageobjectmodel2 = new pageobjectmodel2();
		pageobjectmodel2.firstname(driver).sendKeys("Jana");
		pageobjectmodel2.lastnmae(driver).sendKeys("Jana");
		pageobjectmodel2.email(driver).sendKeys("Jana@gmail.com");
		pageobjectmodel2.passowrd(driver).sendKeys("Jana@027");
		pageobjectmodel2.confirm(driver).sendKeys("Jana@027");
		pageobjectmodel2.phone(driver).sendKeys("9597142541");
		
//		
		
	}
}
