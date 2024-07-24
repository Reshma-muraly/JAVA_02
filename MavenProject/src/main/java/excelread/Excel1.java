package excelread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {

	static FileInputStream f;
	static XSSFWorkbook w;
	static  XSSFSheet s;
	
	public static <XSSFrow> String getStringData(int a , int b) throws FileNotFoundException
	{
		f= new FileInputStream("C:\\Users\\reshma.s02\\Downloads\\JAVA.xlsx");
		w= new XSSFWorkbook();
		s= w.getSheet("Sheet1");
		XSSFRow r= s.getRow(a);
		XSSFCell c= r.getCell(b);
		return c.getStringCellValue();
	}
	
	public static String  getFloatData (int a, int b) throws FileNotFoundException
	{
		f= new FileInputStream("C:\\Users\\reshma.s02\\Downloads\\JAVA.xlsx");
		w= new XSSFWorkbook();
		s= w.getSheet("Sheet1");
		XSSFRow r= s.getRow(a);
		XSSFCell c=r.getCell(b);
		float f= (float) c.getNumericCellValue();
		return String.valueOf(f);
		
	}
}
