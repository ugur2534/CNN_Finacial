package com.cnn.regression1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.masterpagefactory.MasterPagefactory;
import com.masterpagefactory.MasterPagefactory1;
import com.util.ExplicitWait;
import com.util.Highlighter1;
import com.util.TakeAppScreenShot;

public class testCaseTwo {
	public static void getTitle(WebDriver driver) {

		MasterPagefactory1 mf = PageFactory.initElements(driver, MasterPagefactory1.class);

		String TitleBeforeClick = driver.getTitle();
		ExplicitWait.getwait(driver, mf.getAllPageName().get(0));
		for (int i = 0; i < mf.getAllPageName().size(); i++) {

			while (true) {// never stop===> infinite time

				if (mf.getAllPageName().size() > 0) {
					Highlighter1.highligt(driver, mf.getAllPageName().get(i), "green");
					String pageName = mf.getAllPageName().get(i).getText();
					ExplicitWait.getwait(driver, mf.getAllPageName().get(i));
					mf.getAllPageName().get(i).click();// ...............................................................Click
					System.out.println("Click here.............");

					// wait...............for market

					System.out
							.println("Home title =" + TitleBeforeClick + "=== After Click title " + driver.getTitle());
					if (driver.getTitle() != null && !driver.getTitle().contains(TitleBeforeClick)) {
						for (AllMyPageTitle myEnum : AllMyPageTitle.values()) {
							if (pageName.toUpperCase().contains(myEnum.toString())) {
								System.out.println("Found my Title = " + driver.getTitle());
								TakeAppScreenShot.captureScreenShot(driver, pageName);
								Assert.assertEquals(driver.getTitle(), myEnum.getTitle());
							}
						}
						break;// break the while loop
					} else {

						try {
							System.out.println("Need to wait...............");
							Thread.sleep(3000);
						} catch (InterruptedException e) {

						}
						;
					}

				}

			}

			if (i == 0) {
				driver.get("https://www.cnn.com/BUSINESS");

			}

		}

	}

}
