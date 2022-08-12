package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organizationValidation {
	
	//initialization
	@FindBy(id="dtlview_Organization Name")
	private WebElement orgname;
	
	
	//declaration
	
	public organizationValidation(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	/**
	 * @return the orgname
	 */
	public WebElement getOrgname() {
		return orgname;
	}
	
	//
	//utilization
	 public String organizationName()
	 {
	return orgname.getText() ; 

	 }
}
