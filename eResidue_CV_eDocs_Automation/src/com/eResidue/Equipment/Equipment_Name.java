package com.eResidue.Equipment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.eResidue.Utils.Constant;
import com.eResidue.Utils.Utils;

public class Equipment_Name {
	public WebDriver driver = Constant.driver ; 
	
	
	@Test(priority=1)
	public void getWebdriver() {
		//Utils.getWebDriverInstance();
		driver.get("https://www.google.co.in");
	    System.out.println("First Commmit Test");	
	  }
	
	@Test(priority=2)
	public void getWebdriver1() throws InterruptedException, IOException {
		
		Thread.sleep(500);
		driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
		Utils.getScreenShot(Constant.SCREENSHOT_FOLDER + "\\Test1.PNG ");
		
	  }
	
		
}

