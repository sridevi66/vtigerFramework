package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createorg {
	
	public createorg (WebDriver driver)
	{
		
		
			PageFactory.initElements(driver,this);
			
		}
		
		
		@FindBy(name="accountname")
		private WebElement oranization_name;
		
		
		@FindBy(xpath="(//input[@class='crmbutton small save'])[1]")
		private WebElement save;

		/**
		 * @return the oranizationName
		 */
		public WebElement getOranizationName() {
			return oranization_name;
		}
		

		/**
		 * @return the save
		 */
		public WebElement getSave() {
			return save;
		}


		
		
		public void orgname(String orgname)
		{
			oranization_name.sendKeys(orgname);
			
		}
		
		
		public void saveorg()
		{
			save.click();
			 
		}


		

	}



