package com.crm.sdet.campaign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

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
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

import comcast.vtiger.generalutility.Baseclass;
import comcast.vtiger.generalutility.ExcelUtility;
import comcast.vtiger.generalutility.WebDriverUtility;
import comcast.vtiger.generalutility.javaUtility;
import comcast.vtiger.generalutility.propertyUtility;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.campaignplusbutton;
import comcast.vtiger.objectRepository.childwindowinnewcampaign;
import comcast.vtiger.objectRepository.createcampaign;
import comcast.vtiger.objectRepository.creatingnewproduct;
import comcast.vtiger.objectRepository.loginpage;
import comcast.vtiger.objectRepository.organizationValidation;
import comcast.vtiger.objectRepository.productsplusbutton;
import comcast.vtiger.objectRepository.validationcreatecampaignwithproduct;

public class CreateCampaignWithProductNameTest extends Baseclass{
	
	
	@Test(groups= {"smokeTest","regressionTest"})
	public void createcampaignwithproductname() throws Throwable
	{

		 
		//propertyUtility plib=new propertyUtility();
		javaUtility jlib=new javaUtility();
		ExcelUtility elib=new ExcelUtility();
		WebDriverUtility wlib=new WebDriverUtility();
		
		
		//String url=plib.getPropertyKeyValue("url");
		//String username=plib.getPropertyKeyValue("username");
		//String pwd=plib.getPropertyKeyValue("pwd");

		
		
		//WebDriver driver=new ChromeDriver();
	   	//driver.get(url);
	
		
		///implementation
		
		//loginpage log=new loginpage(driver);
	    //log.login(username,pwd);
	    
		wlib.waitForPageToLoad(driver);
		driver.manage().window().maximize();
		

		HomePage home1=new HomePage(driver);
		home1.product();
		
		
		productsplusbutton plus=new productsplusbutton(driver);
		plus.plusbutton();
				
		
	   
		
        int ranNum=jlib.getRandomNumber();
        
        String proname= elib.getDataFromExcel("product", 1, 0)+ranNum;
        
        
		
		System.out.println("product name is"+ proname);
		
		////product name
		
		creatingnewproduct create1=new creatingnewproduct(driver);
		
		create1.createproduct(proname);
		
		
				
		//driver.findElement(By.name("productname")).sendKeys(proname);
		
		create1.save2();
		
		//driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		
		///more 
		
		WebElement element=driver.findElement(By.linkText("More"));
		wlib.mouseOverOnElement(driver, element);
		
		home1.campaign();
		
		
		//driver.findElement(By.name("Campaigns")).click();
		
		
		campaignplusbutton plus1=new campaignplusbutton(driver);
	   	plus1.createcampaignbutton();
	   	
	   	
		//driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
	   	
		driver.findElement(By.xpath("//img[@title='Select']")).click();//plus button productbutton
		
		
		
		int ranNum1=jlib.getRandomNumber();
        String campaignname= elib.getDataFromExcel("campaign", 1, 0)+ranNum;
		
		
        
		System.out.println("campaign name is"+campaignname );
		createcampaign create=new createcampaign(driver);
	   	create.campaignname(campaignname);
		
		//driver.findElement(By.name("campaignname")).sendKeys(campaignname);
	   	
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		
		
		//Thread.sleep(3000);
		
		
		wlib.switchToWindow(driver,"Products&action");
		
		///creating plus button in campaign page
		childwindowinnewcampaign child=new childwindowinnewcampaign(driver);
		
		
		child.searchtext(proname);
			
		child.searchnow();
		
	    //Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='"+proname+"']")).click();
		//Thread.sleep(5000);
		
		
		//driver.findElement(By.xpath("//a[@href='javascript:window.close();']")).click();
		
		
		//Thread.sleep(3000);
		
		wlib.switchToWindow(driver,"Campaigns&action");
		
		
	    
		create1.save2();
		
		
		validationcreatecampaignwithproduct organization=new validationcreatecampaignwithproduct(driver);
		   String actualData=organization.campaignproduct();
		   Assert.assertEquals(actualData.contains(campaignname),true);
		   
		
		/*String actData=driver.findElement((By.xpath("//span[contains(@class,'dvHeaderText')]"))).getText();
		
		if(actData.contains(campaignname))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}*/
		
	     WebElement element1=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	     
	    // Actions act1=new Actions(driver);
	     //act1.moveToElement(element1).perform();
	     
	     wlib.mouseOverOnElement(driver, element1);
	     
	     home1.signout();
	     
	     //driver.findElement(By.linkText("Sign Out")).click();
		
		
	     //driver.close();
	
		
	
	}

	}
		
		
	
		
		
	
				
		
		
	


