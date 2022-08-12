package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class loginToVtiger {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("./data.properties");
        p.load(fis);
        String url=p.getProperty("url");
        String user=p.getProperty("username");
        String pass=p.getProperty("pwd");
        
        WebDriver driver=new ChromeDriver();
        driver.get(url);
       
        
        
        driver.findElement(By.name("user_name")).sendKeys(user);
        driver.findElement(By.name("user_password")).sendKeys(pass);
        driver.findElement(By.id("submitButton")).click();
        
        
        
   	}

}
