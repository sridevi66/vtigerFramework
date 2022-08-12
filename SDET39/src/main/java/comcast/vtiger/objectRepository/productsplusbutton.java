package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsplusbutton {
	public  productsplusbutton(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement plus_button_create;

	/**
	 * @return the plus_button_create
	 */
	public WebElement getPlus_button_create() {
		return plus_button_create;
	}
	
	
	public void plusbutton()
	{
		plus_button_create.click();
	}

}
