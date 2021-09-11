package com.graviton.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegistrationPage extends BasePage {

    protected String firstName = "Garfield";

    public RegistrationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }



    //WebElements
    @FindBy(xpath = "//a[@href ='/login']")
    WebElement loginBtn;
    @FindBy(xpath = "//input[@id='customer.emailAddress']")
    WebElement registerEmailInput;
    @FindBy(id="customer.firstName")
    WebElement firstNameInput;
    @FindBy(id="customer.lastName")
    WebElement lastNameInput;
    @FindBy(xpath = "//*[@id='password'])[2]")
    WebElement enterPassword;
    @FindBy(xpath = "//*[@id='passwordConfirm']")
    WebElement confirmPassword;
    @FindBy(xpath = "//*[@id='registrationForm']/button")
    WebElement registerButton;
    @FindBy(xpath = "//*[@id='sectionsNav']/div/div/[1]/ul[2]/li[1]/a")
    WebElement userNameText;
    @FindBy(xpath = "//*[@id='sectionsNav']/div/div/[1]/ul[2]/li[1]/a/b")
    WebElement logoutDropDown;
    @FindBy(xpath = "//*[@id='sectionsNav']/div/div/[1]/ul[2]/li[1]/ul/li[2]/a")
    WebElement logoutBtn;




    public void reisterAccount() throws InterruptedException {
        clickOnElement(loginBtn);
        textInput(registerEmailInput, "abcd1@abcd.com");
        textInput(firstNameInput, "Garfield");
        textInput(lastNameInput, "Garfield");
        textInput(enterPassword, "Garfield");
        textInput(confirmPassword, "Garfield");
       clickOnElement(registerButton);
       Thread.sleep(10000);
        System.out.println("Actual text: " + userNameText.getText());
        Assert.assertTrue(userNameText.getText().contains(firstName));
        clickOnElement(logoutDropDown);
        Thread.sleep(3000);
        clickOnElement(logoutBtn);

    }

    public void registerAccount() {
    }
}


