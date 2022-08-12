package comcast.vtiger.generalutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	
	public String getDataFromExcel(String sheetName,int RowNum,int cellNum) throws Throwable
	{
FileInputStream fis=new FileInputStream("./org.xlsx");
Workbook book=WorkbookFactory.create(fis);
DataFormatter format=new DataFormatter();
return format.formatCellValue(book.getSheet(sheetName).getRow(RowNum).getCell(cellNum));
		
	}
	}

