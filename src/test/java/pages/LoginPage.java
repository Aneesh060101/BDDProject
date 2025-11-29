package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	//Constructor
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	//Locators
	By emails = By.xpath("//input[@id='input-email']");
	By passwords = By.xpath("//input[@id='input-password']");
	By logins = By.xpath("//input[@value='Login']");
	
	
	//Action methods
	public void emailids(){
		driver.findElement(emails).sendKeys("Harekrishna@gmail.com");
	}
	
	public void passwords(){
		driver.findElement(passwords).sendKeys("Radhakrishna");
	}
	
	public void logins(){
		driver.findElement(logins).click();
	}
}
