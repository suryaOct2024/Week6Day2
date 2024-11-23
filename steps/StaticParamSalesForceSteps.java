package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StaticParamSalesForceSteps extends ProjectSpecificMethod{
	
	@Given("Click the App Launcher Icon next to Setup")
	public void clickAppLauncherIcon() throws InterruptedException {
	    
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
	}
	@Given("Select Accounts")
	public void selectAccounts() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		WebElement element = driver.findElement(By.xpath("//a[@data-label='Accounts']"));
		driver.executeScript("arguments[0].click()", element);
	    
	}
	@Given("Search for the account using the account name {string}")
	public void searchAccountName(String acctName) {
		
		WebElement acctNameWE = driver.findElement(By.xpath("//input[@placeholder='Search this list...']"));
		driver.executeScript("arguments[0].value = arguments[1];", acctNameWE,acctName);
		acctNameWE.sendKeys(Keys.ENTER);
	   
	}
	@When("Click the dropdown icon next to the account")
	public void clickAccountsDropDown() throws InterruptedException {
		
		Thread.sleep(3000);
		WebElement accountsWE = driver.findElement(By.xpath("(//table[@aria-label='Recently Viewed']/tbody/tr/td[6]/span/div/a/span/span)[1]"));
		driver.executeScript("arguments[0].click()", accountsWE);
	  
	}
	@Then("Select Edit")
	public void select_edit() {
		
		WebElement editWE = driver.findElement(By.xpath("//div[@title='Edit']"));
		driver.executeScript("arguments[0].click()", editWE);
	   
	}
	@Then("Set Type to {string}")
	public void setType(String type) {
		
		WebElement typeWE = driver.findElement(By.xpath("//button[@aria-label='Type']"));
		driver.executeScript("arguments[0].value=arguments[1]", typeWE,type);
		//WebElement techPartnerWE = driver.findElement(By.xpath("//span[text()='Technology Partner']"));
		//driver.executeScript("arguments[0].click()", techPartnerWE);
		    
	}
	@Then("Set Industry to {string}")
	public void setIndustry(String industry) {
		
		WebElement indWE = driver.findElement(By.xpath("//button[@aria-label='Industry']"));
		driver.executeScript("arguments[0].value=arguments[1]", indWE,industry);
		//WebElement healthcareIndWE = driver.findElement(By.xpath("//span[text()='Healthcare']"));
		//driver.executeScript("arguments[0].click()", healthcareIndWE);
	    
	}
	@Then("Enter the Billing Address as {string}")
	public void enterBillingAddress(String billAddress) {
		
		driver.findElement(By.xpath("(//lightning-textarea[@data-field='street'])[1]")).sendKeys(billAddress);
	  
	}
	@Then("Enter the Shipping Address as {string}")
	public void enterShippingAddress(String shipAddress) {
		
		driver.findElement(By.xpath("(//lightning-textarea[@data-field='street'])[2]")).sendKeys(shipAddress);
	   
	}
	@Then("Set Customer Priority to {string}")
	public void setCustomerPriority(String custPriority) {
		
		WebElement priorityWE = driver.findElement(By.xpath("//button[@aria-label='Customer Priority']"));
		driver.executeScript("arguments[0].value=arguments[1]", priorityWE,custPriority);
		//WebElement healthcareIndWE = driver.findElement(By.xpath("//span[text()='Healthcare']"));
		//driver.executeScript("arguments[0].click()", healthcareIndWE);
	  
	}
	@Then("Set SLA to {string}")
	public void setSLA(String SLA) {
		
		WebElement slaWE = driver.findElement(By.xpath("//button[@aria-label='SLA']"));
		driver.executeScript("arguments[0].value=arguments[1]", slaWE,SLA);
	    
	}
	@Then("Set Active to {string}")
	public void setActive(String active) {
	  
		WebElement activeWE = driver.findElement(By.xpath("//button[@aria-label='Active']"));
		driver.executeScript("arguments[0].value=arguments[1]", activeWE,active);
		
	}
	@Then("Enter a unique number in the Phone field as {string}")
	public void enterUniquePhone(String phno) {
		
		WebElement phnoWE = driver.findElement(By.xpath("//input[@name='Phone']"));
		driver.executeScript("arguments[0].value=arguments[1]", phnoWE,phno);
	   
	}
	@Then("Set Upsell Opportunity to {string}")
	public void setUpsellOpportunity(String opportunity) {
	  
		WebElement upsellOpporWE = driver.findElement(By.xpath("//button[@aria-label='Upsell Opportunity']"));
		driver.executeScript("arguments[0].value=arguments[1]", upsellOpporWE,opportunity);
		
	}
	@When("Click Save")
	public void click_save() {
		
		WebElement saveWE = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		driver.executeScript("arguments[0].click()", saveWE);
	   
	}
	@Then("verify the phone number as {string}")
	public void verifyPhoneNo(String phone) {
		
		String phno = driver.findElement(By.xpath("//table[@aria-label='Recently Viewed']/tbody/tr/td[4]/span")).getText();
		if(phone.equals(phno))
			System.out.println("Phone Number Verified Succssfully");
		else
			System.out.println("Phone Number Verification FAILED!");
	  
	}

}
