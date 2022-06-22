package com.BurgerKING.stepDefinitions;

import com.BurgerKING.pages.BurgerKingHomePage;
import com.BurgerKING.pages.SignUpPage;
import com.BurgerKING.utilities.ConfigurationReader;
import com.BurgerKING.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BurgerKingStepDefinitions {

    BurgerKingHomePage burger = new BurgerKingHomePage();
    SignUpPage signUpPage = new SignUpPage();

    @When("User can click the signup button")
    public void user_can_click_the_signup_button() {


    }


    @Given("User see the SignUp page properly")
    public void user_see_the_sign_up_page_properly() {

    }
    @Given("User make sure on the correct tab")
    public void user_make_sure_on_the_correct_tab() {


    }
    @Given("User can enter the {string}")
    public void user_can_enter_the(String username) {


    }
    @Given("User can enter {string}")
    public void user_can_enter(String email) {


    }
    @Given("User accept the policy of the site")
    public void user_accept_the_policy_of_the_site() {


    }
    @Then("User can click the create an Account button")
    public void user_can_click_the_create_an_account_button() {



    }

    @Given("User on the page")
    public void userOnThePage() {


    }

    @Given("User see the signUp button properly")
    public void user_see_the_sign_up_button_properly() {


    }
}
