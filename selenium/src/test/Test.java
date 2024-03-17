package test;

import java.io.FileInputStream;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Test {

	public static void main(String[] args) throws InterruptedException, BiffException, IOException {
			FileInputStream excel = new FileInputStream("C:\\Users\\praka\\eclipse-workspace\\JXLLib\\src\\Book1.xls");
			Workbook workbook = Workbook.getWorkbook(excel);
			Sheet sheet = workbook.getSheet(0);
			int rowconunt = sheet.getRows();
			System.out.println(rowconunt);
			
			int columncount = sheet.getColumns();
			System.out.println(columncount);
			//System.out.println(testdata);
			for(int i=0;i<rowconunt;i++) {
				for (int j=0;j<columncount;j++) {
					System.out.println("I " +i);
					System.out.println("J " +j);
					//testdata[i][j] = sheet.getCell(j,i).getContents();
					//System.out.println(testdata[i][j]);
				}
			}
			
		}}