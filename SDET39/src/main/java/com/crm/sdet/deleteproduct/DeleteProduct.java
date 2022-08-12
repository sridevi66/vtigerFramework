package com.crm.sdet.deleteproduct;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DeleteProduct {

	public static void main(String[] args) throws  Throwable {
		// TODO Auto-generated method stub
		
		
		FileInputStream fis=new FileInputStream("./data.properties/");
		Properties p= new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String username=p.getProperty("username");
		String pwd=p.getProperty("pwd");
		
		
		
	
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys(username);
        driver.findElement(By.name("user_password")).sendKeys(pwd);
        driver.findElement(By.id("submitButton")).click();
        driver.findElement(By.linkText("Products")).click();
        driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
        
        Random ran=new Random();
		int ranNum=ran.nextInt(1000);
		FileInputStream fis1=new FileInputStream("./productexcel.xlsx");
		Workbook book= WorkbookFactory.create(fis1);
		Sheet sh=book.getSheet("product");//sheet name
		Row r=sh.getRow(2);
		Cell c=r.getCell(0);
		String proname=c.getStringCellValue()+ranNum;
		System.out.println("product name is"+ proname);
       driver.findElement(By.name("productname")).sendKeys(proname);
       //driver.findElement(By.name("button")).click();
       driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
       
		
		String actualdata=driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
		if(actualdata.contains(proname))
				{
			      System.out.println("pass");
				}
		else
		{
			System.out.println("fail");
			
		}
		driver.findElement(By.xpath("(//input[@title='Delete [Alt+D]'])[1]")).click();
		Alert simpleAlert=driver.switchTo().alert();
		simpleAlert.accept();
		WebElement ele=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	     Actions act=new Actions(driver);
	     act.moveToElement(ele).perform();
	     driver.findElement(By.linkText("Sign Out")).click();

		
		
		
		

	}

}
