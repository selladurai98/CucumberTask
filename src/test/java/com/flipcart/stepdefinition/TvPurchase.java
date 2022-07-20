package com.flipcart.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;

public class TvPurchase {
	@When("user search tv")
	public void user_search_tv() {
		
			MobilePurchaseSteps.driver.findElement(By.name("q")).sendKeys("samsung tv",Keys.ENTER);
	    	
			MobilePurchaseSteps.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    	WebElement tv= MobilePurchaseSteps.driver.findElement(By.xpath("(//*[@class='_4rR01T'])[1]"));
	   	 String s = tv.getText();
	   	 System.out.println(s);
	   	 tv.click();
}}
