package pomPages;												//16-2-23

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaVedioPagePom {
		//Declaration
		@FindBy(xpath="//h1[text()='Core Java For Selenium Training']")
	    private WebElement pageHeader;
		
		@FindBy(xpath="//button[@aria-label='Play']")
		private WebElement PlayButton;
		
		@FindBy(xpath="//button[@aria-label='Pause']")
		private WebElement PauseButton;
		
		@FindBy(xpath="//span[text()='Add To Wishlist']")
		private WebElement addToWishList;
		
		@FindBy (xpath="//span[text()='Add To Wishlist']")
		private WebElement addToWishlist;
		
		@FindBy(xpath="//a[@class='close_cookies']")
		private WebElement closeCookiesIcon;
		
		
		//Initiliazation
		
		public CoreJavaVedioPagePom(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		public String getPageHeader()
		{
			return pageHeader.getText();
		}
		
		public void clickPlayButton()
		{
			PlayButton.click();
		}
		
		public void cliclPauseButton()
		{
			PauseButton.click();
		}
		
		public void clickAddToWishlist()
		{
			addToWishlist.click();
		}
		
		public void clickCloseCookies() {
			closeCookiesIcon.click();
		}
	}

		
	
