package Pagefactory1_Using_FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class findby_pagefactory1 {
	
	@FindBy(name="fld-e")
	public static WebElement firstname;
	
	@FindBy(name="fld-p1")
	public static WebElement password;
	
	@FindBy(xpath="/html/body/div[1]/div/section/main/div[2]/div/div/div[1]/div/div/div/div/div/form/div[3]/button")
	public static WebElement click;
	
	
}
