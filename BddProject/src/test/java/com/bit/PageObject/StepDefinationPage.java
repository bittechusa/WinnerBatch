package com.bit.PageObject;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationPage extends BaseTest
{
	//FirefoxDriver dr;
	HomePage homePage;
	MenPage menPage;
	ShoesPage shoesPage;

	
	@Given("^I open the browser and go to Macys webSite$")
	public void i_open_the_browser_and_go_to_Macys_webSite() 
	{
	    start();
	}

	@When("^I click on men link$")
	public void i_click_on_men_link() 
	{
		homePage = new HomePage(dr);
		//menPage = homePage.clickMenLink();
	}

	@When("^Click on shoes icon$")
	public void click_on_shoes_icon() 
	{
		shoesPage = menPage.clickShoesImage();
	}

	@Then("^I should be redirected to the shoes page$")
	public void i_should_be_redirected_to_the_shoes_page() 
	{
	   shoesPage.verifyShoesPageTitle();
	}

	@When("^I search for products <\"([^\"]*)\">$")
	public void i_search_for_products(String arg1) 
	{
	   homePage.searchProducts(arg1);
	}

	@When("^Click on search button$")
	public void click_on_search_button() 
	{
		homePage.clickSearchButton();
	}

	@Then("^I should get related result$")
	public void i_should_get_related_result() 
	{
	    
	}


}
