package com.BurgerKING.pages;

import com.BurgerKING.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BurgerKingHomePage {

    public BurgerKingHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//button[@data-testid='desktop-signup-link']")
    public WebElement signUpButton;

}
