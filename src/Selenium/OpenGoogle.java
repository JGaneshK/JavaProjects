package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;




public class OpenGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//1.Open Google chrome
		//2.open facebook.com home page
		
System.setProperty("webdriver.gecko.driver", "C:\\Selenium_KT\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
	
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		String title1 = driver.getTitle();
		System.out.println(title1);
		Actions act= new Actions(driver);
	Thread.sleep(2000);
	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
    
    //Element on which need to drop.		
    WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
    								

//Dragged and dropped.		
    act.dragAndDrop(From, To).build().perform();		
		
		
		
	}

}
