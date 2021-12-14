package UIPagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import frameworkP.BaseUtil;

public class FlightConfirmation extends BaseUtil {
	WebDriver driver;

	public FlightConfirmation(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	
	@FindBy(how=How.XPATH,using ="//label/input")
	@CacheLookup
		WebElement logout;
	
	@FindBy(how=How.XPATH,using ="//body/div[2]/div/h1")
	@CacheLookup
		WebElement Thankyou;
	
	
	public void logoutBtn () {
		try {
//			logout.click();
			Thread.sleep(10000);
			String TextCheck = Thankyou.getText();
			Assert.assertEquals(TextCheck, "Thank you for your purchase today!");
			System.out.println("Found string is ----- >>>>>>"+ TextCheck);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
