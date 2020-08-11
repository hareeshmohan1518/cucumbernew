package stepDefinition;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RegisterStepDefinitionOnDemoWebshop {
	public WebDriver driver;
	 @Given("^I have navigated to home page of demowebshop$")
	    public void i_have_navigated_to_home_page_of_demowebshop() {
	        
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Hareesh\\Desktop\\Chromedriver\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("http://demowebshop.tricentis.com");
	    }

	    @Then("^I should click on register link in demoWebShop$")
	    public void i_should_click_on_register_link() {
	      driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	    }

	    @Then("^I should select my gender$")
	    public void i_should_select_my_gender() {
	        driver.findElement(By.xpath("//input[@id='gender-male']")).click();
	    }

	    @Then("^I should enter my FirstName$")
	    public void i_should_enter_my_firstname(DataTable table) {
	    	
	    	for(Map<String,String> data : table.asMaps(String.class, String.class))
	    	{
	    	
	    	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(data.get("FirstName"));
	    	}
	    }
	    @Then("^I should enter my LastName$")
	    public void i_should_enter_my_lastname(DataTable table) {
	    	for(Map<String,String> data : table.asMaps(String.class, String.class))
	    	{
	    	
	    	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(data.get("LastName"));
	    	}
	    }

	    @Then("^I should enter my email$")
	    public void i_should_enter_my_email(DataTable table)  {
	    	
	    	for(Map<String,String> data : table.asMaps(String.class, String.class))
	    	{
	    	
	    	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(data.get("Email"));
	    	}
	        
	    }

	    @Then("^I should enter my password$")
	    public void i_should_enter_my_password(DataTable table) {
	    	for(Map<String,String> data : table.asMaps(String.class, String.class))
	    	{
	    	
	    	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(data.get("Password"));
	    	}
	    	
	        
	    }

	    @Then("^I should enter CPassword$")
	    public void i_should_enter_cpassword(DataTable table) {
	    	for(Map<String,String> data : table.asMaps(String.class, String.class))
	    	{
	    	
	    	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(data.get("CPassword"));
	    	}
	    }

	    @And("^I should click on register button in demoWebShop$")
	    public void i_should_click_on_register_button() {
	    	
	    	driver.findElement(By.xpath("//input[@id='register-button']")).click();
	        
}
}