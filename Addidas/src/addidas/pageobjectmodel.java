package addidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class pageobjectmodel {

	@FindBy(xpath = "//*[@id=\"gl-modal__main-content-\"]/div/div[1]/div[1]/div/button/span")
	public static WebElement RejectAll_Button;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[8]/span/section/div[2]/div/div[2]/div[1]/div/a")
	public static WebElement Shop_men;
	
	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div[3]/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div/div[1]/a[1]/img")
	public static WebElement Indoor_cycling_shoe;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div[3]/div/div[5]/div/div/button/span[2]")
	public static WebElement closing_X;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[2]/div/header/div[2]/div/div[2]/div/input")
	public static WebElement search;
	
	@FindBy(linkText = "/html/body/div[2]/div/div[1]/div[1]/div/div/div[4]/div/div[2]/div/div/div/div/div/div[1]" )
	public static WebElement yellow_tshirt;
	
	
	
}
