package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DataDrivenStepDefinition {
public WebDriver driver;
	  @Given("^I have launch the application$")
	    public void i_have_launch_the_application() {

		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Hareesh\\Desktop\\Chromedriver\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("http://demo.guru99.com/test/newtours/");
	    }

	    @Then("^I enter username \"([^\"]*)\"$")
	    public void i_enter_username_something(String username)  {
	      WebElement a=driver.findElement(By.xpath("//input[@name='userName']"));  
	      a.sendKeys(username);
	    }

	    @Then("^I enter password \"([^\"]*)\"$")
	    public void i_enter_password_something(String password)  {
	    	WebElement b=driver.findElement(By.xpath("//input[@name='password']"));
	        b.sendKeys(password);
	    }

	    @Then("^I click on login button$")
	    public void i_click_on_login_button()  {
	    	WebElement c=driver.findElement(By.xpath("//input[@name='submit']"));
	    	c.click();
	      

	    }
}

