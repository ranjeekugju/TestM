package UIPagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import frameworkP.BaseUtil;

public class SelectFlightPage extends BaseUtil {
	WebDriver driver;
	
	public SelectFlightPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	
	@FindBy(how=How.XPATH,using ="/html/body/div[2]/table/tbody/tr[1]/td[1]/input")
	@CacheLookup
		WebElement chooseFlight;
	
//	@FindBy(how=How.XPATH,using ="//td[text()='43']//preceding-sibling::td/input")
//	@CacheLookup
//		WebElement chooseFlight;
	
	public void ChooseFlight(WebDriver driver) {
		try {
			
			System.out.println("inside choose flight");
			Thread.sleep(15000);
			WebElement wd = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input"));
//			System.out.println("after driver "+ wd);
			wd.click();
		

		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
