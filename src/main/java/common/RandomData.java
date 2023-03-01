package common;


import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;


public class RandomData extends BasePage {
    public RandomData(WebDriver driver) {
        super(driver);
    }


    /**
     * случайные Email определенной длины на латинице
     * доменная часть в нижнем регистре
     */
    public static String getOrdinaryValidEmail() {
        String s1 = RandomStringUtils.randomAlphabetic(6);
        String s2 = RandomStringUtils.randomAlphabetic(3);
        String s3 = RandomStringUtils.randomAlphabetic(3).toLowerCase();
        return String.format("%1$s@%2$s.%3$s", s1, s2, s3);
        //не забывать в тесте System.out.println("Email в тесте: " +  RandomData.getOrdinaryValidEmail());
    }


    public static String getOrdinaryValidPass() {
        String s1 = RandomStringUtils.randomAlphanumeric(4);
        String s2 = RandomStringUtils.randomAscii(5);
        return String.format("%1$s%2$s", s1, s2);

    }

}