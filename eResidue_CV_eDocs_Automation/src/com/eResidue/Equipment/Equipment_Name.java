package com.eResidue.Equipment;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.eResidue.Utils.Utils;

public class Equipment_Name {
	//public WebDriver driver = Constant.driver ; 
	final static String FILE_PATH = "C:\\Users\\Easy solutions\\git\\eDocs\\eResidue_CV_eDocs_Automation\\eResidue_eDocs_TestCase_result.xlsx";
	
	
	/*@Test(priority=1)
	public void getWebdriver() {
		//Utils.getWebDriverInstance();
		driver.get("https://www.google.co.in");
	    System.out.println("First Commmit Test");	
	  }
	*/
	
	@Test(priority=2)
	public void google() throws Exception {
		
		/*Thread.sleep(500);
		driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
		Utils.getScreenShot(Constant.SCREENSHOT_FOLDER + "\\Test1.PNG ");*/
		
		XSSFWorkbook workbook = Utils.getExcelSheet();
		XSSFSheet sheet = workbook.getSheetAt(1);
		 
		String Eq_name_valid = sheet.getRow(5).getCell(5).getStringCellValue();
		System.out.println(Eq_name_valid);
		
		Cell resultcell = sheet.getRow(5).getCell(7);
		resultcell.setCellValue(Eq_name_valid);
		
		Utils.writeTooutputFile(workbook); // write and close workbook
			
	  }
	
	
			
}

