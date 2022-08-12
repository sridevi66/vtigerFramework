package com.crm.sdet.product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

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
import org.testng.annotations.Test;

import comcast.vtiger.generalutility.Baseclass;
import comcast.vtiger.generalutility.ExcelUtility;
import comcast.vtiger.generalutility.WebDriverUtility;
import comcast.vtiger.generalutility.javaUtility;
import comcast.vtiger.generalutility.propertyUtility;
import comcast.vtiger.objectRepository.HomePage;
import comcast.vtiger.objectRepository.creatingnewproduct;
import comcast.vtiger.objectRepository.loginpage;
import comcast.vtiger.objectRepository.productsplusbutton;

public class createproductTest extends Baseclass {

	
	
	
	@Test(groups= {"smokeTest","regressionTest"})
	
	public void createproduct() throws Throwable {
                  
		//propertyUtility plib=new propertyUtility();
		javaUtility jlib=new javaUtility();
		WebDriverUtility wlib=new WebDriverUtility();
		ExcelUtility elib=new ExcelUtility();
			
		/*String url=plib.getPropertyKeyValue("url");
		String username=plib.getPropertyKeyValue("username");
		String pwd=plib.getPropertyKeyValue("pwd");*/
		
		int RanNum=jlib.getRandomNumber();
		String proname = elib.getDataFromExcel("product",1,1)+ RanNum;
		System.out.println("product name is"+ proname);
		
		
		
		//WebDriver driver=new ChromeDriver();
		//driver.get(url);
		//driver.manage().window().maximize();
		wlib.waitForPageToLoad(driver);
		
		//loginpage home=new loginpage(driver);
		//home.login(username, pwd);
		
		
		//driver.findElement(By.name("user_name")).sendKeys(username);
        //driver.findElement(By.name("user_password")).sendKeys(pwd);
        //driver.findElement(By.id("submitButton")).click();
        
		HomePage home1=new HomePage(driver);
		home1.product();
		
	    
		//driver.findElement(By.linkText("Products")).click();
		
		productsplusbutton button=new productsplusbutton(driver);
		button.plusbutton();
		//driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		
		//creating product
		
		creatingnewproduct prod=new creatingnewproduct(driver);
		
   		prod.createproduct(proname);
   		
		//driver.findElement(By.name("productname")).sendKeys(proname);
   		
   		prod.save2();
   		
		//driver.findElement(By.name("button")).click();
		
		
		////mousehover
		
		
		
		
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
		
		
		home1.signout();
		//driver.findElement(By.linkText("Sign Out")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	//@Test
	//public void createsample()
	//{
		//System.out.println("sample product");
	//}
	

}
