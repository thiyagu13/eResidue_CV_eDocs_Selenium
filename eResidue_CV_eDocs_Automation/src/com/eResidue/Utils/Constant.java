package com.eResidue.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Constant {
	// call getcko driver (For latest fire fox version)
	public static String GECKO_DRIVER = "webdriver.gecko.driver";

	// Selenium getcko driver .exe path
	public static String GECKO_DRIVER_PATH = "C:\\Users\\Easy solutions\\git\\eDocs\\eResidue_CV_eDocs_Automation\\geckodriver.exe";

	// Site URL
	public static String URL = "https://www.google.co.in";

	// Screenshot folder - Contains screenshot of testcases
	public static final String SCREENSHOT_FOLDER = ".\\Screenshot\\";

	// Excel path - get input data from excel sheet
	public static String EXCEL_PATH = ".\\Testcase.xlsx";

	// Call web driver
	public static WebDriver driver = new FirefoxDriver();

}
