package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationPage;

public class TC_RF_001 {
	public static WebDriver driver;
	RegistrationPage rp;

	@Given("User has opened the browser and launched the application")
	public void user_has_opened_the_browser_and_launched_the_application() throws InterruptedException {
		driver = new ChromeDriver();
		Hooks.driver = driver;

		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);

		rp = new RegistrationPage(driver);
	}

	@When("User enters valid First Name")
	public void user_enters_valid_first_name() {
		rp.firstname();
	}

	@When("User enters valid Last Name")
	public void user_enters_valid_last_name() {
		rp.lastname();
	}

	@When("User enters valid Email")
	public void user_enters_valid_email() {
		rp.email();
	}

	@When("User enters valid Telephone")
	public void user_enters_valid_telephone() {
		rp.telephone();
	}

	@When("User enters valid Password")
	public void user_enters_valid_password() {
		rp.password();
	}

	@When("User enters valid Password Confirm")
	public void user_enters_valid_password_confirm() {
		rp.passwordconfirm();
	}

	@When("User clicks on radio button no")
	public void user_clicks_on_radio_button_no() {
		rp.radiobutton();
	}

	@When("User clicks on privacy policy checkbox")
	public void user_clicks_on_privacy_policy_checkbox() {
		rp.checkbox();
	}

	@When("User clicks on continue button")
	public void user_clicks_on_continue_button() {
		rp.continuebtn();
	}

	@Then("User should be Registered Successfully")
	public void user_should_be_registered_successfully() {
		Assert.assertEquals(driver.getTitle(), "Your Account Has Been Created!");
	}
}
