package test;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Dataprov {
	String[][] data=null;
	@DataProvider(name="Datas")
	public String[][] dataprov() throws BiffException, IOException {
		data = exceldata();
		return data;
	}
	public String[][] exceldata() throws BiffException, IOException{
		// this is used to get the excel sheet location in our system
		FileInputStream excel = new FileInputStream("C:\\Users\\praka\\eclipse-workspace\\JXLLib\\src\\Book1.xls");
		// we have stored the file location in a variable, using that to get the work book
		Workbook workbook = Workbook.getWorkbook(excel);
		// from that workbook we are accessing a sheet
		Sheet sheet = workbook.getSheet(0);
		// to count the rows and columns
		int row = sheet.getRows();
		int colums = sheet.getColumns();
		// we have created a testdata array variable and storing data on to that.
		String testdata[][] = new String [row][colums];
		return testdata;
		
		}
	
	@Test(dataProvider = "Datas")
	public void webpage(String name, String pass) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://testphp.vulnweb.com/login.php");
		WebElement Uname = driver.findElement(By.name("uname"));
		Uname.sendKeys(name);
		WebElement Pass = driver.findElement(By.name("pass"));
		Pass.sendKeys(pass);
		WebElement Button = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/form/table/tbody/tr[3]/td/input"));
		Button.click();	
	}
}