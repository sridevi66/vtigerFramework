package com.crm.sdet.deleteproduct;

import org.openqa.selenium.Alert;
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
import comcast.vtiger.objectRepository.creatingnewproduct;
import comcast.vtiger.objectRepository.deleteproduct;
import comcast.vtiger.objectRepository.loginpage;
import comcast.vtiger.objectRepository.productsplusbutton;
import comcast.vtiger.objectRepository.validateDelete;

public class deletionTest extends Baseclass {
    
	@Test(groups= {"smokeTest","regressionTest"})
	public void delete() throws Throwable
	{
		
		//propertyUtility plib=new propertyUtility();
	    javaUtility jlib=new javaUtility();
	    ExcelUtility elib=new ExcelUtility();
	    WebDriverUtility wlib=new WebDriverUtility();
	    
	    //WebDriver driver=new ChromeDriver();
	    //driver.manage().window().maximize();
		wlib.waitForPageToLoad(driver);
	    
		//String url=plib.getPropertyKeyValue("url");
		//String username=plib.getPropertyKeyValue("username");
		//String pwd=plib.getPropertyKeyValue("pwd");
		
		//driver.get(url);
		//loginpage
				//loginpage home=new loginpage(driver);
				//home.login(username, pwd);
				
				
				
				//driver.findElement(By.name("user_name")).sendKeys(username);
		        //driver.findElement(By.name("user_password")).sendKeys(pwd);
		        //driver.findElement(By.id("submitButton")).click();
				
				HomePage home1=new HomePage(driver);
				home1.product();
				
				
				productsplusbutton button=new productsplusbutton(driver);
				button.plusbutton();
				
		       		        
		        
		        int ranNum=jlib.getRandomNumber();
		        
		        String proname=elib.getDataFromExcel("product",1,1)+ranNum;
		   		System.out.println("product name is"+ proname);
		   		
		   		
		   		creatingnewproduct prod=new creatingnewproduct(driver);
		   		prod.createproduct(proname);
		   		
		       //driver.findElement(By.name("productname")).sendKeys(proname);
		       //driver.findElement(By.name("button")).click();
		   		
		   		prod.save2();
		   		
		   		validateDelete delete=new validateDelete(driver);
		   		String actual=delete.delete_validate();
		   		Assert.assertEquals(actual.contains(proname), true);
		   		
		   		
		   		
		       //driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
		       
				
				/*String actualdata=driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
				if(actualdata.contains(proname))
						{
					      System.out.println("pass");
						}
				else
				{
					System.out.println("fail");
					
				}*/
				//Thread.sleep(3000);
				
				
				deleteproduct del=new deleteproduct(driver);
				del.deletebutton();
				
				//driver.findElement(By.xpath("(//input[@title='Delete [Alt+D]'])[1]")).click();
				
				Alert simpleAlert=driver.switchTo().alert();
				simpleAlert.accept();
				
				WebElement ele=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			     Actions act=new Actions(driver);
			     act.moveToElement(ele).perform();
			     
			     home1.signout();
			     
			     //driver.findElement(By.linkText("Sign Out")).click();

				
				
				
				

			}

	}


