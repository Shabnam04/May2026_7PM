package learnJava;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class FileHandling_Excel
{

	public static void read_excel_data() throws Exception
	{
		
		FileInputStream fis = new FileInputStream("./testdata/exceldata.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("data");
		/*
		//example for loop 1-10
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		*/
		
		int nr = sh1.getPhysicalNumberOfRows();  //nr=3
		
		for(int i=0; i<nr; i++)  //0<3
		{
			XSSFRow row = sh1.getRow(i);  //i=0, i=1, i=2
			
			int nc = row.getPhysicalNumberOfCells();  //i=0,nc=2; i=1, nc=3, i=2, nc=3
			
			for(int j=0;j<nc; j++)
			{
				XSSFCell col = row.getCell(j);  //j=0, j=1, j=2
				
				if(col.getCellType() == CellType.STRING)
				{
					System.out.print(col.getStringCellValue() + "     ");
				}
				
				else if(col.getCellType() == CellType.BOOLEAN)
				{
					System.out.print(col.getBooleanCellValue() + "     ");
				}
				
				else if(col.getCellType() == CellType.NUMERIC)
				{
					
					if(DateUtil.isCellDateFormatted(col))
					{
						SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
						System.out.print(sdf.format(col.getDateCellValue()) + "      ");
					}
					
					else
					{
						System.out.print(col.getNumericCellValue() + "     ");
					}
					
				}
				
				
			}
			
			System.out.println();  //next line
		}
		
		/*
		//first row
		XSSFRow row1 = sh1.getRow(0);  
		
		XSSFCell col1 = row1.getCell(0);  //first column
		System.out.print(col1.getStringCellValue() + "     ");
		
		XSSFCell col2 = row1.getCell(1);  //second column
		System.out.print(col2.getStringCellValue() + "     ");
		
		System.out.println();  //next line
		
		//second row
		
		XSSFRow row2 = sh1.getRow(1);  
		
		XSSFCell col21 = row2.getCell(0);  //first column
		System.out.print(col21.getStringCellValue() + "     ");
		
		XSSFCell col22 = row2.getCell(1);  //second column
		System.out.print(col22.getStringCellValue() + "     ");
		
		XSSFCell col23 = row2.getCell(2);  //third column
		System.out.print(col23.getNumericCellValue() + "     ");
		
		*/
		
	}
	
	public static void main(String[] args) throws Exception
	{
	
		read_excel_data();
		
	}
	
}
