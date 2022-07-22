package com.flipcart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobilePurchasePage {
	@FindBy(xpath = "//button[text()='✕']")
	private WebElement closeIcon;
	
	@FindBy(name = "q")
	private WebElement search;
	
	@FindBy(xpath ="(//*[@class='_4rR01T'])[1]")
	private WebElement mobile;
	
	@FindBy(xpath = "//button[text()='BUY NOW']")
	private WebElement buy;
	
	public WebElement getSearch() {
		return search;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getBuy() {
		return buy;
	}
	
	public WebElement getCloseIcon() {
		return closeIcon;
	}
}
