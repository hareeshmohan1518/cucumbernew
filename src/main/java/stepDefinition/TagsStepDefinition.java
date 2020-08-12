package stepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class TagsStepDefinition {
	public WebDriver driver;
	

@Given("^I have navigated to loginpage$")
public void i_have_navigated_to_loginpage()  {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Hareesh\\Desktop\\Chromedriver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("http://demowebshop.tricentis.com");
	 WebElement x=driver.findElement(By.xpath("//a[@class='ico-login']"));
 	 x.click();
   
}

@Then("^enter valid email id for login$")
public void enter_valid_email_id_for_login()  {
	WebElement a=driver.findElement(By.xpath("//input[@id='Email']"));
	a.sendKeys("hareesh1518@gmail.com");
	
	
    
}

@Then("^I should enter valid password for login$")
public void i_should_enter_valid_password_for_login()  {
	WebElement b=driver.findElement(By.xpath("//input[@id='Password']"));
	b.sendKeys("hareesh123");
    
}

@Then("^Click on loginbutton$")
public void click_on_loginbutton()  {
	WebElement c=driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]"));
	c.click();    
}

@Given("^User navigated to login page of demowebshop for invalid login$")
public void user_navigated_to_login_page_of_demowebshop_for_invalid_login()  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hareesh\\Desktop\\Chromedriver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("http://demowebshop.tricentis.com");
	 WebElement x=driver.findElement(By.xpath("//a[@class='ico-login']"));
	 x.click();
    
}

@Then("^I should enter Invalid email$")
public void i_should_enter_Invalid_email() {
	WebElement a=driver.findElement(By.xpath("//input[@id='Email']"));
	a.sendKeys("hareesh@gmail.com");
	
   
}

@Then("^I should enter valid password$")
public void i_should_enter_valid_password()  {
	WebElement b=driver.findElement(By.xpath("//input[@id='Password']"));
	b.sendKeys("hareesh123");
    
}

@Then("^user click on login button$")
public void user_click_on_login_button()  {
	
	WebElement c=driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]"));
	c.click();  
}

@Given("^Launch to home page of demowebshop for another invalid login$")
public void launch_to_home_page_of_demowebshop_for_another_invalid_login()  {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hareesh\\Desktop\\Chromedriver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("http://demowebshop.tricentis.com");
	 WebElement x=driver.findElement(By.xpath("//a[@class='ico-login']"));
	 x.click();
  
}

@Then("^I should enter valid email$")
public void i_should_enter_valid_email() {
	
	WebElement a=driver.findElement(By.xpath("//input[@id='Email']"));
	a.sendKeys("hareesh1518@gmail.com");
    
}

@Then("^User entered invalid password$")
public void user_entered_invalid_password()  {
	WebElement b=driver.findElement(By.xpath("//input[@id='Password']"));
	b.sendKeys("hareesh12345");
}

@Then("^User should click on login button$")
public void user_should_click_on_login_button()  {
	
	WebElement c=driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]"));
	c.click();
    
}

@Given("^user should navigated to login page of demo web shop$")
public void user_should_navigated_to_login_page_of_demo_web_shop()  {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hareesh\\Desktop\\Chromedriver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("http://demowebshop.tricentis.com");
	 WebElement x=driver.findElement(By.xpath("//a[@class='ico-login']"));
	 x.click();
    
}

@Then("^I should enter blank email$")
public void i_should_enter_blank_email()  {
	
	WebElement a=driver.findElement(By.xpath("//input[@id='Email']"));
	a.sendKeys("");
    
}

@Then("^I should enter blank password$")
public void i_should_enter_blank_password()  {
	
	WebElement b=driver.findElement(By.xpath("//input[@id='Password']"));
	b.sendKeys("");
    
}

@Then("^click on login button$")
public void click_on_login_button()  {
	
	WebElement c=driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]"));
	c.click();
   
}


	
}
