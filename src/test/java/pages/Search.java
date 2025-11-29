package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
	WebDriver driver;
	//Constructor
	public Search(WebDriver driver){
		this.driver = driver;
	}
	
	//Locators
	By sb = By.xpath("//input[@placeholder='Search']");
	By sc = By.xpath("//button[@class='btn btn-default btn-lg']");
	//Action methods
	public void searchbox() {
		driver.findElement(sb).sendKeys("Iphone");
	}
	
	public void searchclick() {
		driver.findElement(sc).click();
	}
}
