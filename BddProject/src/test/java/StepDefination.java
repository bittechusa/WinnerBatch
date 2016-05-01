import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bit.support.HomePage;
import com.bit.support.ProductDetailPage;
import com.bit.support.WomenPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination 
{
	FirefoxDriver dr=new FirefoxDriver();
	HomePage hp;
	WomenPage wp;
	ProductDetailPage pd;
@Given("^i enter eshopper$")
public void i_enter_eshopper() throws Throwable {
  // BaseTest b=new BaseTest(dr);
 // hp= b.openBrowser();
	// Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^i click women link$")
public void i_click_women_link() throws Throwable {
    wp=hp.clickWomenLink();
	// Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^i click woman product$")
public void i_click_woman_product() throws Throwable {
    pd=wp.clickWomenProduct();
	// Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^verify add to cart button presnt$")
public void verify_add_to_cart_button_presnt() throws Throwable {
    
	// Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^i should land in product detail page$")
public void i_should_land_in_product_detail_page() throws Throwable {
   
	// Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}


	/*FirefoxDriver dr;
@Given("^i enter facebook$")
public void i_enter_facebook() throws Throwable {
	dr=new FirefoxDriver();
	dr.get("http://www.facebook.com"); 
}


@When("^i enter email \"([^\"]*)\"$")
public void i_enter_email(String arg1) throws Throwable {
	dr.findElement(By.id("email")).sendKeys(arg1); 
}

@When("^i enter pass \"([^\"]*)\"$")
public void i_enter_pass(String arg1) throws Throwable {
	dr.findElement(By.id("pass")).sendKeys(arg1);
}

@When("^i enter firstname$")
public void i_enter_firstname() throws Throwable {
    System.out.println("first name");
}

@When("^i enter lastname$")
public void i_enter_lastname() throws Throwable {
	System.out.println("last name");
}

@Then("^i should see signup page$")
public void i_should_see_signup_page() throws Throwable {
	System.out.println("signup");
}


@Then("^i should see login page$")
public void i_should_see_login_page() throws Throwable {
    System.out.println("verified");
    dr.quit();
}
*/
}
