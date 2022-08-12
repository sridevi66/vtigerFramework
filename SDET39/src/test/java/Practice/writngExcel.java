package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writngExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         FileInputStream fis=new FileInputStream("./Book1.xlsx");
         Workbook wb= WorkbookFactory.create(fis);
         Sheet sh=wb.getSheet("Sheet1");
         Row r=sh.createRow(1);
         Cell cel=r.createCell(5);
         cel.setCellValue("TestYantra");
         //writing into the file
         FileOutputStream fos=new FileOutputStream("./Book1.xlsx");
         wb.write(fos);
         wb.close();
      
         
         
        		 
        		 
        		 
        		 
        		 
        		 
        		 
        		 
	}

	private static Sheet getSheet(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
