package dnd;

import java.io.File;
import java.io.FileInputStream;
import java.io.*;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Simulator {

	public static void main(String[] args) throws Exception {
		Workbook wb;
		WebDriver driver;
		Cell cell;
		Row row;
		int rowCount=0,colCount=0;
		Object[][] sheetData;
		
		//initialize driver
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//resources//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		
		//ExcelHandling
		String fileName="testData.xlsx";
		File f=new File(System.getProperty("user.dir")+"//resources//testData.xlsx");
		FileInputStream fi=new FileInputStream(f);
		if(fileName.contains(".xlsx")) {wb=new XSSFWorkbook(fi);}
		else {wb=new HSSFWorkbook(fi);}		
		Sheet sh=wb.getSheet("Testcases");
		
		rowCount=sh.getLastRowNum();
		colCount=4;
		sheetData=new Object[rowCount][colCount];
		for(int i=0;i<rowCount;i++) {
			row=sh.getRow(i+1);
			for(int j=0;j<colCount;j++) {
				cell=row.getCell(j+1);
				
/*				if(cell.getCellType()==CellType.STRING)sheetData[i][j]=cell.getStringCellValue();
				else if(cell.getCellType()==CellType.NUMERIC)sheetData[i][j]=cell.getNumericCellValue();
				else if(cell.getCellType()==CellType.BOOLEAN)sheetData[i][j]=cell.getBooleanCellValue();
  			
 */}
			
		}fi.close();
		wb.close();
		driver.close();

	}

}
