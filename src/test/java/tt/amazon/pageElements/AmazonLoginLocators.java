package tt.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonLoginLocators {
	
	@FindBy(xpath= "//*[@id='nav-link-accountList']/span")
	public WebElement acntSignIn;
	
	@FindBy(xpath= "//*[@id='ap_email']")
	public WebElement emailBx;
	
	@FindBy(xpath= "//*[@id='signInSubmit']")
	public WebElement signInBtn;

}
