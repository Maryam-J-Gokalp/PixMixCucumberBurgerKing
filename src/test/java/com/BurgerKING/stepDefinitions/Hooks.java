package com.BurgerKING.stepDefinitions;

import com.BurgerKING.utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @After
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()){


            byte[] screenshots = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshots, "image/png",scenario.getName());
        }

        Driver.stopSession();
    }



}
