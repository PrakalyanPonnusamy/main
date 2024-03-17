package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\praka\\\\eclipse-workspace\\\\selenium\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/praka/Desktop/Sel%20Wp/Checkbox.html");
		
		// To select  a check-box
		WebElement Checkbox1=driver.findElement(By.xpath("//*[@id=\"checkbox1\"]"));
		Checkbox1.click();
		WebElement Checkbox5=driver.findElement(By.xpath("//*[@id=\"checkbox2\"]"));
		Checkbox5.click();
		
		//To check whether a check box is selected or not
		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"checkbox7\"]"));
		Boolean cb2 = checkbox2.isSelected();
		System.out.println(cb2);
		
		//To check and un-check the selected one
		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"checkbox1\"]"));
		
		if(checkbox3.isSelected())
		{
			checkbox3.click();
		}
		
		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id=\"checkbox2\"]"));
		if(checkbox4.isSelected())
		{
			checkbox4.click();
		}
		
		

	}

}
