package comcast.vtiger.generalutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import comcast.vtiger.objectRepository.loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public WebDriver driver;
	public static WebDriver sDriver;
	propertyUtility plib=new propertyUtility();
	
	
	@BeforeSuite(groups= {"smokeTest","regressionTest"})
	public void beforesuit()
	{
		System.out.println("DataBase connection");
	} 
	
	@BeforeTest(groups= {"smokeTest","regressionTest"})
	public void beforetest()
	{
		System.out.println("Execute test in parallel mode");
		
	}
	//@Parameters("BROWSER")
	
	@BeforeClass(groups= {"smokeTest","regressionTest"})
	
	//public void beforeclass(String BROWSER) throws Throwable
	public void beforeclass() throws Throwable
	{
		
		String BROWSER=plib.getPropertyKeyValue("browser");
		
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
		}
		
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
					
		}
		sDriver=driver;
	}
	
	@BeforeMethod(groups= {"smokeTest","regressionTest"})
	public void beforemethod() throws Throwable
	{
			
		System.out.println("Login to application");
		String url=plib.getPropertyKeyValue("url");
		String username=plib.getPropertyKeyValue("username");
		String password=plib.getPropertyKeyValue("pwd");
		driver.get(url);
		
		loginpage loginpage=new loginpage(driver);
		loginpage.login(username, password);
		
		
	}
	@AfterMethod(groups= {"smokeTest","regressionTest"})
	public void aftermethod()
	{
		System.out.println("logout from application");
	}
	@AfterClass(groups= {"smokeTest","regressionTest"})
	public void afterclass()
	{
		System.out.println("closing the browser");
	}
	@AfterTest(groups= {"smokeTest","regressionTest"})
	public void aftertest()
	{
		System.out.println("parallel execution is done");
	}
	@AfterSuite(groups= {"smokeTest","regressionTest"})
	public void aftersuite()
	{
		System.out.println("closing the database connection");
	}

}
