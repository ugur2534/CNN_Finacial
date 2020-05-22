package com.regression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.config.ObjectMap;
import com.excel.manager.ExcelColumn;
import com.excel.manager.ReturnExcelNew;
import com.generic.DriverScript;
import com.masterpagefactory.MasterPagefactory;
import com.util.Highlighter1;
import com.util.ExplicitWait;
<<<<<<< HEAD
//masterugurbbbkh
=======
//origin
>>>>>>> d18c746f77996b7d14d8cbd57e2d9f91efcf9eed
public class MarketData {
	WebDriver driver;
	MasterPagefactory pf;
	Map<String, String> Mymap;
	List<String> popstocks;
	JavascriptExecutor js;

	@BeforeTest
	public void Sutup_tc01() {

		driver = new DriverScript().getdriver(ObjectMap.getconfig("URL"));
		pf = PageFactory.initElements(driver, MasterPagefactory.class);
		js = (JavascriptExecutor) driver;
	}

	@Test(priority=1)
	public void regression_tc02() throws Throwable {

		int pagesize = pf.getAllPageName().size();
		System.out.println("Page size number=" + pagesize);

		for (int i = 0; i < pagesize; i++) {
			
			//Highlighter1.highligt(driver, pf.getAllPageName().get(i));
			ExplicitWait.getwait(driver, pf.getAllPageName().get(i));
             pf.getAllPageName().get(i).click();
			Thread.sleep(2000);

			System.out.println("page name= " + "Title is =" + driver.getTitle());
			driver.navigate().back();

		} 
		

	}}

//	@Test(priority=2)  
//	public void regression_tc03() throws Throwable {
//
//		Mymap = new LinkedHashMap<>();
//
//		Highlighter1.highligt(driver, pf.getMarkettClick());
//		pf.getMarkettClick().click();
//		// new Actions(driver).moveToElement(pf.getAllShare().get(0)).click().perform();
//		Thread.sleep(3000);
//		System.out.println("Share name is size==" + pf.getAllShare().size());
//
//		for (int i = 0; i < pf.getAllShare().size(); i++) {
//
//			Highlighter1.highligt(driver, pf.getAllShare().get(i));
//
//			ExplicitWait.getwait(driver, pf.getAllShare().get(i));
//
//			String alltextvalue = pf.getAllShare().get(i).getText();
//
//			String allkeyname = pf.getAllShare().get(i).getAttribute("data-ticker-name");
//			
//			 Mymap.put(allkeyname, alltextvalue);
//
//			// System.out.println(" Key name is=="+allkeyname);
//			// System.out.println("value is==" + alltextvalue);
//
//		}
//		System.out.println("Keys and values ==" + Mymap.toString());// Whole map==>Key::value
//		// System.out.println("Keys=="+ Maymap.keySet().toString());//keys
//		// System.out.println("values=="+ Maymap.values().toString());//values==>test
//		// data
//		System.out.println("*******************************");
//	}

//	@Test(priority=3)
//	public void regression_tc04() {
//
//		List<String> testDataList = new ArrayList<>();
//
//		testDataList = ReturnExcelNew.returnExcel("./Test Data/Test Data Financial.xlsx", "Market");
//		System.out.println("Test excel data values==" + testDataList.get(1));
//
//		if (Mymap.keySet().toString().trim().contains(testDataList.get(0).trim())) {
//
//			System.out.println("Top section keys Validation  Passed ....." + Mymap.keySet() + " = " + testDataList.get(0));
//
//			 //Assert.assertEquals(Maymap.keySet().toString().trim(), testDataList.get(0).trim(),"Passed the  keys name........");
//		} else
//
//        {
//		System.out.println("Top section keys Validation Falied ....." + Mymap.keySet() + " = " + testDataList.get(0));
//        //Assert.assertEquals(Maymap.keySet().toString().trim(),testDataList.get(0).trim(),"Failed the name........");
//	   
//		}
//		if (Mymap.values().toString().trim().contains(testDataList.get(1).trim())) {
//			System.out.println("Top section Value Validation  Passed ....." + Mymap.values() + " = " + testDataList.get(1));
//
//			// Assert.assertEquals(Maymap.values().toString().trim(),testDataList.get(1).trim(),"Passed the value........");
//		}else {
//			 System.out.println("Top section Value Validation Failed ....."+Mymap.values()+" = "+testDataList.get(1));
//			 
//			 //Assert.assertEquals(Maymap.values(),testDataList.get(1).trim(),"Failed the value........");
//		}
//		
//			
//		}
//	@Test(priority = 4)
//	public void regression_tc05() throws Throwable {
//
//		List<String> popstocks = new LinkedList<>();
//
//		Highlighter1.highligt(driver, pf.getMarkettClick());
//		pf.getMarkettClick().click();
//
//		int element = pf.getPopularStocks().size();
//
//		System.out.println("Most Popular stocks size==" + element);
//
//		for (int i = 0; i < element; i++) {
//			Highlighter1.highligt(driver, pf.getPopularStocks().get(i));
//			String Keytext = pf.getPopularStocks().get(i).getText();
//			popstocks.add(Keytext);
//			// System.out.println("most ppopular name==" + Keytext);
//
//		}
//		System.out.println(popstocks.toString());
//
//		System.out.println("Time" + " " + pf.getUpdatetime().getText());
//		Highlighter1.highligt(driver, pf.getUpdatetime());
//		// js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		js.executeScript("window.scrollBy(0,300)", "");
//	}

