package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//To edit the text boxes by going to webesite
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_KT\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement emailBox= driver.findElement(By.id("email"));
		emailBox.sendKeys("test@gmail.com");
		WebElement appendBox= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
		appendBox.sendKeys("Text"); 
		WebElement getTextBox= driver.findElement(By.name("username"));
		String value = getTextBox.getAttribute("value");
		System.out.println(value);
		WebElement  ClearBOX = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		ClearBOX.clear();
		WebElement disabledBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enabled = disabledBox.isEnabled();
		System.out.println(enabled);
	
	
		
		
	
				
		
	}

}
