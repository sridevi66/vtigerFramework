package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	//initialization
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//declaration
	@FindBy(name="user_name")
	private WebElement username_textfield;
	
	@FindBy(name="user_password")
	private WebElement password_textfield;
	
	@FindBy(id="submitButton")
	
	private WebElement login_button;

	/**
	 * @return the username_textfield
	 */
	public WebElement getUsername_textfield() {
		return username_textfield;
	}

	/**
	 * @return the password_textfield
	 */
	public WebElement getPassword_textfield() {
		return password_textfield;
	}

	/**
	 * @return the login_button
	 */
	public WebElement getLogin_button() {
		return login_button;
	}
	
	
	
	public void login(String username,String password)
	{
		username_textfield.sendKeys(username);
		password_textfield.sendKeys(password);
		login_button.click();
	}

}
