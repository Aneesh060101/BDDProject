package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class TC_LF_001 {
	WebDriver driver;
	LoginPage lp;
	@Given("User has opens the browser and launched the application")
	public void user_has_opens_the_browser_and_launched_the_application() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		
		 lp = new LoginPage(driver);
		 Hooks.driver = driver;
	}

	@When("User enters the valid Email address")
	public void user_enters_the_valid_email_address() {
	    lp.emailids();
	}

	@When("User enters the valid Password")
	public void user_enters_the_valid_password() {
	    lp.passwords();
	}
	@When("User clicks on login")
	public void user_clicks_on_login() {
		lp.logins();
	}

	@Then("User should be Logged in Successfully")
	public void user_should_be_logged_in_successfully() {
		Assert.assertEquals(driver.getTitle(),"My Account");
	    driver.close();
	}
}
