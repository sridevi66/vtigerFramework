package comcast.vtiger.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organization {
	
	public organization (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement click_plus_button;

	/**
	 * @return the click_plus_button
	 */
	public WebElement getClick_plus_button() {
		return click_plus_button;
	}

	public void org()
	{
		click_plus_button.click();
	}

}
