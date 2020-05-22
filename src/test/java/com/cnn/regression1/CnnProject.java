package com.cnn.regression1;

import javax.swing.PopupFactory;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.masterpagefactory.MasterPagefactory;
import com.masterpagefactory.MasterPagefactory1;

public class CnnProject {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		driver = TestCaseone.Setup();

	}
//
//	@Test
//	public void pageTitle_02() throws Throwable {
//
//		//Tescasetwo.GetTitle(driver);
//	}
	@Test
	public void market_03() {
		MasterPagefactory1 mf=PageFactory.initElements(driver,MasterPagefactory1.class);
		mf.getAllPageName().get(0).click();
		
		mf.getMostPopularStok().forEach(Data -> {
			System.out.println(Data.getText().replace("\n",","));
			
		});

		
		
	}
}