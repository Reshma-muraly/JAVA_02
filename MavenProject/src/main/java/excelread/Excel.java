package excelread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	
	public  static String  getStringData( int a , int b) throws IOException
	{
		f= new FileInputStream("C:\\Users\\reshma.s02\\Downloads\\JAVA.xlsx");
				w= new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1"); //mention the Sheet name of that workbook.
		XSSFRow r= sh.getRow(a); //store a row value 'r' from the sheet1
		XSSFCell c= r.getCell(b); // store the row value to the  cell/column in c from the same sheet
		return c.getStringCellValue(); //gets the value from c and return it as String.
	}
	
		public static String getIntegerData(int a , int b) throws IOException
		{
			f= new FileInputStream("C:\\Users\\reshma.s02\\Downloads\\JAVA.xlsx");
			w= new XSSFWorkbook(f);
	sh=w.getSheet("Sheet1");
	XSSFRow r= sh.getRow(a);
	XSSFCell c= r.getCell(b);
	int x=(int ) c.getNumericCellValue(); //converting a string value to int called typecasting
	return String.valueOf(x);//gets value from x .
		}
}
