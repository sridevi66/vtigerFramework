package Practice;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import comcast.vtiger.generalutility.WebDriverUtility;
import comcast.vtiger.generalutility.javaUtility;
import comcast.vtiger.generalutility.propertyUtility;

public class makemytrip {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		propertyUtility plib=new propertyUtility();
		
		
		
		
//		//String url=plib.getPropertyKeyValue("url");
	//	String username=plib.getPropertyKeyValue("username");
		//String pwd=plib.getPropertyKeyValue("pwd");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com");
				
		WebDriverUtility wlib=new WebDriverUtility();
		
		wlib.waitForPageToLoad(driver);
		
		driver.manage().window().maximize();
		
		
		
		//driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		
		//driver.findElement(By.xpath("(//p[text()='Chennai, India'])[1]")).click();
		
	      
		WebElement src = driver.findElement(By.xpath("//input[@id='fromCity']"));
		
		WebElement des=driver.findElement(By.xpath("//input[@id='toCity']"));
		
		src.sendKeys("Chennai");
		
		driver.findElement(By.xpath("//p[text()='Chennai, India'])")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='toCity']")).click();
			
		des.sendKeys("Tanzania");
		
		driver.findElement(By.xpath("//p[text()='Dar Es Salaam, Tanzania']")).click();
		
		//Thread.sleep(3000);
		
		//navigate to departure
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		
		//driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]")).click();
		
		String requiredmonth="October";
		String requiredyear="2022";
		String requireddate="14";
		String currentmonth=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]")).getText();
		
		String currentmonthsplit=currentmonth.split(" ")[0];
		
		String currentyearsplit=currentmonth.split(" ")[1];
		
		
		
		while(!(currentmonthsplit.equalsIgnoreCase(requiredmonth) && currentyearsplit.equals(requiredyear)))
			
           {
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			currentmonth=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]")).getText();
			currentmonthsplit=currentmonth.split(" ")[0];
			currentyearsplit=currentmonth.split(" ")[1];
	        
            }
		
		driver.findElement(By.xpath("(//p(text()='"+requireddate+"'])[1]")).click();
	    
		
		
		
		
		
		
		
		
		
		
	}

}
