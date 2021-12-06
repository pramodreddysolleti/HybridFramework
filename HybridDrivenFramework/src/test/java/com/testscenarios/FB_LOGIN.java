package com.testscenarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.objectrepository.locators;
import com.utilities.CommonFunctions;
import com.utilities.StaticVariables;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FB_LOGIN extends StaticVariables{
	//Create reference name for commonfunction class file
	//CLASSNAME refName = new CLASSNAME();
	CommonFunctions cfn = new CommonFunctions();
	locators obj = new locators();
	  
  @Test
  public void loginWithInvaliCredentials() throws Exception {	
	  Properties prop = new Properties();	
      FileInputStream filepath = new FileInputStream(".\\TestData\\TD.properties");
      prop.load(filepath);	 
	  cfn.lauchChromeBrowser();
      //Is Element is displayed on page?
	  //is enabled on page
	  //is any existing data available into editbox ,not cleared
	  driver.get(prop.getProperty("baseURL"));	  
	  driver.findElement(obj.FBLOGIN_USERNAME_EDITBOX).sendKeys(prop.getProperty("UserName"));
	  driver.findElement(obj.FBLOGIN_PASSWORD_EDITBOX).sendKeys(prop.getProperty("Password"));	  
	  driver.findElement(obj.FBLOGIN_LOGIN_BUTTON).click();
	  cfn.takescreenshot("FbLogin");
	  
	  
  }
}
