package Practice;

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

import com.mysql.jdbc.Driver;

import comcast.vtiger.generalutility.ExcelUtility;
import comcast.vtiger.generalutility.WebDriverUtility;
import comcast.vtiger.generalutility.javaUtility;
import comcast.vtiger.generalutility.propertyUtility;

public class CreateCampaignWithProductName {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		 
		propertyUtility plib=new propertyUtility();
		javaUtility jlib=new javaUtility();
		ExcelUtility elib=new ExcelUtility();
		WebDriverUtility wlib=new WebDriverUtility();
		
		
		
		/*FileInputStream fis=new FileInputStream("./data.properties/");
		Properties p= new Properties();
		p.load(fis);*/
		
		String url=plib.getPropertyKeyValue("url");
		String username=plib.getPropertyKeyValue("username");
		String pwd=plib.getPropertyKeyValue("pwd");
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys(username);
        driver.findElement(By.name("user_password")).sendKeys(pwd);
        driver.findElement(By.id("submitButton")).click();
        
        driver.findElement(By.xpath("(//a[text()='Products'])[1]")).click();
        driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
        
        //Random ran=new Random();
		//int ranNum=ran.nextInt(1000);
        
        int ranNum=jlib.getRandomNumber();
        String proname= elib.getDataFromExcel("product", 1, 0)+ranNum;
        
        
		/*FileInputStream fis1=new FileInputStream("./productexcel.xlsx");
		Workbook book= WorkbookFactory.create(fis1);
		Sheet sh=book.getSheet("product");//sheet name
		Row r=sh.getRow(1);
		Cell c=r.getCell(0);
		String proname=c.getStringCellValue()+ranNum;*/
        
		System.out.println("product name is"+ proname);
		
		////product name
		driver.findElement(By.name("productname")).sendKeys(proname);
		
		
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		
		///more 
		
		WebElement element=driver.findElement(By.linkText("More"));
		Actions act=new Actions(driver);
		act.moveToElement(element).click().perform();
		driver.findElement(By.name("Campaigns")).click();
		driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		
		
		//Random ran1=new Random();
		//int ranNum1=ran.nextInt(1000);
		int ranNum1=jlib.getRandomNumber();
        String campaignname= elib.getDataFromExcel("Sheet1", 1, 0)+ranNum;
		
		/*FileInputStream fis2=new FileInputStream("./campaign.xlsx");
		Workbook book1= WorkbookFactory.create(fis2);
		Sheet sh1=book.getSheet("Sheet1");//sheet name
		Row r1=sh.getRow(1);
		Cell c1=r.getCell(0);
		String campaignname=c.getStringCellValue()+ranNum1;*/
        
		System.out.println("campaign name is"+campaignname );
		driver.findElement(By.name("campaignname")).sendKeys(campaignname);
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		
		
		Thread.sleep(3000);
		
		
		wlib.switchToWindow(driver,"Products&action");
		
		/*Set<String> allId1=driver.getWindowHandles();
		Iterator<String> it1=allId1.iterator();
		while(it1.hasNext())
		{
			String wid1=it1.next();
			driver.switchTo().window(wid1);
			if(driver.getTitle().contains("Products&action"))
					{
				      break;
					}
		}*/
		driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys(proname);
		driver.findElement(By.name("search")).click();
		
		//value of selected link text
		driver.findElement(By.xpath("//a[text()='"+proname+"']")).click();
		
		wlib.switchToWindow(driver,"Campaigns&action");
		
		/*Set<String> st1=driver.getWindowHandles();
		Iterator<String> a1=st1.iterator();
		while(a1.hasNext())
		{
			String wid1=a1.next();
			driver.switchTo().window(wid1);
			
		
		if(driver.getTitle().contains("Campaigns&action"))
		{
			
			break;
		}
	}	*/
	
driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		
		
		String actData=driver.findElement((By.xpath("//span[contains(@class,'dvHeaderText')]"))).getText();
		if(actData.contains(campaignname))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		Thread.sleep(3000);
	     WebElement element1=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	     Actions act1=new Actions(driver);
	     act1.moveToElement(element1).perform();
	     driver.findElement(By.linkText("Sign Out")).click();
		
		
	driver.close();
	
		
		
	/*	driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		
		
		String actData=driver.findElement((By.xpath("//span[contains(@class,'dvHeaderText')]"))).getText();
		if(actData.contains(campaignname))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}*/
		
		///sign out
		
		
	}

	}
		
		
	
		
		
	
				
		
		
	


