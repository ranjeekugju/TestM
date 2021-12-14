package UIPagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import frameworkP.BaseUtil;

public class PurchaseFlightWithDetails extends BaseUtil {
	WebDriver driver;
	public PurchaseFlightWithDetails(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	@FindBy(how=How.NAME,using ="inputName")
	@CacheLookup
		WebElement Name;
	
	@FindBy(how=How.NAME,using ="address")
	@CacheLookup
		WebElement address;
	
	@FindBy(how=How.NAME,using ="city")
	@CacheLookup
		WebElement city;
	
	@FindBy(how=How.NAME,using ="state")
	@CacheLookup
		WebElement state;
	
	@FindBy(how=How.NAME,using ="zipCode")
	@CacheLookup
		WebElement zipCode;
	
	@FindBy(how=How.NAME,using ="cardType")
	@CacheLookup
		WebElement cardType;
	
	@FindBy(how=How.NAME,using ="creditCardNumber")
	@CacheLookup
		WebElement creditCardNumber;
	
	@FindBy(how=How.NAME,using ="creditCardMonth")
	@CacheLookup
		WebElement creditCardMonth;
	
	@FindBy(how=How.NAME,using ="creditCardYear")
	@CacheLookup
		WebElement creditCardYear;

	@FindBy(how=How.NAME,using ="nameOnCard")
	@CacheLookup
		WebElement nameOnCard;

	@FindBy(how=How.XPATH,using ="//label/input")
	@CacheLookup
		WebElement purchaseFlight;
	
	public void fillDetails (String name, String Add, String City, String State, String Zip, String CardType, String CCNumber, String Month, String Year, String NameCard) 
	{
		try {
			enterText(Name, name);
			
			enterText(address, Add);
			
			enterText(city, City);
			
			enterText(state, State);
			
			enterText(zipCode, Zip);
			
			selectElementByText(cardType, CardType);
			
			enterText(creditCardNumber, CCNumber);
			
			enterText(creditCardMonth, Month);
			
			enterText(creditCardYear, Year);
			
			enterText(nameOnCard, NameCard);
			
			submit(purchaseFlight);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
