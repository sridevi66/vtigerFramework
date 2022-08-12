package Practice;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import comcast.vtiger.generalutility.WebDriverUtility;

@Test
public class screenshot  {
	
	WebDriver driver=new ChromeDriver();
	
			
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./photo.png");
	//FileUtils.copyFile(src,dest);
	
	
	
}
