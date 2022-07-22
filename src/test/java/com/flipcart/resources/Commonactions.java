package com.flipcart.resources;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions {
	 public static WebDriver driver;
	 
	 public void launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		System.out.println("browser launched");
	 }
			
	 public void windowsHandling() {
		 String pwin= driver.getWindowHandle();
	 	  Set<String> allwin = driver.getWindowHandles();
	 	  for (String x : allwin) {
	 		if (!x.equals(pwin)) {
	 			driver.switchTo().window(x);
	 		}}
	 	
  driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	 }
	 
	 public void scrollDown( WebElement ele) {
		
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",ele);
	 }
		
	 public void screenshot() throws IOException {

		TakesScreenshot tk = (TakesScreenshot)driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\selladurai\\eclipse-workspace\\SeleniumProject\\screenshot\\flip1.png");
		FileUtils.copyFile(source,target);
	 }
	 
	public void insertText(WebElement ele , String value) {
		ele.sendKeys(value,Keys.ENTER);
	}
	
		
	}
	

