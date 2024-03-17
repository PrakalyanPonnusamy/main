package jxl;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class DataProviders {
	WebDriver driver;
	String [][] data = null;
	
	@DataProvider(name="dataprovs")
	public String[][] dataprov() throws BiffException, IOException {
		data = exceldata();
		return data;
	}
	
	public String[][] exceldata() throws BiffException, IOException {
		FileInputStream excel = new FileInputStream("C:\\Users\\praka\\eclipse-workspace\\JXLLib\\src\\Book1.xls");
		Workbook workbook = Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet(0);
		int rowcount = sheet.getRows();
		int columcount = sheet.getColumns();
		String testdata[][] = new String[rowcount][columcount]; 
		for (int i=0;i<rowcount;i++) {
			for (int j=0;j<columcount;j++) {
				testdata[i][j]=sheet.getCell(j, i).getContents();
			}
		}
		return testdata;
	}
	@BeforeSuite
	public void before() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://testphp.vulnweb.com/login.php");
	}
	@Test (dataProvider = "dataprovs")
	public void webpage(String name, String pass) {
		WebElement Uname = driver.findElement(By.name("uname"));
		Uname.sendKeys(name);
		WebElement Pass = driver.findElement(By.name("pass"));
		Pass.sendKeys(pass);
		WebElement Button = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/form/table/tbody/tr[3]/td/input"));
		Button.click();	
	}

}
