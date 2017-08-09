package com.cucumber.integration.poc;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.sun.org.omg.CORBA.ExceptionDescription;
import com.sun.xml.internal.bind.v2.model.core.Element;
import com.thoughtworks.selenium.webdriven.commands.GetText;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.lu.an;

public class PhpTravelsPage {

	public static WebDriver driver;

	static {
		FirefoxBinary firefoxbinar = new FirefoxBinary(
				new File("C:\\Users\\rdodwad\\AppData\\Local\\Mozilla Firefox\\firefox.exe"));
		FirefoxProfile firefoxProfile = new FirefoxProfile();

		driver = new FirefoxDriver(firefoxbinar, firefoxProfile);

		driver.manage().window().maximize();

	}

	// Registration

	String firstname1 = "//input[@name='firstname']";

	String lastname1 = "//input[@name='lastname']";

	String mobileno1 = "//input[@name='phone']";

	String email1 = "//input[@name='email']";

	String password1 = "//input[@name='password']";

	String confirmpassword1 = "//input[@name='confirmpassword']";

	String submitButton = "//button[@type='submit']";

	String accname = "//i[@class='icon_set_2_icon-105']";

	String logoutbutton = "//a[@href='http://www.phptravels.net/account/logout/']";

	String bookingstab = "//a[@href='#bookings']";

	String profiletab = "//a[@href='#profile']";

	// Login page

	String useremail = "//input[@name='username']";

	String userpassword = "//input[@name='password']";

	String loginButton = "//button[@type='submit' and @class='btn btn-action btn-block loginbtn']";

	String panelbody = "//div[@class='panel-body']";

	// Hotel booking

	String hotelslink = "//a[@href='http://www.phptravels.net/hotels']";

	String searchbycity = "//*[@class='select2-chosen']";

	String location = "//div[@class='select2-search']";

	String pickhotelfromsuggestion = "//*[@class='select2-results']";

	String hotelcheckbox = "//input[@id='Hotel']";

	String searchHotelbutton = "//button[@type='submit' and @class='btn-warning btn btn-lg btn-block']";

	String moredetailsbutton = "//*[@href='#details52']";

	String booknowbutton = "//*[@type='submit' and @class='btn btn-action btn-block chk']";

	String firstname = "//input[@name='firstname']";

	String lastname = "//input[@name='lastname']";

	String emailid = "//input[@name='email']";

	String confirmemail = "//input[@name='confirmemail']";

	String mobileno = "//input[@name='phone']";

	String address = "//input[@name='address']";

	String addnotes = "//*[@name='additionalnotes']";

	String confirmbooking = "(//*[@type='submit'])[1]";

	String viewmapbutton = "//a[@href='#collapseMap']";

	String personaldetails = "(//input[@class='form-control'])[1]";

	String invoicepage = "//div[@class='col-md-6']";

	// Tour booking

	String tourslink = "//a[@href='http://www.phptravels.net/tours']";

	String picktourfromsuggestion = "//ul[@class='select2-result-sub']";

	String searchtourbutton = "//button[@type='submit' and @class='btn-warning btn btn-lg btn-block']";

	String detailsbutton = "//*[@class='mt15 btn btn-action btn-block']";

	String booknowtourbutton = "//*[@class='btn btn-block btn-action btn-lg']";

	// Car booking

	String carslink = "//a[@href='http://www.phptravels.net/cars']";

	String pickup = "(//*[@class='select2-chosen'])[1]";

	String carlocation = "//input[@class='select2-input']";

	String pickupfromsuggestion = "(//div[@class='select2-result-label'])[2]";

	String pickupfromsuggestiondrop = "(//div[@class='select2-result-label'])[1]";

	String drop = "(//*[@class='select2-chosen'])[2]";

	String cardetails = "//button[@class='mt15 btn btn-action btn-block']";

	String booknowcarbutton = "//*[@class='btn btn-block btn-action btn-lg']";

	String searchcarbutton = "//button[@type='submit' and @class='btn-warning btn btn-lg btn-block']";

	String carsonrightpane = "//*[@class='grey RTL']";


	// @ Registration test

	@Given(value = "Browser is opened")
	public void givenTest() throws InterruptedException {

		System.out.println("Browser is opened");
	}

	@When("^Open Registration page when user enters URL as \"(.*)\"$")

	public void register(String URL) throws InterruptedException {

		driver.get(URL);

		System.out.println("The url is " + URL);

	}

	@And("^User enters firstname as \"(.*)\" and lastname as \"(.*)\" and mobileno as \"(.*)\" and email as \"(.*)\" and password as \"(.*)\" and confirmpassword as \"(.*)\"$")
	public void PhpTravelUserRegistration(String firstname, String lastname, String mobileno, String email,
			String password, String confirmpassword) throws InterruptedException {

		driver.findElement(By.xpath(firstname1)).sendKeys(firstname);
		driver.findElement(By.xpath(lastname1)).sendKeys(lastname);
		driver.findElement(By.xpath(mobileno1)).sendKeys(mobileno);
		driver.findElement(By.xpath(email1)).sendKeys(email);
		driver.findElement(By.xpath(password1)).sendKeys(password);
		driver.findElement(By.xpath(confirmpassword1)).sendKeys(confirmpassword);

	}

