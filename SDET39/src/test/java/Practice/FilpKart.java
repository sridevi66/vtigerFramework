package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpKart {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("./filpkart.properties");
	    
p.load(fis);
     String url = p.getProperty("url");
    String un = p.getProperty("username");
     String pwd = p.getProperty("pwd");
     
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get(url);
     driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(un);
     driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
     driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();     
     


	}

}
