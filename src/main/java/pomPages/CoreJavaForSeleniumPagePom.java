package pomPages;								//16-2-23

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSeleniumPagePom {
	//Declaration
	@FindBy(xpath = "//h2[@class='list_title']")
	private WebElement pageHeader;
	
	@FindBy (xpath = "//a[text()=' Core Java For Selenium Trainin']")
	private WebElement coreJavaForSeleniumLink;
	
	//Initialization
	public CoreJavaForSeleniumPagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public String getPageHeader() {
		return pageHeader.getText();
	}
	public void clickCoreJavaForSeleniumLink() {
		coreJavaForSeleniumLink.click();
	}

}
