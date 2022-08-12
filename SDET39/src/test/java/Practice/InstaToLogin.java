package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaToLogin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*Properties p = new Properties();
		FileInputStream fis=new FileInputStream("./Insta.properties");
		p.load(fis);
		String url = p.getProperty("url");
		String user = p.getProperty("username");
		String pwd = p.getProperty("pwd");*/
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		
		
		driver.findElement(By.name("username")).sendKeys("stargirl_superstar");
		driver.findElement(By.name("password")).sendKeys("Superstar@123");
		driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[4]")).click();
		
		
		
		
		

	}

}
