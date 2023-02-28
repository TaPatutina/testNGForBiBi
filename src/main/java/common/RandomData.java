package common;


import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import java.util.Random;

public class RandomData extends BasePage {
    public RandomData(WebDriver driver) {
        super(driver);
    }

    public static String getOrdinaryValidEmail() {
        Random r = new Random();
        int i1 = r.nextInt(65, 91); //большие лат.буквы
        int i2 = r.nextInt(97, 123); //прописные лат.буквы
        int i3 = r.nextInt(97, 123);

        char c1 = (char) i1;
        char c2 = (char) i2;
        char c3 = (char) i3;
        char c4 = '@';

        String ordinaryValidEmail = String.format("smth%1$c%2$c%3$c%4$cmail.ru", c1, c2, c3, c4);
        return ordinaryValidEmail;
        //не забывать в тесте System.out.println("Email в тесте: " + ordinaryValidEmail);

    }
}
