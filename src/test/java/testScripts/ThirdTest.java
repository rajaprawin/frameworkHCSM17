package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPages.BaseClassPom;

public class ThirdTest extends BaseClassPom {

	
	@Test
	public void thirdTest() throws InterruptedException {
		
		SoftAssert soft= new SoftAssert();
		
		home.searchFor("core java for selenium");
		soft.assertEquals(coreJava.getPageHeader(), "CORE JAVA FOR SELENIUM");
		
		coreJava.clickCoreJavaForSeleniumLink();
		soft.assertEquals(javaVideo.getPageHeader(), "Core Java For Selenium Training");
		
		javaVideo.clickCloseCookies();
		
		web.switchToFrame();
		javaVideo.clickPlayButton();
		Thread.sleep(2000);
		javaVideo.cliclPauseButton();
		
		web.switchBackFromFrame();
		
		javaVideo.clickAddToWishlist();
		
		soft.assertAll();
	
	
	}
}