//	@Test(priority = 5)
//	public void regression_tc06() throws Throwable {
//		SoftAssert soft = new SoftAssert();
//		List<String> testDataList1 = new ArrayList<>();
//
//		List<String> testdatavalues = ReturnExcelNew.returnExcel("./Test Data/Test Data Financial.xlsx",
//				"Most Popular Stocks");
//
//		int datasize = testdatavalues.size();
//		System.out.println("**********Reading excel**********");
//		for (int i = 0; i < datasize; i++) {
//			String values = testdatavalues.get(i);
//
//			testDataList1.add(values);
//		}
//		System.out.println(testDataList1);
//		
//		soft.assertEquals(popstocks.toString().trim(), testDataList1.toString().trim(), "Test passedddd......");
//		// Assert.assertEquals(popstocks.toString().trim(),
//		// testDataList1.toString().trim(), "Test passedddd......");
//		soft.assertNotEquals(popstocks.toString().trim(), testDataList1.toString().trim(), "test faileddddd....");
//
//		if (popstocks == testDataList1) {
//			System.out.println("test passed.......");
//		} else {
//
//			System.out.println("test Failed....");
//
//		}
//
//		String path="./Test data/Test Data Financial.xlsx";
//		
//		List<String>priceclumList=ExcelColumn.columnValue(path, 1);
//		
//		System.out.println("excel price colum::"+priceclumList);
//		
//		for(int i=0;i<pf.getMostPrice().size();i++) {
//			
//			Highlighter1.highligt(driver, pf.getMostPrice().get(i));
//			System.out.println("Price values::"+pf.getMostPrice().get(i).getText());
//			
//			//Assert.assertNotEquals(pf.getMostPrice().get(i).getText(), priceclumList.toString().trim(), "Test is ppassed");
//			//Assert.assertEquals(pf.getMostPrice().get(i).getText(), priceclumList.toString().trim(),"Testis failed******");
//		}
//		
//	}
//	@Test(priority = 6)
//	public void regression_tc07() {
//
//		pf.getMarkettClick().click();
//		js.executeScript("window.scrollBy(0,1100)", "");
//
//		List<String> perList = new LinkedList<>();
//		// int sectorperform=pf.getSectorPerformans().size();
//
//		for (int i = 0; i < pf.getSectorPerformans().size(); i++) {
//			
//			String sector = pf.getSectorPerformans().get(i).getText();
//			Highlighter1.highligt(driver, pf.getSectorPerformans().get(i));
//			perList.add(sector);
//	   
//		 
//			
//			
//				}
//	
//   
//		System.out.println(perList);
//         System.out.println("*******************************");
//		
//	}
//	@Test(priority = 7)
//	public void regression_tc08() {
//		
//		List<String> perList1 = new LinkedList<>();
//		for (int i = 0; i < pf.getSectorbar().size(); i++) {
//			String sector1 = pf.getSectorPerformans().get(i).getText();
//			perList1.add(sector1);
//           Collections.sort(perList1);
//      
//		}
//		
//		System.out.println("Most Performans Biggest Bar==" + Collections.max(perList1));
//		//Collections.sort(perList1);
//		
//		
//	}


// @Test(priority = 7)
// public void regression_tc09() {
//	
//	
//	for (int i = 0; i < pf.getloser().size(); i++) {
//		
//		
//		System.out.println("Loser sektor=="+pf.getloser().get(i).getText());
//		
//	}
//	
//
//
//}}

//	@AfterTest
//	public void TearDown() {
//
//		driver.quit();
//	}
