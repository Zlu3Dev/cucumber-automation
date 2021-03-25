package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class stepDefinition {
    WebDriver driver = null;
    @Given("User is on Paradyme Management page")
    public void main_page(){
        /*
        using HeadLess options
        */
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu");
        driver = new ChromeDriver(options);
        driver.navigate().to("http://www.paradymemanagement.com/");
    }
    @When("User click main page")
    public void culture_link() throws InterruptedException {
        WebElement element =  driver.findElement(By.xpath("//*[@id=\"logo-container\"]/a/img"));
        element.click();
    }
    @Then("Main page should display")
    public void culture_page(){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"whatwedo\"]/div/h2"));
        System.out.println(element);
        if (element.getText().contentEquals("What We Do")){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }

}
