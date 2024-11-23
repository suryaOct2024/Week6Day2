package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSalesForce extends ProjectSpecificMethod{
	
		
	@Given("Launch the Sales Force Application with url {string}")
	public void launch_the_sales_force_application_with_url(String url) 
	{
	    	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
	}

	@Given("Enter the username as {string}")
	public void enterUsername(String user) {
		
		driver.findElement(By.id("username")).sendKeys(user);
		
	}

	@Given("Enter the password as {string}")
	public void enterPassword(String pwd) {
	   
		driver.findElement(By.id("password")).sendKeys(pwd);
		
	}

	@When("Click on the login button")
	public void clickLogin() {
		
		driver.findElement(By.id("Login")).click();
	   
	}

	@Then("Verify successful login")
	public void verifyLogin() {
	   
		System.out.println(driver.getTitle());
		
	}

}
