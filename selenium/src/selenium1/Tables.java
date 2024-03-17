package selenium1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tables {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("file:///C:/Users/praka/Desktop/Sel%20Wp/table.html");
		
		// To check Number of cloumns
		List<WebElement> Columns = driver.findElements(By.tagName("th"));
		int size = Columns.size();
		System.out.println(size);

		//To check number of rows
		List<WebElement> Rows = driver.findElements(By.tagName("tr"));
		int R_size = Rows.size();
		System.out.println(R_size);
		
		//Check and Print the First row value
		WebElement getprice = driver.findElement(By.xpath("//td[normalize-space()='Row 1, Col 1']//following::td[1]"));
		String price = getprice.getText();
		System.out.println(price);
		
		// Check which is small number and print that
		
		List<WebElement> Allvalues =  driver.findElements(By.xpath("//td[2]"));
		List<Integer> Numberlist = new ArrayList<Integer>(); // we have created a List to store the Number List
		for (WebElement webElement : Allvalues) {
			String text = webElement.getText(); // to get the text value we can also use .replace("%","") for replacing the percentage symbol with a blank
			Numberlist.add(Integer.parseInt(text));} // This will help to convert the String to Iinteger
		System.out.println(Numberlist);
		
		int Min_Number = Collections.min(Numberlist);
		System.out.println(Min_Number);
		String StringValue = Integer.toString(Min_Number);
		System.out.println(StringValue);
		String Finalxpath = "//td[normalize-space()= "+'\''+StringValue+'\''+"]//following::td[1]";
		System.out.println(Finalxpath);
		WebElement checkbox =  driver.findElement(By.xpath(Finalxpath));
		checkbox.click();
		
	}

}
