package com.flipcart.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.flipcart.resources.Commonactions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Commonactions{
	
	
	Commonactions c = new Commonactions();
@Before
public void launch() {
	
	System.out.println("before sceneario");

	
}
@After
public void quit() {
	
	System.out.println("after sceneario");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
driver.quit();
}}
