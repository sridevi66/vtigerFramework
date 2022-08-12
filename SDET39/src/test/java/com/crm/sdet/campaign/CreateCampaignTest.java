package com.crm.sdet.campaign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import comcast.vtiger.generalutility.Baseclass;
import comcast.vtiger.generalutility.ExcelUtility;
import comcast.vtiger.generalutility.WebDriverUtility;
import comcast.vtiger.generalutility.javaUtility;
import comcast.vtiger.generalutility.propertyUtility;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.campaignplusbutton;
import comcast.vtiger.objectRepository.createcampaign;
import comcast.vtiger.objectRepository.loginpage;
import comcast.vtiger.objectRepository.validcreatecampaign;


public class CreateCampaignTest extends Baseclass {

	

	@Test(groups={"smokeTest","regressionTest"})
	public void createcampaign() throws Throwable
	{
				
	javaUtility jlib=new javaUtility();
	//propertyUtility plib=new propertyUtility();
	ExcelUtility elib=new ExcelUtility();
	WebDriverUtility wlib=new WebDriverUtility();
	
	//String url=plib.getPropertyKeyValue("url");
	//String username=plib.getPropertyKeyValue("username");
	//String pwd=plib.getPropertyKeyValue("pwd");
	
	int ranNum=jlib.getRandomNumber();
	
	String campname=elib.getDataFromExcel("campaign", 2, 0)+ranNum;	
	
	//WebDriver driver=new ChromeDriver();
	//driver.get(url);
	//driver.manage().window().maximize();
	
	wlib.waitForPageToLoad(driver);
	
	
	//login
	//loginpage home=new loginpage(driver);
	//home.login(username, pwd);
	
	
	HomePage home1=new HomePage(driver);
	home1.product();
	
	
    
    WebElement element=driver.findElement(By.xpath("//a[text()='More']"));
   	wlib.mouseOverOnElement(driver, element);
   	home1.campaign();
	
	//driver.findElement(By.name("Campaigns")).click();
   	
   	campaignplusbutton plus=new campaignplusbutton(driver);
   	plus.createcampaignbutton();
   	
	//driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
   	
   	createcampaign create=new createcampaign(driver);
   	create.campaignname(campname);
   	
	//driver.findElement(By.name("campaignname")).sendKeys(campname);
	
   	create.campclick();
   	
	//driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
	
   	
   	validcreatecampaign actual=new validcreatecampaign(driver);
   	String act=actual.createcampvalidation();
   	Assert.assertEquals(act.contains(campname), true);
	
   /* String actual = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
    if(actual.contains(campname))
    {
    	System.out.println("pass");
    }
    else
    {
    	System.out.println("fail");
    }*/
    
    Thread.sleep(3000);
	WebElement element1=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	
	wlib.mouseOverOnElement(driver, element1);
	 home1.signout();
	//driver.findElement(By.linkText("Sign Out")).click();
	
	
	
	
	
	
	}
	/*(@Test(groups={"smokeTest","regressionTest"})
	public void samplecreate()
	{
	System.out.println("welcome");
	}*/
		
		
		
		

}
