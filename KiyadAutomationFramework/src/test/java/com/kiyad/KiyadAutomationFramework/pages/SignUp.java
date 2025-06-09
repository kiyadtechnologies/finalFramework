package com.kiyad.KiyadAutomationFramework.pages;

import org.openqa.selenium.WebDriver;

import com.kiyad.KiyadAutomationFramework.baseFunction.ScenarioContext;
import com.kiyad.KiyadAutomationFramework.baseFunction.UserAction;

public class SignUp {
	
	public static String signUplabel="//*[contains(text(),'Sign up')]";
	public static String signUpButton="//*[@type='submit'][contains(text(),'Sign up')]";

	public static String nameInput="//input[@name='name']";

	public static String emailInput="//input[@name='email']";

	public static String passwordInput="//input[@name='password']";

	public static String confirmPasswordInput="//input[@name='confirmPassword']";
   
	public static String abc="//input[@name='confirmPassword']";
	
	
	
public static void navigateToPage(WebDriver driver, ScenarioContext context) throws Exception {
		

		
	}

	public static void assertOnPage(WebDriver driver, ScenarioContext context) throws Exception {
		
		

	}


}
