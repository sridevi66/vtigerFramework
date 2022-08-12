package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class creatingnewproduct {
	
	public creatingnewproduct(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(name="productname")
	private WebElement product_name;
	
	
    @FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
    private WebElement save_click;
    
    

	/**
	 * @return the product_name
	 */
	public WebElement getsave_click() {
		return save_click;
	}

	@FindBy(name="button")
	private WebElement save_button;


	/**
	 * @return the product_name
	 */
	public WebElement getProduct_name() {
		return product_name;
	}


	/**
	 * @return the save_button
	 */
	public WebElement getSave_button() {
		return save_button;
	}
	
	
	public void createproduct(String productname1)
	{
		 product_name.sendKeys(productname1);
	}
	
	public void save2()
	{
		 save_button.click();
	}

}
