package com.masterpagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MasterPagefactory1 {

	@FindBy(xpath = "(//*[@class='sc-htoDjs dpodOf'])[1]//li")
	private List<WebElement> AlllPageName;

	public List<WebElement> getAllPageName() {
		return AlllPageName;

	}
	 @FindBy(xpath = "//*[@class='module-body wsod most-popular-stocks']//a")
		private List< WebElement> mostPopularStok;

	

		public List<WebElement> getMostPopularStok() {
			return mostPopularStok;
		}
}
