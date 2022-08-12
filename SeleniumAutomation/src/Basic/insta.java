package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		
		
		driver.findElement(By.name("username")).sendKeys("stargirl_superstar");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Superstar@123");
		
		//driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[4]")).click();
		
		
		
		

	}

}
