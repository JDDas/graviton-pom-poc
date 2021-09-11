package com.graviton.tests;

import com.graviton.pages.LogInPage;
import com.graviton.pages.RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;
    String baseURL = "https://demo.broadleafcommerce.org/";

    protected RegistrationPage registrationPage;
    protected LogInPage logInPage;

    public void highlightElement(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("argument[0].style.border='solid 3px green'", element);
    }

    @BeforeClass
    public void setUp(){
        init();
        registrationPage = new RegistrationPage(driver);
        logInPage = new LogInPage(driver);

    }
    @AfterClass
    public void teardown(){
        if (driver !=null){
            driver.quit();
        }

    }
    public void init(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.navigate().to(baseURL);

    }
}
