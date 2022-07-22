package com.flipcart.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.flipcart.objectrepository.TvPurchasePage;
import com.flipcart.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class TvPurchase{
	
	static WebDriver driver;
	
	Commonactions c = new Commonactions();
	TvPurchasePage t = new TvPurchasePage();
	
	@Given("user login into flipkart")
	public void user_login_into_flipkart() {
		
	  c.launch();
	  
	try	{ 
		 t.getCloseIcon().isDisplayed();
		  t.getCloseIcon().click();
		
	}catch (Exception e) {
	System.out.println("method 1 - popup handled");
}
	}
	@When("user search tv")
	public void user_search_mobile() {
		t.getSearch();
    	t.getSearch().sendKeys("samsung",Keys.ENTER);
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	t.getTv();
   	 String s = t.getTv().getText();
   	 t.getTv().click();
	}

	@When("user choose the mobile and doing payments")
	public void user_choose_the_mobile_and_doing_payments() {
		c.windowsHandling();
	}

	@Then("user receive order confirmation message")
	public void user_receive_order_confirmation_message() throws IOException {
	   WebElement  buy = driver.findElement(By.xpath("//button[text()='BUY NOW']"));
	
		c.scrollDown(buy);
	   String  str1 = buy.getText(); 
	   buy.click();
	   c.screenshot();
	
}
	


}
