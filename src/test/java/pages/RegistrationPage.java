package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	WebDriver driver;
	//Constructor
	public RegistrationPage(WebDriver driver){
		this.driver = driver;
	}
	//Locators
	
	By fn = By.id("input-firstname");
	By ln = By.id("input-lastname");
	By emailid = By.id("input-email");
	By tele = By.id("input-telephone");
	By pass = By.id("input-password");
	By confpass = By.id("input-confirm");
	By radiobtn = (By.xpath("//input[@value='0']"));
	By cb = (By.xpath("//input[@name='agree']"));
	By con = (By.xpath("//input[@value='Continue']"));
	
	
	//Action methods
	public void firstname() {
		driver.findElement(fn).sendKeys("Radha");
	}
	
	public void lastname() {
		driver.findElement(ln).sendKeys("Krishna");
	}
	
	public void email() {
		driver.findElement(emailid).sendKeys("Harekrishna@gmail.com");
	}
	
	public void telephone() {
		driver.findElement(tele).sendKeys("9123456789");
	}
	
	public void password() {
		driver.findElement(pass).sendKeys("Radhakrishna");
	}
	
	public void passwordconfirm() {
		driver.findElement(confpass).sendKeys("Radhakrishna");
	}
	
	public void radiobutton() {
		driver.findElement(radiobtn).click();
	}
	
	public void checkbox() {
		driver.findElement(cb).click();

	}
	
	public void continuebtn() {
		driver.findElement(con).click();
	}
	

}
