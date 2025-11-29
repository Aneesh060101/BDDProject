package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "C:/Users/admin/Documents/workspace-spring-tools-for-eclipse-4.32.1.RELEASE/KCLife/Vrindavan/01_registration.feature"
//              "C:/Users/admin/Documents/workspace-spring-tools-for-eclipse-4.32.1.RELEASE/KCLife/Vrindavan/02_login.feature",
//              "C:/Users/admin/Documents/workspace-spring-tools-for-eclipse-4.32.1.RELEASE/KCLife/Vrindavan/03_search.feature"
        },
        glue = { "stepdefinition" },
        dryRun = false,
        monochrome = true,
        plugin = {
                "pretty",
                "html:reports/cucumber-html-report.html",
                "json:reports/cucumber.json",
                "junit:reports/cucumber.xml"
        }
)
public class RunnerFile extends AbstractTestNGCucumberTests {

}
