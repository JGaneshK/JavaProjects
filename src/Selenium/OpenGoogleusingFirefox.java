package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.interactions.MouseMoveToLocation;
import org.openqa.selenium.support.ui.Select;



public class OpenGoogleusingFirefox {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {


			
			System.setProperty("webdriver.chrome.driver","C:\\Selenium_KT\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			driver= new ChromeDriver();		
		    driver.get("https://demoqa.com/automation-practice-form/");
		   		    String title = driver.getTitle();
		    System.out.println(title);
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		 WebElement dropdown = driver.findElement(By.xpath("//div[text()='Select State']"));
		 Select s= new Select(dropdown);
		 s.selectByIndex(1);
		 
		 
		 
		
			
			
			
			
		}
		
	}
		  
		   
		    
			    
			    

		   
		   
		   
		  
		   
	}
	
		    
		   
		    		
		   
		
	




