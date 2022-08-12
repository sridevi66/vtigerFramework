package com.crm.sdet.organization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import comcast.vtiger.generalutility.Baseclass;
import comcast.vtiger.generalutility.ExcelUtility;
import comcast.vtiger.generalutility.WebDriverUtility;
import comcast.vtiger.generalutility.javaUtility;
import comcast.vtiger.generalutility.propertyUtility;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.createorg;
import comcast.vtiger.objectRepository.loginpage;
import comcast.vtiger.objectRepository.organization;
import comcast.vtiger.objectRepository.organizationValidation;


@Listeners(comcast.vtiger.generalutility.ListenerImplementationClass.class)
public class createOrganizationTest extends Baseclass {
	
@Test(retryAnalyzer=comcast.vtiger.generalutility.ReTryImpClass.class)
	//@Test(groups= {"smokeTest","regressionTest"})
	
	public void createorganization() throws Throwable
	{
	
		//java utility
		//propertyUtility plib=new propertyUtility();
		//random number java utility
		javaUtility jlib=new javaUtility();
		ExcelUtility elib=new ExcelUtility();
		WebDriverUtility wlib=new WebDriverUtility();
	
		//fetching from excel
		int ranNum=jlib.getRandomNumber();
		String orgname=elib.getDataFromExcel("organization", 1, 0)+ranNum;
		System.out.println(orgname);
		
		
		
		////webdriver 
		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//webdriver loading driver
		wlib.waitForPageToLoad(driver);
		
		//String url=plib.getPropertyKeyValue("url");
		//String username=plib.getPropertyKeyValue("username");
		//String pwd=plib.getPropertyKeyValue("pwd");
		//driver.get(url);
		
		//loginrepository
		
		//loginpage log=new loginpage(driver);
	    //log.login(username,pwd);
	   
	    
		
		

	    //clicking organizationlink
		
	    HomePage home=new HomePage(driver);
	    home.org1();
		
		
	    //create organizationplusbutton
	    
	    organization organize=new  organization(driver);
	    organize.org();
	    
	    //passing organization name
	   createorg orgs=new createorg(driver);
	   orgs.orgname(orgname);
	 	 
	//driver.findElement(By.xpath("(//input[@class='crmbutton small save'])[1]")).click();
	   
	   
	   ///save button
	   
	   orgs.saveorg();
	   organizationValidation organization=new organizationValidation(driver);
	   String actualData=organization.organizationName();
	   Assert.assertEquals(actualData.contains(orgname),true);
	   
		
		/*String actualdata=driver.findElement(By.id("dtlview_Organization Name")).getText();
		
		System.out.println("actual data is"+actualdata);
		if(actualdata.contains(orgname))
		{
			System.out.println("pass");
		}
		else
		{
		System.out.println("Fail");
			
			
		}*/
		Thread.sleep(3000);
     WebElement ele=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
     //Actions act=new Actions(driver);
     //act.moveToElement(ele).perform();
     
     wlib.mouseOverOnElement(driver, ele);
     home.signout();
     
    // driver.findElement(By.linkText("Sign Out")).click();
     //driver.close();;
     
     
	}

}
