package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.Search;

public class TC_SF_001 {
	WebDriver driver;
	Search s;
	LoginPage lp;

	@Given("User has launched the application")
	public void user_has_launched_the_application() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);

		s = new Search(driver);
		lp = new LoginPage(driver);
		Hooks.driver = driver;
	}
	
	@When("User has been logged in")
	public void user_has_been_logged_in() {
		lp.emailids();
		lp.passwords();
		lp.logins();
	}

	@When("User enters the valid product name in the search box")
	public void user_enters_the_valid_product_name_in_the_search_box() {
		s.searchbox();
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
		s.searchclick();
	}

	@Then("User should see the searched prodcut displayed")
	public void user_should_see_the_searched_prodcut_displayed() {
		Assert.assertEquals(driver.getTitle(), "Search - Iphone");
		driver.close();
	}
}
