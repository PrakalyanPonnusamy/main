package poi;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.print.attribute.standard.JobOriginatingUserName;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Datadrvn {
	// creating to lists in the main class to access in all methods if we need
	
	static List<String> usernamelist = new ArrayList<String>();
	static List<String> Passwordlist = new ArrayList<String>(); // have to define those woth the static, so that it can be called in the main funcction 
	
	
	// This is to get the data from the excel
	
	public void exceldata() throws IOException {
		// this is to get the file location, that is the excel sheet
		FileInputStream excel = new FileInputStream("C:\\Users\\praka\\eclipse-workspace\\JXLLib\\src\\Book1.xlsx");
		Workbook workbook = new XSSFWorkbook(excel); // to get the workbook from the excel
		Sheet sheet = workbook.getSheetAt(0); // To  get the sheet from the workbook
		Iterator<Row> rowiterator = sheet.iterator();  // Iterator initially used to get the rows, from the sheet. 
		while (rowiterator.hasNext()) {                 // hasnext() will be check and  executed until it has the next value for rows here
			Row rowvalue = rowiterator.next();          // Iteratring the Rows and storing it in the row value variable 
			Iterator<Cell> columniterator = rowvalue.iterator();    //Iterating the row value to get the cell
			int i=2;
	
			while (columniterator.hasNext()) {  //  hasnext() will be check and  executed until it has the next value for cells
				if(i%2==0)
				{
					usernamelist.add(columniterator.next().getStringCellValue()); // adding the value to the username list
				}else {
					Passwordlist.add(columniterator.next().getStringCellValue());} // adding the value to the password list
				i++;
			}
		}

	}
	
	
	//Normal webpagge
	
	public void webpage(String name, String pass) { // Passing the username and password
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://testphp.vulnweb.com/login.php");
		WebElement Uname = driver.findElement(By.name("uname"));
		Uname.sendKeys(name);
		WebElement Pass = driver.findElement(By.name("pass"));
		Pass.sendKeys(pass);
		WebElement Button = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/form/table/tbody/tr[3]/td/input"));
		Button.click();	
		driver.quit();
	}
	
	
	
	
	
	public void getdata() { // this is to iterate the values from the username and password list that we have 
		for (int i=0;i<usernamelist.size();i++)
		{
			webpage(usernamelist.get(i), Passwordlist.get(i)); // we passing the data's here 
		}
	}
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Datadrvn poi = new Datadrvn();
		poi.exceldata();
//		System.out.println(usernamelist);
//		System.out.println(Passwordlist);
		poi.getdata();
	}

}
