package PnCStepDefinition;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import DriverSetup.SetupDriver;
import PnCPage.LoginClass;
import PnCPage.PnCPageFac;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class PnCStepDefinition {
	static WebDriver driver;
	
	LoginClass lc;
	SetupDriver sd;
	PnCPageFac pf;
	
	/*============================================ 1 (SEARCH BAR)============================================ */
	
	/*
	 * Created By : Anushka Pathak
	 * Reviewed By :
	 * Motive : It is a mandatory step to enter services in search bar to get the various services
	 */

@Given("user should be on Home page")
public void user_should_be_on_home_page() {
    // Write code here that turns the phrase above into concrete actions
   driver = sd.chromedriver();
   
}

@When("user clicks on menu button")
public void user_clicks_on_menu_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete action
	pf = new PnCPageFac(driver);
	pf.clickMenu();
}

@And("user selects painting and cleaning")
public void user_selects_painting_and_cleaning() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	pf = new PnCPageFac(driver);	
	pf.clickPnC();
}


@When("user enters in search bar")
public void user_enters_in_search_bar(DataTable credentials) throws InterruptedException {
	
	List<List<String>> cells = credentials.cells();
	pf = new PnCPageFac(driver);
	pf.typeInSearchBar(cells.get(0).get(0));
}

@And("user selects from the list")
public void user_selects_from_the_list() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	pf = new PnCPageFac(driver);
	pf.chooseThefacility();
	
	
}

@Then("It should redirect to the selected page")
public void it_should_redirect_to_the_selected_page() {
    // Write code here that turns the phrase above into concrete actions
	pf = new PnCPageFac(driver);
	pf.navigatesOnFacilityPage();
	String msg = pf.navigatesOnFacilityPage();
	Assert.assertEquals(msg, "Best Bathroom Cleaning Services in Mumbai");
	//System.out.println("TRUE!");
}

/*============================================ 2 (CORPORATE ENQUIRY)============================================ */

/*
 * Created By : Anushka Pathak
 * Reviewed By :
 * Motive : It is the step to check the corporate enquiry form
 */


@When("user clicks on menu button from the sidebar")
public void user_clicks_on_menu_button_from_the_sidebar() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions

	pf = new PnCPageFac(driver);
	pf.clickMenu();
}


@And("clicks on corporate enquiry")
public void clicks_on_corporate_enquiry() {
    // Write code here that turns the phrase above into concrete actions
	pf.clickOnCorpEnq();
	
}

@And("user enters {string}, {string}, {string} and {string}")
public void user_enters_and(String string, String string2, String string3, String string4) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	pf.fillDetails(string, string2, string3, string4);
}

@And("user selects city from dropdown")
public void user_selects_city_from_dropdown() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	pf.selectCityFromList();
}

@And("user clicks on book consultation")
public void user_clicks_on_book_consultation() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	pf.clickOnBookConsultation();
}

@Then("it should display the success message of form submission")
public void it_should_display_the_success_message_of_form_submission() {
	// Write code here that turns the phrase above into concrete actions
	pf.displayTheMsg();
	
}


/*============================================ 3 (BLOG)============================================ */

/*
 * Created By : Anushka Pathak
 * Reviewed By :
 * Motive : It is the step to validate Top Blog form in the Blog section in the menu
 */

@When("user selects blog from the menu")
public void user_selects_blog_from_the_menu() throws InterruptedException, AWTException {
    // Write code here that turns the phrase above into concrete actions
	pf = new PnCPageFac(driver);
	pf.clickOnBlog();
    
}

@And("user gets navigated to blog page and scrolls down")
public void user_gets_navigated_to_blog_page_and_scrolls_down() throws InterruptedException, AWTException {
    // Write code here that turns the phrase above into concrete actions
	pf.scrollDownTheBlogPage();
   
}

@And("user clicks on Top Blogs")
public void user_clicks_on_top_blogs() {
    // Write code here that turns the phrase above into concrete actions
	pf.clickOnTopBlogs();
   
}

@And("user scrolls down the page")
public void user_scrolls_down_the_page() throws InterruptedException, AWTException {
    // Write code here that turns the phrase above into concrete actions
    pf.scrollDownTheBlogPage();
}

@And("user chooses a link from renting part")
public void user_chooses_a_link_from_renting_part() {
    // Write code here that turns the phrase above into concrete actions
	pf.clickOnLink();
  
}

@And("user gets navigated to the page and scrolls down")
public void user_gets_navigated_to_the_page_and_scrolls_down() throws AWTException {
    // Write code here that turns the phrase above into concrete actions
	pf.scrollDownContactUs();
   
}


