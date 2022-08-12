package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class validateDelete {
	//initialization
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement campaign_delete;
	
	//Declaration
	
	public validateDelete(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	
	public String delete_validate()
	{
		return campaign_delete.getText();
	}
	

}
