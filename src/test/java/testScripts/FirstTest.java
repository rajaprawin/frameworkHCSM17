package testScripts;				//pass			//17-2-23

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPages.BaseClassPom;

public class FirstTest extends BaseClassPom{
// Skillary first test
	@Test
	
	public void firstTest( ) {
		SoftAssert soft= new SoftAssert();
		
		home.clickGears();
		home.clickSkillrarydemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
		
		skillraryDemo.mouseHoverToCourse(web);
		skillraryDemo.clickSeleniumTraining();
		
		soft.assertEquals(selenium.getPageHeader().getText(), "Selenium Training");
		selenium.doubleClickPlusButton(web);
		selenium.clickAddToCart();
		web.handleAlert();
		web.explicitwait(time, selenium.getItemAddedMessage());
		web.takeScreenShot();
		soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
		
		soft.assertAll();
	}

}
