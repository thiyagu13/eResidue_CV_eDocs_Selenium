package com.eResidue.Equipment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.eResidue.Utils.Constant;
public class Equipment_SF_Area {

	public WebDriver driver = Constant.driver;
		
	
	@Test(priority=3)
	public void sign() throws InterruptedException {
		Thread.sleep(500);
		
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("Test");
	  }
	
	@Test(priority=4)
	public void close() throws InterruptedException {
		Thread.sleep(500);
		driver.close();
	  }
	
	
	
}