	@And("^Click submit$")
	public void submit() throws InterruptedException {

		driver.findElement(By.xpath(submitButton)).click();

		Thread.sleep(8000);
	}

	@Then("^login should be successful after registration$")
	
	public void successlogin() throws InterruptedException {
		
		Thread.sleep(500);
		
		try {
			
			WebElement loggedin = driver.findElement(By.xpath(bookingstab));
			String textontab = loggedin.getText();
			Assert.assertEquals("Bookings", textontab);

			System.out.println("login is successful");
			
		} catch (Exception e) {
			
		}	

	}

	@When("^click logout$")
	public void logout() throws InterruptedException {

		driver.findElement(By.xpath(accname)).click();
		driver.findElement(By.xpath(logoutbutton)).click();

		Thread.sleep(2000);

	}

	@Then("^user should be logged out$")

	public void successlogout() throws InterruptedException {

		Thread.sleep(5000);
		
		try {
			
			WebElement loggedout = driver.findElement(By.xpath(useremail));
			boolean element = loggedout.isDisplayed();

			Assert.assertEquals(true, element);

			System.out.println("logout is successful");
			
		} catch (Exception e) {
			
		}
		
	}

	// @ Login Test

	@Given("^Login page is displayed$")

	public void Login() throws InterruptedException  {
        Thread.sleep(1000);
        try {
        	
        	WebElement loggedout = driver.findElement(By.xpath(useremail));
    		boolean element = loggedout.isDisplayed();

    		Assert.assertEquals(true, element);
			
		} catch (Exception e) {
			
		}
		
	}

	@When("^user enters username as \"(.*)\" and password as \"(.*)\"$")

	public void validlogin(String uname, String pwd) throws InterruptedException {
		driver.findElement(By.xpath(useremail)).sendKeys(uname);
		driver.findElement(By.xpath(userpassword)).sendKeys(pwd);

	}

	@And("^click login$")

	public void logina() throws InterruptedException {
		driver.findElement(By.xpath(loginButton)).click();
		Thread.sleep(2000);
	}

	@Then("^login should be successful$")

	public void loginb() throws InterruptedException {
		Thread.sleep(5000);
		
		try {
			
			WebElement loggedin = driver.findElement(By.xpath(bookingstab));
			String textontab = loggedin.getText();
			Assert.assertEquals("Bookings", textontab);
			
		} catch (Exception textontab) {
			
		}	
	}

	// @ Hotel booking

