package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./Book1.xlsx");
		//open the read book in read mode
		Workbook wb= WorkbookFactory.create(fis);
		//get the control of sheet1
	Sheet sh = wb.getSheet("sheet1");
	int lastrownumber = sh.getLastRowNum();
	//for(int i=0;i<lastrownumber;i++)
	//{
		//System.out.println(lastrownumber);
	//}
	Row r = sh.getRow(1);
	//get the control of the cell
	Cell cell = r.getCell(0);
	String cellvalue = cell.getStringCellValue();
	System.out.println(cellvalue);
	
	
		
		

	}

}
