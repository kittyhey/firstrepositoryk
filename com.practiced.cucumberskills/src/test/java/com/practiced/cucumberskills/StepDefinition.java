package com.practiced.cucumberskills;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition {
	WebDriver driver;
	@Given("^open Google$")
	public void open_Google() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   driver=new ChromeDriver();
	    
	}

	@When("^search for \"([^\"]*)\"$")
	public void search_for(String arg1) throws Throwable {
	   driver.get("https://www.google.com");
	    
	}

	@Then("^results page with \"([^\"]*)\" is displayed$")
	public void results_page_with_is_displayed(String title1) throws Throwable {
	    Assert.assertTrue(driver.getTitle().equalsIgnoreCase(title1));
	    driver.close();
	    //for the commit pls have this
	}


}
