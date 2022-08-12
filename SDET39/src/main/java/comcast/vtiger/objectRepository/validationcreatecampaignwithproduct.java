package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class validationcreatecampaignwithproduct {
		
		//initialization
		@FindBy(xpath="//span[contains(@class,'dvHeaderText')]")
		private WebElement campaign_product;
		
		
		//declaration
		
		public validationcreatecampaignwithproduct(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}


		
		
		/**
		 * @return the campaign_product
		 */
		public WebElement getCampaign_product() {
			return campaign_product;
		}




		//
		//utilization
		 public String campaignproduct()
		 {
		return campaign_product.getText() ; 

		 }
	}



