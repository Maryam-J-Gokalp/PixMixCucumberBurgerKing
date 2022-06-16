package com.BurgerKING.utilities;

import com.BurgerKING.pages.BurgerKingHomePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BurgerKingWebUtils {

    static BurgerKingHomePage page = new BurgerKingHomePage();

    public static void wait(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {

        }
    }


    /**
     * This method check all sub link the text in the more link
     * @param elements
     */
    public static void assertAllTexts(List<String> elements){

        List<WebElement> allElements = Driver.getDriver().findElements(By.xpath("//div[@id='aboutMenuEntries']//li"));

        for (int i = 0; i < allElements.size(); i++) {

            Assert.assertTrue(allElements.get(i).getText().equals(elements.get(i)));
        }
    }





}
