package com.kiyad.KiyadAutomationFramework.stepDefinationFiles;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import com.kiyad.KiyadAutomationFramework.baseFunction.ApplicationSpecificUserAction;
import com.kiyad.KiyadAutomationFramework.baseFunction.ScenarioContext;
import com.kiyad.KiyadAutomationFramework.baseFunction.Selenium;

import io.cucumber.java.en.When;

public class ApplicationSpecificUserActionStepDefination {
	
	Selenium sel;
	WebDriver driver;
	ScenarioContext context;

	public ApplicationSpecificUserActionStepDefination(Selenium sel, ScenarioContext context) {
		this.sel = sel;
		this.driver = sel.getDriver();
		this.context = context;
		
	}
	    
	    @When("user login as {string} user")
	    public void logInAs(String userType) throws Throwable {
	        ApplicationSpecificUserAction.logInAsUser(driver, context, userType);
	    }

    @And("user handel iframe")
    public void userHandelIframe() {
        System.out.println("hello world");
    }

    @Then("user is handels {string} frame successfully")
    public void userIsHandelsHeaderFrameSuccessfully(String frameName) {
        String name = frameName;
        System.out.println("frame name is" + name);
    }


    @When("user creates new customer")
    public void userCreatesNewCustomer() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("customer created successfully");
        System.out.println("customer created successfully 22");
    }
}
