package Pagefactory1_Using_FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Signuppage_pagefactory2 {
	@Test
	public void signup() {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.bestbuy.com/identity/newAccount?token=tid%3A27a3804a-db4f-11ee-8196-0ab1451fca07");
	PageFactory.initElements(driver, findby_pagefoactory2.class);
	findby_pagefoactory2.firstname.sendKeys("Prakalyan");
	findby_pagefoactory2.lastname.sendKeys("Jana");
	findby_pagefoactory2.email.sendKeys("prakalyanj@gmail.com");
	findby_pagefoactory2.password.sendKeys("Prakal@027");
	findby_pagefoactory2.confirm.sendKeys("Prakal@027");
	findby_pagefoactory2.phone.sendKeys("9597142541");
	
	
}}
