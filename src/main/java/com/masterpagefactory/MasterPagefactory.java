package com.masterpagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MasterPagefactory {

	@FindBy(xpath = "(//*[@class='sc-htoDjs dpodOf'])[1]//li")
	private List<WebElement> AllPageName;

	public List<WebElement> getAllPageName() {
		return AllPageName;

	}
	//(//*[text()='Markets'])[1]
	@FindBy(xpath = "(//*[text()='Markets'])[1]")
	private WebElement MarkettClick;

	public WebElement getMarkettClick() {
		return MarkettClick;
	}

    @FindBy(xpath = "//*[@class='ticker-name-change']")
	private List< WebElement> allShare;

	public List<WebElement> getAllShare() {
		return allShare;
	}

	@FindBy(xpath = "//*[@class='stock']")
	private List< WebElement> PopularStocks;

	public List<WebElement> getPopularStocks() {
		return PopularStocks;
	}
	@FindBy(xpath = "(//*[@class='disclaimer'])[2]")
	private WebElement updatetime;

	public WebElement getUpdatetime() {
		return updatetime;
	}
	 @FindBy(xpath = "//*[ @class='column stock-price']")
		private List< WebElement> MostPrice;

	public List<WebElement> getMostPrice() {
		return MostPrice;
	}
	 @FindBy(xpath = "//*[@transform='translate(210,0)']")
		private List<WebElement>  SectorPerformans ;

	public  List<WebElement> getSectorPerformans() {
		return SectorPerformans;
	}
	@FindBy(xpath = "//*[@class='bar negative']")
	private List<WebElement> Sectorbar ;

	public List<WebElement> getSectorbar() {
		return Sectorbar;
			
	}
	@FindBy(xpath = "//*[@class='module-body wsod losers']")
	private List<WebElement>loser ;

	public List<WebElement> getloser() {
		return loser;
}
}














