package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
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
        * */
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200",
                "--ignore-certificate-errors","--disable-extensions",
                "--no-sandbox","--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.navigate().to("http://www.paradymemanagement.com/");
    }
    @When("User click our culture link")
    public void culture_link(){
        driver.findElement(By.xpath("//*[@id=\"menu-item-890\"]/a")).click();
    }
    @Then("Culture page should display")
    public void culture_page(){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"section-1\"]/div[4]/div[2]/h3"));
        System.out.println(element);
        if (element.getText().contentEquals("How we succeed")){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }
}
