package comcast.vtiger.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class childwindowinnewcampaign {
	
	public  childwindowinnewcampaign(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement search_product_textbox;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchnow_button;
	
	//@FindBy(xpath="//a[@href='javascript:window.close();']")
	//private WebElement product_link;
	
	/**
	 * @return the search_product_textbox
	 */
	public WebElement getSearch_product_textbox() {
		return search_product_textbox;
	}

	/**
	 * @return the searchnow_button
	 */
	//public WebElement getSearchnow_button() {
		//return searchnow_button;
	//}

	/**
	 * @return the product_link
	 */
	//public WebElement getProduct_link() {
		//return product_link;
	//}
	
	

	//@FindBy(xpath="//a[text()='"+proname+"']")
	//private WebElement product_link;
	

	public void searchtext(String search_product)
	{
		search_product_textbox.sendKeys(search_product);
		
	}
	public void searchnow()
	{
		searchnow_button.click();
		
	}
	
}
