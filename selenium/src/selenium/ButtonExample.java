package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.bestbuy.com/site/misc/deal-of-the-day/pcmcat248000050016.c?id=pcmcat248000050016");
		
		
		// this i used for selecting  US from the bestbuy page
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")).click();
		
		
		WebElement atcbutton = driver.findElement(By.xpath("/html/body/main/div[1]/div[4]/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div[4]/div/div[2]/div[1]/div/div/div/div/div/button"));
		atcbutton.click();
		
		
		
		// This is to get the x and Y o+position fo the add to cart button
		WebElement position = driver.findElement(By.xpath("/html/body/main/div[1]/div[4]/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div/div/div/button"));
		Point xypoint = position.getLocation();
		int xvalue = xypoint.getX();
		int yvalue = xypoint.getY();
		System.out.println("x =" + xvalue + "y ="+yvalue);
		
		
		//Find the color
		
		WebElement color = driver.findElement(By.xpath("//*[@id=\"fulfillment-add-to-cart-30bfd8e9-aa50-429f-80cd-b006906d6d3c-6471975\"]/div/div/div/button"));
		String csscolor = color.getCssValue("background-color");
		System.out.println(csscolor);
		
		//Find the sixe of the button
		
		WebElement size =  driver.findElement(By.xpath("//*[@id=\"fulfillment-add-to-cart-20ef3c91-469e-4788-8c43-556ac7b43b0f-6514911\"]/div/div/div/button"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		System.out.println("H =" + height + "W =" +width);
		
	}

}
