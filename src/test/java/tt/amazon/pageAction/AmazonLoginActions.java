package tt.amazon.pageAction;

import org.openqa.selenium.support.PageFactory;

import tt.amazon.pageElements.AmazonLoginLocators;
import tt.utilities.SetupDriver;


public class AmazonLoginActions {
	AmazonLoginLocators AmazonLoginLocatorsObj;
	

	public AmazonLoginActions (){
	
		AmazonLoginLocatorsObj= new AmazonLoginLocators();
		PageFactory.initElements(SetupDriver.driver, AmazonLoginLocatorsObj);	
		
	}
	
	public void loadAmazonHomePage(){
		SetupDriver.driver.get("https://www.amazon.com/");
	}
}

	
