package com.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunctions extends StaticVariables{
		
	/*****Chrome Browser Launch****/
	public void lauchChromeBrowser() {
		 WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();	
		  driver.manage().window().maximize();	
	}
	public void lauchEdgeBrowser() {
		 WebDriverManager.edgedriver().setup();
		  driver = new EdgeDriver();		
	}
	/**Take Screenshot
	 * @throws IOException **/
	public void takescreenshot(String name) throws IOException {
	Date d = new Date();
	DateFormat df = new SimpleDateFormat("ddMMyyyy-HHmmss");	
    String Stamp = df.format(d);
	
	File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(abc,new File(".\\Screenshots\\"+ name + "-" + Stamp  +".PNG"));
}
	public void sendKeysByanyLocator(By Locator,String inpuData) {
		WebElement element = driver.findElement(Locator);
		
		//IsDisplayed in Page
		if(element.isDisplayed()) {
			if (element.isEnabled()) {
				element.clear();
				element.sendKeys(inpuData);				
			}else {
				System.out.println("Element is Disable state on Dom,PLZ Check");
			}
			
		}else {
			System.out.println("Element is Not Displayed on Dom,PLZ Check");
		}
		
		
		
	} 

}
