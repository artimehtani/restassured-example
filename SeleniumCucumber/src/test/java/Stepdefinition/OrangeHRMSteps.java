package Stepdefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHRMSteps {
    WebDriver driver;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C://arti-dev//chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("I opened OrangeHRM home page")
    public void i_opened_OrangeHRM_home_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Then("I verify that the logo is present on the page")
    public void i_verify_that_the_logo_is_present_on_the_page() {
        boolean status = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/img")).isDisplayed();
        Assert.assertEquals(true, status);
    }

    @Then("Close the browser")
    public void close_the_browser() {
        driver.quit();
    }
}
