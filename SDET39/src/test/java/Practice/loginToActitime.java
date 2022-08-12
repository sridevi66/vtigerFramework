package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginToActitime {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("./actiTime.properties");
		p.load(fis);
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pwd = p.getProperty("pwd");
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		System.out.println(url);
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		if(actualtitle.equals("actiTIME - Login"))
				{
			      System.out.println("pass:");
				}
		else
			System.out.println("Fail");
		
		
		
		
		

	}

}
