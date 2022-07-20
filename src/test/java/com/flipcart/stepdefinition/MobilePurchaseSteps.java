package com.flipcart.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilePurchaseSteps {

	static WebDriver driver;
	
	@Given("user launches flipkart application")
	public void user_launches_flipkart_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("browser launched");

	}
	@Given("user login into flipkart")
	public void user_login_into_flipkart() {
		
	
	try	{ WebElement  ref = driver.findElement(By.xpath("//button[text()='✕']"));
		  ref.isDisplayed();
		  ref.click();
		
	}catch (Exception e) {
	System.out.println("method 1 - popup handled");
}
	}
	@When("user search mobile")
	public void user_search_mobile() {
		WebElement search = driver.findElement(By.name("q"));
    	search.sendKeys("Iphone",Keys.ENTER);
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	WebElement iphone= driver.findElement(By.xpath("(//*[@class='_4rR01T'])[1]"));
   	 String s = iphone.getText();
   	 iphone.click();
	}

	@When("user choose the mobile and doing payments")
	public void user_choose_the_mobile_and_doing_payments() {
		String pwin= driver.getWindowHandle();
  	  Set<String> allwin = driver.getWindowHandles();
  	  for (String x : allwin) {
  		if (!x.equals(pwin)) {
  			driver.switchTo().window(x);
  		}}
  	
 		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	@Then("user receive order confirmation message")
	public void user_receive_order_confirmation_message() {
	   WebElement  buy = driver.findElement(By.xpath("//button[text()='BUY NOW']"));
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",buy);
	   String  str1 = buy.getText(); 
	   buy.click();
	   
	  driver.quit();
}
	@When("user search mobile by using one dim list")
	public void user_search_mobile_by_using_one_dim_list(DataTable dataTable) {
		List<String> asList = dataTable.asList();
		
		WebElement search = driver.findElement(By.name("q"));
    	search.sendKeys(asList.get(0),Keys.ENTER);
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	WebElement phone= driver.findElement(By.xpath("(//*[@class='_4rR01T'])[1]"));
   	 String s = phone.getText();
   	phone.click();
   	 
	   
	 
	}@When("user search mobile by using one dim map")
	public void user_search_mobile_by_using_one_dim_map(DataTable dataTable) {
		Map<String,String> asMap = dataTable.asMap(String.class,String.class);
		
		WebElement search = driver.findElement(By.name("q"));
    	search.sendKeys(asMap.get("phone1"),Keys.ENTER);
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	WebElement phone= driver.findElement(By.xpath("(//*[@class='_4rR01T'])[1]"));
   	 String s = phone.getText();
   	 phone.click();
   	 
	}	 
	@When("user search mobiles{string}")
	public void user_search_mobiles(String string) {
		WebElement search = driver.findElement(By.name("q"));
    	search.sendKeys(string,Keys.ENTER);
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	WebElement phone= driver.findElement(By.xpath("(//*[@class='_4rR01T'])[1]"));
   	 String s = phone.getText();
   	 phone.click();
}}
