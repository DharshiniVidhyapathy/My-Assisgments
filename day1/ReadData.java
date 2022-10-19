package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Set  the path
        XSSFWorkbook wbook=new XSSFWorkbook("Data/Testdata.xlsx");
        //Open the sheet
        XSSFSheet sheet=wbook.getSheetAt(0);//read the first sheet
        //Row count
        int rowCount = sheet.getLastRowNum(); //ctrl+2+l
        //column count
        short columnCount = sheet.getRow(0).getLastCellNum();  //ctrl+2+l
        
         System.out.println("Row Count"+rowCount);
         System.out.println("Column Count"+columnCount);
         
         //XSSFRow
         XSSFRow fstRow =sheet.getRow(2);
         XSSFCell companyName=fstRow.getCell(4);
         System.out.println(companyName.getStringCellValue());
         

	}

}
