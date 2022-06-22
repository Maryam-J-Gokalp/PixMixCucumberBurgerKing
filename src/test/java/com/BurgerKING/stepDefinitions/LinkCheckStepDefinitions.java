package com.BurgerKING.stepDefinitions;

import com.BurgerKING.pages.BurgerKingHomePage;
import com.BurgerKING.utilities.BurgerKingWebUtils;
import com.BurgerKING.utilities.ConfigurationReader;
import com.BurgerKING.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;

import java.util.List;

public class LinkCheckStepDefinitions {

    BurgerKingHomePage page = new BurgerKingHomePage();

    @When("user is on the burger king page")
    public void user_is_on_the_burger_king_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("web.site"));
    }
    @When("user click the more button")
    public void user_click_the_more_button() {
        page.moreLinkButton.click();
    }

    @When("user check the all links one by one")
    public void user_check_the_all_links_one_by_one(List<String> elements) {

    }



}
