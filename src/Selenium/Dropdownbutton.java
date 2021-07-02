package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Dropdownbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_KT\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		
		WebElement dropDown1= driver.findElement(By.id("dropdown1"));
		Select select= new Select(dropDown1);
		select.selectByIndex(3);
		WebElement dropDown2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/select"));
		Select select2= new Select(dropDown2);
		select2.selectByVisibleText("Selenium");
		WebElement dropDown3= driver.findElement(By.id("dropdown3"));
		Select select3= new Select(dropDown3);
		select3.selectByValue("2");
        List<WebElement> listofOptions = select.getOptions();
		int size = listofOptions.size();
		System.out.println("Number of option:"+size);
		WebElement dropdown5 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select"));
		dropdown5.sendKeys("Loadrunner");
		WebElement multiselect = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select multiselectBox= new Select(multiselect);
		multiselectBox.selectByIndex(1);
		multiselectBox.selectByIndex(2);
		multiselectBox.selectByIndex(3);
		
		
	
		
		
	
		
		
		


	}

}
