package Pagefactory1_Using_FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Bestbuy_Login_Page_PageFactory1 {
	@Test
	public void login() {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.bestbuy.com/identity/signin?token=tid%3A0cc0ca9c-db4d-11ee-8bc6-0637a1a849d7");
	PageFactory.initElements(driver, findby_pagefactory1.class);
	findby_pagefactory1.firstname.sendKeys("prakalyanj@gmail.com");
	findby_pagefactory1.password.sendKeys("Prakal@027");
	findby_pagefactory1.click.click();	
}}
