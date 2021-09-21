package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import PageObject.LandingPage;
import Resource.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class stepDefination extends Base {

	
		// TODO Auto-generated method stub
		@Given("^intialize the browser with chrome$")
		public void intialize_the_browser_with_chrome() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver = intializeDriver();
		
		}

		@Given("^Navigate to \"([^\"]*)\" Site$")
		public void navigate_to_Site(String url) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			// driver.get(Prop.getProperty("url"));
			driver.get(url);
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			}

	    @When("^User Click on Spend and Save link link at the top of home page$")
	    public void user_click_on_spend_and_save_link_link_at_the_top_of_home_page() throws Throwable {
	    	LandingPage lpage = new LandingPage(driver);
	    	lpage.getElementSpendAndSave().click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		  }
		
	    @Then("^Verify user can see two card products \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void verify_user_can_see_two_card_products_something_and_something(String strArg1, String strArg2) throws Throwable {
	    	LandingPage lpage = new LandingPage(driver);
	    	boolean value =lpage.getProductImageAspiration().isDisplayed();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	         boolean value1 = lpage.getProductImageAspirationPlus().isDisplayed();
	         if (value)
	         {
	            System.out.println("Aspiration Product displayed");
	         }
	         else
	         {
	        	 System.out.println("Aspiration Product not displayed"); 
	         }
	         if (value1)
	         {
	        	 System.out.println("Aspiration  plus Product displayed");
	         }
	         else
	         {
	        	 System.out.println("Aspiration  plus Product  not displayed");
	         }
	        
	         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	         
	    }
	    
	    
	    @And("^User clicks on GetAspiration button then Verify Email text box popups$")
	    public void user_clicks_on_getaspiration_button_then_verify_email_text_box_popups() throws Throwable {
	    	LandingPage lpage = new LandingPage(driver);
	    	lpage.getAspirationButton().click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Assert.assertTrue(lpage.getEmailTextBox().isDisplayed());
			 //System.out.println("Email text box displayed");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
			lpage.getCloseButton().click();
			 driver.close(); 
	    }
	    


	    @Then("^click on GetAspirationPlus button and validate radio option is present with text \"([^\"]*)\"$")
	    public void click_on_getaspirationplus_button_and_validate_radio_option_is_present_with_text_something(String YrlyPayment) throws Throwable {
	    	LandingPage lpage = new LandingPage(driver);
	    	lpage.GetAspirationPlusButton().click();
			lpage.GetRadbuttonYrlyPlus();
	         WebElement optionYrly= lpage.GetRadbuttonYrlyPlus();
	         System.out.println(optionYrly);
	         String Textdisplayed =  optionYrly.findElement(By.cssSelector("p")).getText();
	         //String Textdisplayed1 = optionSelected.findElement(By.cssSelector("b.ng-binding")).getText();
	         System.out.println(Textdisplayed);
	     
	         
	      
	    }
	    
	    @Then("^validate that monthly radio option \"([^\"]*)\"$")
	    public void validate_that_monthly_radio_option(String MonthlyPayment) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	LandingPage lpage = new LandingPage(driver);
	    		lpage.GetRadbuttonYrlyPlus();
		         WebElement optionMonthly= lpage.GetRadbuttonMonthlyPlus();
		         System.out.println(optionMonthly.isDisplayed());
		         String Textdisplayed =  optionMonthly.findElement(By.cssSelector("p")).getText();
		         //String Textdisplayed1 = optionSelected.findElement(By.cssSelector("b.ng-binding")).getText();
		         System.out.println(Textdisplayed);
		        Assert.assertEquals(Textdisplayed,MonthlyPayment);
		        driver.close();
	        }
	
		public static void main(String[] args) {

	}

}
