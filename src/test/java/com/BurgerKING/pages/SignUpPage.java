package com.BurgerKING.pages;

import com.BurgerKING.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    public SignUpPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "tab-0")
    public WebElement SignUpTabButton;

    @FindBy(name = "name")
    public WebElement firstName;

    @FindBy(name = "email")
    public WebElement emailAddressBox;

    @FindBy(xpath = "//div[@class='build__Check-b7zorw-53 fJYgf']")
    public WebElement optionalCheckbox;

    @FindBy(xpath = "//div[@class='build__IconWrapper2-b7zorw-24 fbSkXV']")
    public WebElement agreementCheckbox;

    @FindBy(xpath = "//button[@data-testid='signup-button']")
    public WebElement createAnAccountButton;
}
