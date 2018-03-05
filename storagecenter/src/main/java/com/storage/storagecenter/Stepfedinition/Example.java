package com.storage.storagecenter.Stepfedinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example {
	
	WebDriver driver;
	@Given("^Iam can see login Page$")
	public void iam_can_see_login_Page() throws Throwable {
		
	      driver = new FirefoxDriver();
		 	driver.get("http://www.facebook.com");
		 	
		 	 driver.manage().window().maximize();
		 	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		 	
		  		System.out.println("Website launched successfully");
		
	
	    
	}

	@When("^I can see the functinalitty of login page$")
	public void i_can_see_the_functinalitty_of_login_page() throws Throwable {
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		driver.findElement(By.xpath(".//*[@id='UserName']")).sendKeys("gudafahih@uscaves.com");
		 		driver.findElement(By.xpath(".//*[@id='Password']")).sendKeys("123456");
		  		Thread.sleep(2000);
		 	driver.findElement(By.xpath(".//*[@id='sign-btn']/button[1]")).click();
		  		System.out.println("Login successfully");
	 
	}

	@Then("^I found login working$")
	public void i_found_login_working() throws Throwable {
	   
		driver.quit();
		System.out.println("Launched successfuly");
	   
	}


}
