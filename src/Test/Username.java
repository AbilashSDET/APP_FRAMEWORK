package Test;

 
import static org.testng.Assert.fail;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Commonfunc.commonfunction;
import Commonfunc.configreader;
import ObjectRepo.SeleniumLoca;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Username implements SeleniumLoca{
	commonfunction commonfunc = new commonfunction();
	configreader config = new configreader();
	WebDriverWait wait = null;
	
	
	
	@Given("User is on login page")
	public void login()
	{
		commonfunc.launchurl("https://www.saucedemo.com/", "Chrome");
		if(commonfunc.driver.getTitle().equals("Swag Labs"))
		{
			commonfunc.screenshot("Title");
		}
		else
		{
			Assert.assertEquals("Swag labs", "irrelevant", "Title does not match!");
		}
	}
	
	@When("User enters valid credentials")
	public void enter()
	{
		String username = config.getproperty("username");
		String password = config.getproperty("password");
		wait = new WebDriverWait(commonfunc.driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(commonfunc.driver.findElement(Username))).sendKeys(username);
		wait.until(ExpectedConditions.elementToBeClickable(commonfunc.driver.findElement(Password))).sendKeys(password);;
		wait.until(ExpectedConditions.elementToBeClickable(commonfunc.driver.findElement(Submit))).click();;
		try
		{
			Alert alert = commonfunc.driver.switchTo().alert();
			alert.dismiss();
		}
		catch(NoAlertPresentException e)
		{
			System.out.println();
		}
		wait.until(ExpectedConditions.elementToBeClickable(commonfunc.driver.findElement(drpdwon)));
		Select sel = new Select(commonfunc.driver.findElement(drpdwon));
		List<WebElement>stringarr = sel.getOptions();
		for(WebElement string: stringarr)
		{
			System.out.println(string.getText());
		}
		
		
		
		
	}
	
	@Then("User should be redirected to the homepage")
	public void quit()
	{
		commonfunc.driver.quit();
	}

}