	/*@Given("^Hotels page is displayed$")

	public void hotelpage() throws InterruptedException {
		
		Thread.sleep(1500);
		driver.findElement(By.xpath(hotelslink)).click();
		Thread.sleep(2500);

		WebElement hotel = driver.findElement(By.xpath(hotelslink));
		String textonlink = hotel.getText();
		Assert.assertEquals("Hotels", textonlink);

		System.out.println("book hotel page is loaded");

	}

	@When("^user enters location as \"(.*)\" and select hotel and click search button$")

	public void hotelbooking1(String lname) throws InterruptedException {

		driver.findElement(By.xpath(searchbycity)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(location)).sendKeys(lname);
		Thread.sleep(1000);
		driver.findElement(By.xpath(pickhotelfromsuggestion)).click();
		driver.findElement(By.xpath(searchHotelbutton)).click();
	}

	@Then("^hotel is listed on right side$")

	public void hotelbooking2() throws InterruptedException {
		Thread.sleep(1500);
		WebElement hotelresult = driver.findElement(By.xpath(viewmapbutton));
		boolean element = hotelresult.isDisplayed();
		Assert.assertEquals(true, element);
		
		System.out.println("hotel is listed");
	}

	@When("^click on Book Now button$")

	public void hotelbooking3() throws InterruptedException {

		driver.findElement(By.xpath(booknowbutton)).click();
		Thread.sleep(10000);
	}

	@Then("^personal information page is displayed$")

	public void hotelbooking4() throws InterruptedException {
		Thread.sleep(2500);
		WebElement personalinfo = driver.findElement(By.xpath(personaldetails));
		boolean element = personalinfo.isDisplayed();
		Assert.assertEquals(true, element);
		
		System.out.println("personal information page loaded");
	}

	@When("^user clicks on Confirm this booking button$")

	public void hotelbooking5() throws InterruptedException {
		driver.findElement(By.xpath(confirmbooking)).click();
		Thread.sleep(3000);
	}

	@Then("^should redirect to Invoice page$")

	public void hotelbooking6() throws InterruptedException {
		Thread.sleep(3000);
		WebElement invoice = driver.findElement(By.xpath(invoicepage));
		boolean element = invoice.isDisplayed();

		Assert.assertEquals(true, element);

		System.out.println("Invoice page generated");

	}

	// Tour booking

	@Given("^Tours page is displayed$")

	public void tourbooking1() throws InterruptedException {
		Thread.sleep(2500);
		
		driver.findElement(By.xpath(tourslink)).click();
		
		Thread.sleep(3500);
		
		WebElement tour = driver.findElement(By.xpath(tourslink));
		String textonlink = tour.getText();

		Assert.assertEquals("Tours", textonlink);
		
		System.out.println("Book tours page is displayed");
	}

	@When("^user enters location as \"(.*)\" and select place and click search button$")

	public void tourbooking1(String lname) throws InterruptedException {
		driver.findElement(By.xpath(searchbycity)).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(location)).sendKeys(lname);
		Thread.sleep(2500);
		driver.findElement(By.xpath(picktourfromsuggestion)).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(searchtourbutton)).click();
	}

	@Then("^place name is displayed on right side$")

	public void tourbooking2() throws InterruptedException {
		Thread.sleep(2500);
		WebElement tourdetails = driver.findElement(By.xpath(viewmapbutton));
		boolean element = tourdetails.isDisplayed();

		Assert.assertEquals(true, element);
		System.out.println("place name is displayed on right side");
	}

	@When("^click on tour BookNow button$")

	public void tourbooking3() throws InterruptedException {
		Thread.sleep(2500);
		driver.findElement(By.xpath(booknowtourbutton)).click();
		Thread.sleep(2500);
	}

	@Then("^personal tour information page is displayed$")

	public void tourbooking4() throws InterruptedException {
		Thread.sleep(5000);
		WebElement personalinfo = driver.findElement(By.xpath(personaldetails));
		boolean element = personalinfo.isDisplayed();

		Assert.assertEquals(true, element);
		System.out.println("tour personal information page displayed");
	}

	@When("^user clicks on tour Confirm this booking button$")

	public void tourbooking5() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(confirmbooking)).click();
		Thread.sleep(3000);
	}

	@Then("^should redirect to tour Invoice page$")

	public void tourbooking6() throws InterruptedException {
		Thread.sleep(5000);
		WebElement invoice = driver.findElement(By.xpath(invoicepage));
		boolean element = invoice.isDisplayed();

		Assert.assertEquals(true, element);
		System.out.println("tour invoice page displayed");
	}

	// car booking

	@Given("^Car booking page is displayed$")

	public void carbooking() throws InterruptedException {
		driver.findElement(By.xpath(carslink)).click();
		Thread.sleep(2500);

		WebElement carspage = driver.findElement(By.xpath(carslink));
		String textonlink = carspage.getText();
		Thread.sleep(2000);

		Assert.assertEquals("Cars", textonlink);
		System.out.println("Book Cars page displayed");
	}

	@When("^user select pickup point and click search button$")

	public void carbooking2() throws InterruptedException {
		driver.findElement(By.xpath(pickup)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(pickupfromsuggestion)).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(drop)).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(pickupfromsuggestiondrop)).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(searchcarbutton)).click();
		Thread.sleep(2000);

	}

	@Then("^cars are displayed on right side$")

	public void carbooking3() throws InterruptedException {
		Thread.sleep(4000);
		WebElement car = driver.findElement(By.xpath(carsonrightpane));
		boolean element = car.isDisplayed();

		Assert.assertEquals(true, element);
		System.out.println("car displayed on right side");
	}

	@When("^click on Details button$")

	public void carbooking4() throws InterruptedException {
		Thread.sleep(1500);
		driver.findElement(By.xpath(cardetails)).click();
		Thread.sleep(2000);
	}

	@And("^click on car Booknow button$")

	public void carbooking5() throws InterruptedException {
		driver.findElement(By.xpath(booknowcarbutton)).click();
		Thread.sleep(2000);
	}

	@Then("^personal car information page is displayed$")

	public void carbooking6() throws InterruptedException {
		Thread.sleep(4000);
		WebElement personalinfo = driver.findElement(By.xpath(personaldetails));
		boolean element = personalinfo.isDisplayed();

		Assert.assertEquals(true, element);
		System.out.println("car personal info page displayed");
	}

	@When("^user clicks on car Confirm this booking button$")

	public void carbooking7() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(confirmbooking)).click();
		Thread.sleep(3000);
	}

	@Then("^should redirect to car Invoice page$")

	public void carbooking8() throws InterruptedException {
		Thread.sleep(5000);
		WebElement bookingconfirmation = driver.findElement(By.xpath(invoicepage));
		boolean element = bookingconfirmation.isDisplayed();

		Assert.assertEquals(true, element);
	}
*/
}
