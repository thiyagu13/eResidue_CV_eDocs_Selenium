package com.eResidue.Utils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Utils {

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

	/*
	 * public static XSSFSheet getExcelSheet() throws IOException {
	 * FileInputStream file = new FileInputStream(Constant.EXCEL_PATH);
	 * XSSFWorkbook workbook = new XSSFWorkbook(file); XSSFSheet sheet =
	 * workbook.getSheetAt(0); return sheet; }
	 */

}
