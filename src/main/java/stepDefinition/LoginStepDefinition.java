package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	public WebDriver driver;
	
	 @Given("^I should navigate to Home Page$")
	    public void user_is_on_home_page() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Hareesh\\Desktop\\Chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver(); //Browser Open
		 driver.get("http://demowebshop.tricentis.com"); //site url
	    }

	    @When("^I should click on LogIn Menu$")
	    public void user_navigate_to_login_page() throws InterruptedException   {
	    	Thread.sleep(3000);
	    	WebElement x=driver.findElement(By.xpath("//a[@class='ico-login']"));
	    	x.click();
	    }
	    @And("^I should enter UserName and Password$")
	    public void user_enters_username_and_password()  {
	    	
	    	WebElement a=driver.findElement(By.xpath("//input[@id='Email']"));
	    	a.sendKeys("hareesh");
	    	WebElement b=driver.findElement(By.xpath("//input[@id='Password']"));
	    	b.sendKeys("hareesh123");
	    	WebElement c=driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]"));
	    	c.click();
	    }
	    @Then("^I should click on login button$")
	    public void message_displayed_login_successfully()  {
	    }

	    

}
