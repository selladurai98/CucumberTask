package com.flipcart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipcart.resources.Commonactions;

public class TvPurchasePage extends Commonactions{
	public TvPurchasePage() {
		PageFactory.initElements(driver,this);
			
		}
		@FindBy(xpath = "//button[text()='✕']")
		private WebElement closeIcon;
		
		@FindBy(name = "q")
		private WebElement search;
		
		@FindBy(xpath ="(//*[@class='_4rR01T'])[1]")
		private WebElement tv;
		
		@FindBy(xpath = "//button[text()='BUY NOW']")
		private WebElement buy;

		public WebElement getCloseIcon() {
			return closeIcon;
		}

		public WebElement getSearch() {
			return search;
		}

		public WebElement getTv() {
			return tv;
		}

		public WebElement getBuy() {
			return buy;
		}
		
}
