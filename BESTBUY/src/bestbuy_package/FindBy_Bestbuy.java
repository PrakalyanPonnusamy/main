package bestbuy_package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindBy_Bestbuy {
	@FindBy(name = "st")
	public static WebElement searchbox;
	
	@FindBy(xpath = "/html/body/div[5]/main/div[4]/div/div/div/div/div/div/div[2]/div[2]/div[5]/div/div[4]/ol/li[2]/div/div/div/div/div/div[3]/div[3]/div/div/div/div/div/div[1]/button")
	public static WebElement addtocart;
	
	@FindBy(xpath = "/html/body/div[9]/div/div/div[3]/div/div[1]/a")
	public static WebElement gotocart;
	
	@FindBy(xpath = "/html/body/div[1]/main/div/div[2]/div/div[1]/div/div[1]/div[1]/section[2]/div/div/div[4]/div/div[1]/button")
	public static WebElement checkout;
	
	@FindBy(xpath = "/html/body/div[1]/div/section/main/div[2]/div/div/div[4]/div/div[2]/button")
	public static WebElement guesty_login;
	
	
}