@And("user fills {string}, {string} , {string} and selects city and service from dropdown")
public void user_fills_and_selects_city_and_service_from_dropdown(String string, String string2, String string3) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    pf.sideDetails(string, string2, string3);
}

@When("clicks on submit button")
public void clicks_on_submit_button() {
    // Write code here that turns the phrase above into concrete actions
	pf.clickOnSideSubmit();
  
}

@Then("it should show a success message for the form submission")
public void it_should_show_a_success_message_for_the_form_submission() {
    // Write code here that turns the phrase above into concrete actions
	pf.checkSubmissionMsg();
  
}

/*============================================ 4 (PROPERTY DETAILS)============================================ */

/*
 * Created By : Anushka Pathak
 * Reviewed By :
 * Motive : It is a step to fill Property detail page in rental agreement page 
 */

@Given("User should be logged in and should be on home page")
public void user_should_be_logged_in_and_should_be_on_home_page() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	driver = sd.chromedriver();
	
	lc=new LoginClass(driver);
	lc.userLogin();
}

@When("user scrolls down the menu page")
public void user_scrolls_down_the_menu_page() throws InterruptedException, AWTException {
    // Write code here that turns the phrase above into concrete actions
	pf = new PnCPageFac(driver);
	pf.scrollTheHomePage();
	
}

@And("user clicks on Rental Agreement")
public void user_clicks_on_rental_agreement() {
    // Write code here that turns the phrase above into concrete actions
	pf = new PnCPageFac(driver);
	pf.chooseRentalAgreement();
}

@And("user gets navigated to Legal Services Page")
public void user_gets_navigated_to_legal_services_page() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	pf = new PnCPageFac(driver);
	pf.navigatesToLegalServices();
	;
}

@And("user clicks on Rental Agreement with Biometric")
public void user_clicks_on_rental_agreement_with_biometric() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	pf = new PnCPageFac(driver);
	pf.clickOnBiometric();
}

@And("user clicks on Property Details")
public void user_clicks_on_property_details() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	pf = new PnCPageFac(driver);
	pf.clickOnPropertyDetail();
	
}

@And("user fill out the {string} , {string} , {string} , {string} , {string} , {string} ,{string} , {string} and {string}")
public void user_fill_out_the_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) throws InterruptedException, AWTException {
    // Write code here that turns the phrase above into concrete actions
	pf.enterAllDetails(string,string2,string3,string4,string5,string6,string7,string8,string9);
}


@And("user clicks on Save and Proceed")
public void user_clicks_on_save_and_proceed() {
    // Write code here that turns the phrase above into concrete actions
	pf = new PnCPageFac(driver);
	pf.clickOnSaveNproceed();
    
}

@Then("user gets navigated to Landlord Detail page")
public void user_gets_navigated_to_landlord_detail_page() {
    // Write code here that turns the phrase above into concrete actions
	pf = new PnCPageFac(driver);
	pf.navigatesToLandlordDetailsPage();
   
}



/*============================================ 5 (DEFECT IN CORP ENQUIRY)============================================ */

/*
 * Created By : Anushka Pathak
 * Reviewed By :
 * Motive : It is the step to verify that the mobile number of corporate enquiry only takes input of digits
 */

@When("user clicks on menu")
public void user_clicks_on_menu() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	pf = new PnCPageFac(driver);
	pf.clickMenu();
}

@And("user clicks on Corporate Enquiry from the dropdown")
public void user_clicks_on_corporate_enquiry_from_the_dropdown() {
    // Write code here that turns the phrase above into concrete actions
	pf.clickOnCorpEnq();
    
}

@And("user enters name")
public void user_enters_name() {
    // Write code here that turns the phrase above into concrete actions
	pf.enterNamedef();
   
}


@Then("user enters {string} including characters")
public void user_enters_including_characters(String string) {
    // Write code here that turns the phrase above into concrete actions

	  try {
	        pf.enterPhoneNoDef(string);
	        Assert.assertTrue(string.matches("^\\d{10}$"));
	    } catch (AssertionError e) {
	        // Assertion failed
	        // Handle the failure (e.g., print a message, take a screenshot)
	        System.out.println("Assertion failed: " + e.getMessage());
	        
	        throw e;
	    }
	
}


/*============================================SCREENSHOTS============================================ */

@AfterStep
public static void Closedown(Scenario scenario) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(src,"image/png", scenario.getName());
	
}


}

