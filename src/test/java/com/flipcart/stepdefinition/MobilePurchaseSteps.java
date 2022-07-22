package com.flipcart.stepdefinition;

import java.io.IOException;
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

import com.flipcart.objectrepository.MobilePurchasePage;
import com.flipcart.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilePurchaseSteps  extends Commonactions{

	static WebDriver driver;
	Commonactions c = new Commonactions();
	MobilePurchasePage m = new MobilePurchasePage();
	@Given("user login into flipkart")
	public void user_login_into_flipkart() {
		
	c.launch();
	try	{m.getCloseIcon();
		  m.getCloseIcon().isDisplayed();
		  m.getCloseIcon().click();
		
	}catch (Exception e) {
	System.out.println("method 1 - popup handled");
}
	}
	@When("user search mobile")
	public void user_search_mobile() {
		m.getSearch();
    	m.getSearch().sendKeys("Iphone",Keys.ENTER);
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    m.getMobile();
   	 String s = m.getMobile().getText();
   m.getMobile().click();
	}

	@When("user choose the mobile and doing payments")
	public void user_choose_the_mobile_and_doing_payments() {
		c.windowsHandling();
	}

	@Then("user receive order confirmation message")
	public void user_receive_order_confirmation_message() throws IOException {
	 m.getBuy();
	
		c.scrollDown(m.getBuy());
	   String  str1 = m.getBuy().getText(); 
	   m.getBuy().click();
	   c.screenshot();
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
