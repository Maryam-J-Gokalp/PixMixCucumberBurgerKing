package com.BurgerKING.utilities;

public class BurgerKingWebUtils {

    public static void wait(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {

        }
    }



}
