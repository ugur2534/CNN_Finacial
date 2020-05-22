package com.cnn.regression1;

import java.util.List;

import javax.swing.PopupFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.masterpagefactory.MasterPagefactory;
import com.util.ExplicitWait;
import com.util.Highlighter1;

public class Tescasetwo {

	public static void GetTitle(WebDriver driver) throws Throwable {

		// 2nd testcases = go to all page or Module and get title from there
		MasterPagefactory pf = PageFactory.initElements(driver, MasterPagefactory.class);

		String TitleBeforeClick = driver.getTitle();
		
		ExplicitWait.getwait(driver, pf.getAllPageName().get(0));
		
		for (int i = 0; i < pf.getAllPageName().size(); i++) {

			while (true) {// never stop===> infinite time
				//List<WebElement> allPages = pf.getAllPageName();

				if (pf.getAllPageName().size() > 0) {

					Highlighter1.highligt(driver,pf.getAllPageName().get(i), "red");

					System.out.println(pf.getAllPageName().get(i).getText());

					ExplicitWait.getwait(driver,pf.getAllPageName().get(i));
					
					pf.getAllPageName().get(i).click();// ...............................................................Click
					
					// wait=======> title
					if (driver.getTitle() != null) {
						// validate
						if (i == 0) {// market
							Thread.sleep(5000);
							Assert.assertEquals(driver.getTitle(), TitlePageValue.MARKET);// Failed===> stop
							System.out.println("Test passed =" + driver.getTitle());// Passed

						} else if (i == 1) {// Tech
							Assert.assertEquals(driver.getTitle(), TitlePageValue.TECH);// Failed===> stop
							System.out.println("Test passed =" + driver.getTitle());// Passed

						} else if (i == 2) {// Media
							Assert.assertEquals(driver.getTitle(), TitlePageValue.MEDIA);// Failed===> stop
							System.out.println("Test passed =" + driver.getTitle());// Passed

						} else if (i == 3) {// Success
							Assert.assertEquals(driver.getTitle(), TitlePageValue.SUCCESS);// Failed===> stop
							System.out.println("Test passed =" + driver.getTitle());// Passed

						} else if (i == 4) {// Perspectives
							Assert.assertEquals(driver.getTitle(), TitlePageValue.PERSPECTIVES);// Failed===> stop
							System.out.println("Test passed =" + driver.getTitle());// Passed

						} else if (i == 5) {// Video
							Assert.assertEquals(driver.getTitle(), TitlePageValue.VIDEO);// Failed===> stop
							System.out.println("Test passed =" + driver.getTitle());// Passed

						} else {
							System.out.println("Not Correct Title =" + driver.getTitle());
							Assert.assertEquals(2, 4);
						}

						System.out.println("Found my Title................and break the while loop");
						break;// break the while loop

					} else {

						Thread.sleep(3000);
					}

				}

			}

			if (i == 0) {
				driver.get("https://www.cnn.com/BUSINESS");

			}

		}

	}
}
