package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class validcreatecampaign {
//Initialization
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement create_campaign;
	
	
	//Declaration
	public validcreatecampaign(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	/**
	 * @return the create_campaign
	 */
	public WebElement getCreate_campaign() {
		return create_campaign;
	}
	
	
	public String createcampvalidation()
	{
		return create_campaign.getText();
	}
}
