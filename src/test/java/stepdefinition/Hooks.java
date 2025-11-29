package stepdefinition;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	public static WebDriver driver;

	@Before
	public void setup() {
		System.out.println("=========== Scenario Started ===========");
	}

	@After
    public void tearDown(Scenario scenario) throws IOException {
		// Take Screenshot
		if(scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) TC_RF_001.driver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			
			//Attach the screenshot to cucumber report
			scenario.attach(screenshot,"image/png","Test Failure Screenshot");
			
			//Save the screenshot to folder
			File screenshotFile = ts.getScreenshotAs(OutputType.FILE);
			File targetFile = new File("C:\\Users\\admin\\Documents\\workspace-spring-tools-for-eclipse-4.32.1.RELEASE\\KCLife\\Screenshot\\bug1.png");
			
			Files.copy(screenshotFile.toPath(),targetFile.getAbsoluteFile().toPath());
			
			System.out.println("Screenshot Saved:"+targetFile.getAbsolutePath());
			
		}
	}
}
