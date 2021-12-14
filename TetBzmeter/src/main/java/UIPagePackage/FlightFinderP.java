package UIPagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import frameworkP.BaseUtil;

public class FlightFinderP extends BaseUtil {
	
	WebDriver driver;

	public FlightFinderP(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	@FindBy(how=How.NAME,using ="fromPort")
	@CacheLookup
		WebElement OriginElement;
	
	
	@FindBy(how=How.NAME,using ="toPort")
	@CacheLookup
		WebElement DeptElement;
	
	@FindBy(how=How.XPATH,using ="//div/input[@type='submit']")
	@CacheLookup
		WebElement clickElementSelenium;

	
	public void findFlights (String Origin, String Depture) {
		
		try {
			Object originselected = selectElementByText(OriginElement,Origin);
			Thread.sleep(2000);
			Object deptselected = selectElementByText(DeptElement, Depture);
			Thread.sleep(9000);
			System.out.println("----->>>>>selected ");
			submit(clickElementSelenium);
//			jsClick(clickElementSelenium);
//			clickElementSelenium(clickElementSelenium);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
		
	}

