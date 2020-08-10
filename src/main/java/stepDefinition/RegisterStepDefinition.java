package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RegisterStepDefinition {
public WebDriver driver;
	 @Given("^I have navigated to application$")
	    public void i_have_navigated_to_application()  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Hareesh\\Desktop\\Chromedriver\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("http://demo.guru99.com/test/newtours/");
	    }

	    @Then("^I should click on register link$")
	    public void i_should_click_on_register_link()  {
	    	WebElement a=driver.findElement(By.xpath("//a[text()='REGISTER']"));
	    	a.click();
	    }

	    @Then("^I should enter my data$")
	    public void i_should_enter_my_data(DataTable Table)  {
	    	List<List<String>> data =Table.raw();
	    	
	    	WebElement b=driver.findElement(By.xpath("//input[@name='firstName']"));
	    	b.sendKeys(data.get(0).get(0));
	    	WebElement c=driver.findElement(By.xpath("//input[@name='lastName']"));
	    	c.sendKeys(data.get(0).get(1));
	    	WebElement d=driver.findElement(By.xpath("//input[@name='phone']"));
	    	d.sendKeys(data.get(0).get(2));
	    	WebElement e=driver.findElement(By.xpath("//input[@id='userName']"));
	    	e.sendKeys(data.get(0).get(3));
	    	WebElement f=driver.findElement(By.xpath("//input[@name='address1']"));
	    	f.sendKeys(data.get(0).get(4));
	    	WebElement g=driver.findElement(By.xpath("//input[@name='city']"));
	    	g.sendKeys(data.get(0).get(5));
	    	WebElement h=driver.findElement(By.xpath("//input[@name='state']"));
	    	h.sendKeys(data.get(0).get(6));
	    	WebElement i=driver.findElement(By.xpath("//input[@name='postalCode']"));
	    	i.sendKeys(data.get(0).get(7));
	    	WebElement j=driver.findElement(By.xpath("//select[@name='country']"));
	    	Select con=new Select(j);
	    	con.selectByVisibleText(data.get(0).get(8));
	    	WebElement k=driver.findElement(By.xpath("//input[@name='email']"));
	    	k.sendKeys(data.get(0).get(9));
	    	WebElement l=driver.findElement(By.xpath("//input[@name='password']"));
	    	l.sendKeys(data.get(0).get(10));
	    	WebElement m=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
	    	m.sendKeys(data.get(0).get(11));
	    	
	    	
	       
	    }
	    @Then("^I should click on submit button$")
	    public void i_should_click_on_submit_button()  {
	        WebElement n=driver.findElement(By.xpath("//input[@name='submit']"));
	    }

	}







