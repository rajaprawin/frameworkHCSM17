package pomPages;										//16-2-23
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import genericLibraries.ExcelUtility;
import genericLibraries.IConstantPath;
import genericLibraries.PropertiesFileUtility;
import genericLibraries.WebDriverUtility;


public class BaseClassPom {
	protected PropertiesFileUtility property;
	protected ExcelUtility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;
	protected HomePagePom home;
	protected SkillraryDemoAppPagePom skillraryDemo;
	protected ContactUsPagePom contact;
	protected TestingPagePom testing;
	protected CoreJavaForSeleniumPagePom coreJava;
	protected SeleniumTrainingPagePom selenium;
	protected CoreJavaVedioPagePom javaVideo;
	protected long time;
	
	//@BeforeSuite
	//@BeforeTest
	@BeforeClass
	       public void classConfiguration()
	       {
		      property= new PropertiesFileUtility();
		     excel= new ExcelUtility();
		    
			 web= new WebDriverUtility();
		
		     
		     property.propertyFileInitialization(IConstantPath.PROPERTIES_FILE_PATH);
		     excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);
		     
	       }

	@BeforeMethod
	public void methodConfiguration() {
		time = Long.parseLong(property.fetchProperty("timeouts"));
		driver = web.openApplication(property.fetchProperty("browser"), property.fetchProperty("url"), time);
		home=new HomePagePom(driver);
		skillraryDemo = new SkillraryDemoAppPagePom(driver);
		selenium= new SeleniumTrainingPagePom(driver);
		coreJava=new CoreJavaForSeleniumPagePom(driver);
		javaVideo= new CoreJavaVedioPagePom(driver);
		testing=new TestingPagePom(driver);
		contact=new ContactUsPagePom(driver);
	}

	@AfterMethod
	    public void methodTearDown()
	    {
		   web.quitBrowser();
	    }
	@AfterClass
	     public void classTearDown()
	     {
		   excel.closeExcel();
	     }
	// @AfterTest
	// @AfterSuite
}


	
