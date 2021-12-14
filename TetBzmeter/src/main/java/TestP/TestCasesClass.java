package TestP;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import UIPagePackage.FlightConfirmation;
import UIPagePackage.FlightFinderP;
import UIPagePackage.PurchaseFlightWithDetails;
import UIPagePackage.SelectFlightPage;
import frameworkP.BaseUtil;
import frameworkP.BrowserCreation;
import frameworkP.ScreenshotCapture;

public class TestCasesClass extends HelperClass {

	public TestCasesClass() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Test(priority= 1)
	public void positiveBooking() {
		try {
			System.out.println("Inside Positive Test");
			driver.get("http://blazedemo.com");
			
			FlightFinderP flightFinderpage = PageFactory.initElements(driver, FlightFinderP.class);
			flightFinderpage.findFlights("Boston", "London");
			
			Thread.sleep(5000);
			SelectFlightPage selectFlightpage = PageFactory.initElements(driver, SelectFlightPage.class);
			selectFlightpage.ChooseFlight(driver);
			
			Thread.sleep(5000);
			
			PurchaseFlightWithDetails purchaseFlight = PageFactory.initElements(driver, PurchaseFlightWithDetails.class);
			purchaseFlight.fillDetails("Jim", "123DowningStreet", "Bangalore", "Karnataka", "560034", "Visa", "1425", "10", "2021", "Jim K");
			
			Thread.sleep(5000);
			
			FlightConfirmation flightConfirm = PageFactory.initElements(driver, FlightConfirmation.class);
			String bookingFlightDetails = System.getProperty("user.dir")+"\\"+"Screenshots\\"+"Test1"+".png";
			ScreenshotCapture.takeScreenshot(driver, bookingFlightDetails);
			flightConfirm.logoutBtn();
			
			System.out.println("Finishd Positive---->>>>");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test (priority=2)
	public void negativeOne() {
		try {
			System.out.println("Inside Negative Test One");
			driver.get("http://blazedemo.com");
			
			FlightFinderP flightFinderpage = PageFactory.initElements(driver, FlightFinderP.class);
			flightFinderpage.findFlights("Paris", "Dublin");
			
			Thread.sleep(5000);
			SelectFlightPage selectFlightpage = PageFactory.initElements(driver, SelectFlightPage.class);
			selectFlightpage.ChooseFlight(driver);
			
			Thread.sleep(5000);
			
			PurchaseFlightWithDetails purchaseFlight = PageFactory.initElements(driver, PurchaseFlightWithDetails.class);
			purchaseFlight.fillDetails("Jim", "", "Bangalore", "Karnataka", "560034", "Visa", "1425", "10", "2021", "Jim K");
			
			Thread.sleep(5000);
			
			FlightConfirmation flightConfirm = PageFactory.initElements(driver, FlightConfirmation.class);
			String bookingFlightDetails = System.getProperty("user.dir")+"\\"+"Screenshots\\"+"Test2"+".png";
			ScreenshotCapture.takeScreenshot(driver, bookingFlightDetails);
			flightConfirm.logoutBtn();
			
			System.out.println("Finishd First Negative Scenario ---->>>>");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	
	@Test (priority=3)
	public void negativeTwo() {
		try {
			System.out.println("Inside Negative Test Two");
			driver.get("http://blazedemo.com");
			
			FlightFinderP flightFinderpage = PageFactory.initElements(driver, FlightFinderP.class);
			flightFinderpage.findFlights("Portland", "Berlin");
			
			Thread.sleep(5000);
			SelectFlightPage selectFlightpage = PageFactory.initElements(driver, SelectFlightPage.class);
			selectFlightpage.ChooseFlight(driver);
			
			Thread.sleep(5000);
			
			PurchaseFlightWithDetails purchaseFlight = PageFactory.initElements(driver, PurchaseFlightWithDetails.class);
			purchaseFlight.fillDetails("", "", "", "", "", "", "", "", "", "");
			
			Thread.sleep(5000);
			
			FlightConfirmation flightConfirm = PageFactory.initElements(driver, FlightConfirmation.class);
			String bookingFlightDetails = System.getProperty("user.dir")+"\\"+"Screenshots\\"+"Test3"+".png";
			ScreenshotCapture.takeScreenshot(driver, bookingFlightDetails);
			flightConfirm.logoutBtn();
			
			System.out.println("Finishd Second Negative Scenario---->>>>");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}


}
