package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_KT\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		//Get Position
		WebElement getPositionbox= driver.findElement(By.id("position"));
		Point xypoint = getPositionbox.getLocation();
		int xValue= xypoint.getX();
		int yValue= xypoint.getY();
		System.out.println("X value is:" +xValue+" yValue is:"+yValue );
		//Get Button Color
		WebElement getColour= driver.findElement(By.id("color"));
		String Colourofbox=getColour.getCssValue("background-color");
		System.out.println("Color of the box is:"+Colourofbox);
		//Find Height and width
		WebElement SizeofButton = driver.findElement(By.id("size"));
		Dimension Size= SizeofButton.getSize();
		int Height=Size.getHeight();
		int Width=Size.getWidth();
		System.out.println("Height is:"+Height+"Widhth is:"+Width);
		//Goto Homepage
		WebElement Homepage= driver.findElement(By.id("home"));
		Homepage.click();
		
		
		
	
		
		
	
		

	}

}
