package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deleteproduct {
	
	public deleteproduct(WebDriver driver){
		PageFactory.initElements(driver,this);
		
		
	}

	@FindBy(xpath="(//input[@title='Delete [Alt+D]'])[1]")
	private WebElement delete_button;

	/**
	 * @return the delete_button
	 */
	public WebElement getDelete_button() {
		return delete_button;
	}
	
	
	public void deletebutton()
	{
		delete_button.click();
		
	}
	
	
		
}
