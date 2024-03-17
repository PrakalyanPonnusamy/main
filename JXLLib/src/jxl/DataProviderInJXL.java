package jxl;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import jxl.read.biff.BiffException;

public class DataProviderInJXL {
	String[][] data=null;

	@DataProvider(name="dataprovider")
	public String[][] dataprov() throws BiffException, IOException {
		data=getexceldata();
		return data;
	}
	public String[][] getexceldata() throws BiffException, IOException {
		FileInputStream excel = new FileInputStream("C:\\Users\\praka\\eclipse-workspace\\JXLLib\\src\\Book1.xls");
		Workbook workbook = Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet(0);
		int rowconunt = sheet.getRows();
		int columncount = sheet.getColumns();					//// this is the main execution part
		String testdata[][] = new String[rowconunt][columncount];
		for(int i=0;i<rowconunt;i++) {
			for (int j=0;j<columncount;j++) {
				testdata[i][j]=sheet.getCell(j, i).getContents();
			}
		}
		return testdata;

	}

	@Test(dataProvider = "dataprovider")
	public void webpage(String name, String pass){
		System.setProperty("webdriver.edge.driver", "C:\\Users\\praka\\eclipse-workspace\\selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://testphp.vulnweb.com/login.php");
		WebElement Uname = driver.findElement(By.name("uname"));
		Uname.sendKeys(name);
		WebElement Pass = driver.findElement(By.name("pass"));
		Pass.sendKeys(pass);
		WebElement Button = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/form/table/tbody/tr[3]/td/input"));
		Button.click();	

	}}