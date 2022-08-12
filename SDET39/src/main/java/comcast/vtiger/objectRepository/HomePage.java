package comcast.vtiger.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//initialization
	public  HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	//declaration
	
	@FindBy(linkText="Organizations")
	private WebElement organization_link;
	
	@FindBy(linkText="Products")
	private WebElement product_link;
	
	
	/**
	 * @return the organization_link
	 */
	public WebElement getOrganization_link() {
		return organization_link;
	}
	/**
	 * @return the product_link
	 */
	public WebElement getProduct_link() {
		return product_link;
	}
	/**
	 * @return the more_link
	 */
	public WebElement getMore_link() {
		return more_link;
	}
	/**
	 * @return the campaigns_link
	 */
	public WebElement getCampaigns_link() {
		return campaigns_link;
	}
	/**
	 * @return the signout_link
	 */
	public WebElement getSignout_link() {
		return signout_link;
	}

	@FindBy(linkText="More")
	private WebElement more_link;
	
	
	@FindBy(name="Campaigns")
    private WebElement campaigns_link;
	
	
	@FindBy(linkText="Sign Out")
	private WebElement signout_link;
	
	
	public void org1()
	{
		 organization_link.click();
	}
	
	public void more()
	{
		 more_link.click();
	}
	
	public void campaign()
	{
		
		 campaigns_link.click();
	}
	public void product()
	{
		 product_link.click();
	}
	public void signout()
	{
		 signout_link.click();
	}	
	}
	
	
	   

	


