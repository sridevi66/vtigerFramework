package comcast.vtiger.generalutility;

//import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	
	/**
	 * @author sridevi
	 */
	
	/**
	 * wait for
	 * @param driver
	 */
	public void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	
	
	
	public void scriptTimeOut(WebDriver driver)
	{
		driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
		
		
		
	}
	
	public void waitForElementToBeClickable(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	////public void waitForElementWithCustomTimeOut(WebDriver driver,WebElement element,int pollingTime)
	//{
		//FluentWait wait=new FluentWait(driver);
		
		//wait.pollingEvery(duration.);
		//wait.until(ExpectedConditions.(element));
		
	//}//
	
	
	/*
	 * used to switch to any window based on window title
	 * @param driver
	 * @param PartialWindowTitle
	 * @author sridevi
	 */
	
	public void switchToWindow(WebDriver driver,String partialWindowTitle)
	{
		Set<String> st1=driver.getWindowHandles();
		Iterator<String> a1=st1.iterator();
		while(a1.hasNext())
		{
			String wid1=a1.next();
			driver.switchTo().window(wid1);
			
		
		if(driver.getTitle().contains(partialWindowTitle))
		{
			
			break;
		}
	}	
	
	}
	
	

	
		
	public void switchToAlertandAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void switchToAlertandDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public void switchToFrame(WebDriver driver,int index)
	
	{
		driver.switchTo().frame(index);
	}
	public void switchToFrame(WebDriver driver,String id_name_Attribute)
	
	{
	  driver.switchTo().frame(id_name_Attribute);
	}
	
	public void select(WebElement element,String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void mouseOverOnElement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	

public void moveByOffset(WebDriver driver,int xoffset,int yoffset)
{
	
   	Actions act=new Actions(driver);
   	act.moveByOffset(xoffset, yoffset);
}
	
}
	

