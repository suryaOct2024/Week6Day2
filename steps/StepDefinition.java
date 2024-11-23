package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends ProjectSpecificMethod {
	
	@Given("Click on toggle menu button from the left corner")
	public void clickToggleButton() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	   
	}
	@Given("Click view All")
	public void clickViewAll() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
	    
	}
	@Given("Click Sales from App Launcher")
	public void clickSales() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='Sales']")).click();
	   
	}
	@Given("Click on Accounts tab")
	public void clickAccounts() {
	   
		WebElement accountsWE = driver.findElement(By.xpath("//span[@class='slds-assistive-text' and text()='Accounts List']"));
		driver.executeScript("arguments[0].click()", accountsWE);
		
	}
	@When("Click on New button")
	public void clickNewButton() {
		
		WebElement newAccountWE = driver.findElement(By.xpath("//span[contains (text(),'New Account')]"));
		driver.executeScript("arguments[0].click()", newAccountWE);
	   
	}
	@Then("Enter the account name as {string}")
	public void enterAccountName(String acctName) {
		
		WebElement nameWE = driver.findElement(By.xpath("//input[@name='Name']"));
		driver.executeScript("arguments[0].value=arguments[1];", nameWE,acctName);
	   
	}
	@Then("Select Ownership as {string}")
	public void selectOwnership(String owner) {
		
		WebElement ownerWE = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
		driver.executeScript("arguments[0].value=arguments[1]", ownerWE,owner);
		
	}
	@Then("Click save")
	public void clickSave() {
		
		WebElement saveWE = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		driver.executeScript("arguments[0].click()", saveWE);
	    
	}
	
	@Then("Verify Account name as {string}")
	public void verifyAcctName(String acctName) {
		
		String name = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
		System.out.println("Account Name:"+name);
		if(acctName.equals(name))
			System.out.println("Account name Verified");
		else
			System.out.println("Incorrect Account Name");
	    
	}
	
	@Then("Close the browser")
	public void closeBrowser() {
	   
		driver.close();
		
	}

}
