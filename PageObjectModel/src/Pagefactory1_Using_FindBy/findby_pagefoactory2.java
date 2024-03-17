package Pagefactory1_Using_FindBy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class findby_pagefoactory2 {

	@FindBy(id="firstName")
	public static WebElement firstname;
	@FindBy(id="lastName")
	public static WebElement lastname;
	@FindBy(id="email")
	public static WebElement email;
	@FindBy(id="fld-p1")
	public static WebElement password;
	@FindBy(id="reenterPassword")
	public static WebElement confirm;
	@FindBy(id="phone")
	public static WebElement phone;

}
