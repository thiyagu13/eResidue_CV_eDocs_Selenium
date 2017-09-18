package com.eResidue.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Utils {

	
	//Method of screenshot
	public static void getScreenShot(String file) throws IOException {
		try {

			File scrFile = ((TakesScreenshot) Constant.driver)
					.getScreenshotAs(OutputType.FILE);
			DateFormat dateFormat = new SimpleDateFormat("HH_mm_ssa yyyy-MM-dd");
			Calendar cal = Calendar.getInstance();
			FileUtils.copyFile(scrFile,
					new File(file + dateFormat.format(cal.getTime())));
		} catch (IOException ioe) {
			ioe.getStackTrace();
		}
	}

	
	  /*public static XSSFSheet getExcelSheet() throws IOException 
	  {
	  FileInputStream file = new FileInputStream(Constant.EXCEL_PATH);
	  @SuppressWarnings("resource")
	  XSSFWorkbook workbook = new XSSFWorkbook(file); 
	  XSSFSheet sheet = workbook.getSheetAt(1); 
	  return sheet; 
	  }*/
	
	  
	  //get xlsx sheet
	  public static XSSFWorkbook getExcelSheet() throws IOException 
	  {
	  FileInputStream file = new FileInputStream(Constant.EXCEL_PATH);
	  XSSFWorkbook workbook = new XSSFWorkbook(file); 
	  return workbook; 
	  }
	    
	  
	  // Write output and close workbook
	  public static void writeTooutputFile(Workbook workbook) throws IOException {
			try {
				FileOutputStream outFile = new FileOutputStream(new File("C:\\Users\\Easy solutions\\git\\eDocs\\eResidue_CV_eDocs_Automation\\eResidue_eDocs_TestCase_result.xlsx"));
				workbook.write(outFile);
				outFile.close();
			} catch (Exception e) {
				throw e;
			}
		}
	 

}
