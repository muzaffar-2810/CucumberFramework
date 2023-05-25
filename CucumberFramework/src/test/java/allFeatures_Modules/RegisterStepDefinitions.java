package allFeatures_Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinitions {
	public WebDriver driver;
	
	@Given("^The user has to be in register page$")
	public void the_user_has_to_be_in_register_page() throws Exception {
	    driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5000/register");
		Thread.sleep(1000);
	}

	@When("^the user enters the username$")
	public void the_user_enters_the_username() throws InterruptedException {
	    WebElement usernameTF = driver.findElement(By.xpath("//input[@name='name']"));
	    usernameTF.sendKeys("MUZZZ12");
	    Thread.sleep(1000);
	}

	@When("^the user enters a new password$")
	public void the_user_enters_a_new_password() throws InterruptedException {
		WebElement usernameTF = driver.findElement(By.xpath("//input[@name='password']"));
	    usernameTF.sendKeys("MUZ3");
	    Thread.sleep(1000);
	}

	@When("^the user clicks on register button$")
	public void the_user_clicks_on_register_button() throws InterruptedException {
	    WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register']"));
	    registerButton.click();
	    Thread.sleep(1000);
	}

	@Then("^the user should be navigated to the login page of ecoders website$")
	public void the_user_should_be_navigated_to_the_login_page_of_ecoders_website() throws InterruptedException {
	    String actualLoginPageTitle = driver.getTitle();
	    String expectedLoginPageTitle = "FLASK-CRUD_APP_login_page.";
	    if(actualLoginPageTitle.equals(expectedLoginPageTitle)) {
	    	System.out.println("Testcases passed: User is successfully regstered and Login page is displayed and verified upon its title");
	    }
	    else {
	    	System.out.println("Testcases failed: Title did not matched, User did not get regstered and Login page is not displayed");
		}
	    Thread.sleep(1000);
	    driver.quit();
	}
	
	
	@Given("^User should be in login page of the ecoders application$")
	public void user_should_be_in_login_page_of_the_ecoders_application() throws InterruptedException {
	    driver = new ChromeDriver();
	    driver.get("http://127.0.0.1:5000/login");
	    Thread.sleep(1000);
	}

	@When("^the user enters valid username in username Text field$")
	public void the_user_enters_valid_username_in_username_text_field() throws InterruptedException {
	   WebElement usernameTF = driver.findElement(By.xpath("//input[@name='name']"));
	   usernameTF.sendKeys("m");
	   Thread.sleep(1000);
	}

	@When("^the user enters valid password in password text field$")
	public void the_user_enters_valid_password_in_password_text_field() throws InterruptedException {
		WebElement usernameTF = driver.findElement(By.xpath("//input[@name='password']"));
	    usernameTF.sendKeys("123");
	    Thread.sleep(1000);
		}

	@When("^the user clicks on the sign in button$")
	public void the_user_clicks_on_the_sign_in_button() throws InterruptedException {
		WebElement registerButton = driver.findElement(By.xpath("//button[text()='Sign In']"));
	    registerButton.click();
	    Thread.sleep(1000);
	}

	@Then("^the user should be navigated to dashboard page of ecoders appication$")
	public void the_user_should_be_navigated_to_dashboard_page_of_ecoders_appication() throws InterruptedException {
		String actualDashboardPageTitle = driver.getTitle();
	    String expectedDashboardPageTitle = "FLASK-CRUD_APP_Dashboard_page.";
	    if(actualDashboardPageTitle.equals(expectedDashboardPageTitle)) {
	    	System.out.println("Testcases passed: User is successfully logged in and Dashboard page is displayed and verified upon its title");
	    }
	    else {
	    	System.out.println("Testcases failed: Title did not matched, User did not logged in and dashboard page is not displayed");
		}
	    Thread.sleep(1000);
	    driver.quit();
	}

}
