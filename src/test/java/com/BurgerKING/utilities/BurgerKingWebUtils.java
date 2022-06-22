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


    }





}
