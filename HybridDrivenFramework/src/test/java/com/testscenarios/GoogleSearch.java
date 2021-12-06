package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
  @Test
  public void f() {
	  WebDriver driver;	    
	  //System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
	  //If you want to run any specific version 
	  // WebDriverManager.chromedriver().browserVersion("84").setup();
      //WebDriverManager.chromedriver().setup();
      //driver = new ChromeDriver();  
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");	  
	  
  }
}
