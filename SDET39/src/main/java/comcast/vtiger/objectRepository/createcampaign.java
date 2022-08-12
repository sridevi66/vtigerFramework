package comcast.vtiger.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createcampaign {
	
	
	public createcampaign(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(name="campaignname")
	private WebElement campaign_name;
	
	@FindBy(name="productname")
	private WebElement product_name;
	
	
	/**
	 * @return the product_name
	 */
	public WebElement getProduct_name() {
		return product_name;
	}



	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement save_button_campaign; 
	
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement product_plus_button;
	
	/**
	 * @return the product_plus_button
	 */
	public WebElement getProduct_plus_button() {
		return product_plus_button;
	}

	

	public void campaignname(String campaignname_text)
	
	{
	  campaign_name.sendKeys(campaignname_text);
	  
	}
	  public void productname(String productname_text)
{
	  product_name.sendKeys(productname_text);
	}
	
	  
	  public void campclick()
	  {
	  save_button_campaign.click();
	  }
	  
	  public void productplusbuttonclick()
	  {
	  product_plus_button.click();
	  }
	
		

}
