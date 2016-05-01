import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bit.PageObject.HomePage;
import com.bit.PageObject.LoginPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination1 extends BaseTest{
	
	
	HomePage hp;
	 LoginPage lp;
	 
	 @Before
	 public void m1()
	 {
		 System.out.println("before test");
	 }
	 @After
	 public void em()
	 {
		 System.out.println("after");
	 }
	 
	@Given("^i open bittech url$")
	public void i_open_bittech_url() throws Throwable {
	   openBrowser();
	}

	@When("^i clicked login button$")
	public void i_clicked_login_button() throws Throwable {
	    hp=new HomePage(dr);
	   lp=hp.clicklogin();
	   
	}

	@When("^i enter user id$")
	public void i_enter_user_id() throws Throwable {
		lp.enteruserid();
	}

	@When("^i enter password$")
	public void i_enter_password() throws Throwable {
		lp.enterpass();
	}

	@When("^i click login$")
	public void i_click_login() throws Throwable {
		lp.clicklogin();
	}

	@Then("^i should see login page$")
	public void i_should_see_login_page() throws Throwable {
	    System.out.println("verified");
	    dr.quit();
	    throw new PendingException();
	}

@When("^i enter \"([^\"]*)\"$")
public void i_enter(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   dr.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtUserName']")).sendKeys(arg1);
	throw new PendingException();
}

@When("^i enterp \"([^\"]*)\"$")
public void i_enterp(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	dr.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtPass']")).sendKeys(arg1);
	throw new PendingException();
}





}
