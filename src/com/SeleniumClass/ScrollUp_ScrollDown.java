package com.SeleniumClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollUp_ScrollDown {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//ScrollDown
		js.executeScript("window.scrollBy(0,2000)");
		
		//ScrollUp
		js.executeScript("window.scrollBy(0,-1000)");
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		WebElement audible = driver.findElement(By.xpath("(//a[text()='Audible'])[2]"));
		
		js.executeScript("arguments[0].click();", audible);
		
		
		
	}

}
