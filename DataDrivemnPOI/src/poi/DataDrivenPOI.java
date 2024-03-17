package poi;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DataDrivenPOI {
	public void excel() throws IOException {
		FileInputStream exceldata = new FileInputStream("C:\\\\Users\\\\praka\\\\eclipse-workspace\\\\JXLLib\\\\src\\\\Book1.xlsx");
		Workbook workbook = new XSSFWorkbook(exceldata);
		Sheet sheet = workbook.getSheetAt(0);
		Iterator <Row> row = sheet.iterator();
		while(row.hasNext()) {
			Row rowiterator = row.next();
			Iterator<Cell> column = rowiterator.iterator();
			while (column.hasNext()) {
				Cell cellvalue = column.next();
				System.out.println(cellvalue);
			}
		}
		
	}
	public static void main(String[] args) throws IOException {
		DataDrivenPOI dd = new DataDrivenPOI();
		dd.excel();

	}

}
