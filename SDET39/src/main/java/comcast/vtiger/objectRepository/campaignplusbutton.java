package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class campaignplusbutton {
	public  campaignplusbutton(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//img[@title='Create Campaign...']")
	private WebElement plus_button;

	/**
	 * @return the plus_button
	 */
	public WebElement getPlus_button() {
		return plus_button;
	}
	
	public void createcampaignbutton()
	{
		plus_button.click();
		
	}
	
	
	

}
