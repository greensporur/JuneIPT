package com.SeleniumClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenShot_ {
		
		public static void main(String[] args) throws IOException {
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com/");
			
			TakesScreenshot ts = (TakesScreenshot)  driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("C:\\Users\\admin\\eclipse-workspace\\SeleniumClass\\ScreenShot\\flipkart.png");
			
			FileUtils.copyFile(source, dest);
			
			
			
		}

	}

