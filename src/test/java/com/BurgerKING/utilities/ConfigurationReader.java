package com.BurgerKING.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {



    static Properties prop = new Properties();

    static {

        try {
            FileInputStream file = new FileInputStream("configuration.properties");

            prop.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("some configuration properties problem");
        }

    }

   public static String getProperty(String keyword){

        return prop.getProperty(keyword);
   }


}
