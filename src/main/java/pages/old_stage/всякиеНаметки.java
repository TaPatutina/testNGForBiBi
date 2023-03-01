package pages.old_stage;


import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import java.util.Random;

public class всякиеНаметки extends BasePage {
    public всякиеНаметки(WebDriver driver) {
        super(driver);
    }

    public static class randomGenerator {
        public static Random r = new Random();
        public static int upperCaseLatin = r.nextInt(65, 91); //большие лат.буквы
        public static int lowCaseLatin = r.nextInt(97, 123); //прописные лат.буквы
        public static int symbols1 = r.nextInt(33, 48); //специальные символы !"#$%&'()*+,-./
        public static int symbols2 = r.nextInt(58, 64); //специальные символы :;<=>?
        public static int symbols3 = r.nextInt(91, 97); //специальные символы [\]^_`
        public static int symbols4 = r.nextInt(123, 127); //специальные символы {|}~
        public static int numbers = r.nextInt(48, 58); //цифры
        public static int upperCaseRus = r.nextInt(1040, 1072); //большие буквы кириллица
        public static int lowCaseRus = r.nextInt(1072, 1104); //прописные буквы кириллица
        public static int anyLettersRus = r.nextInt(1040, 1104); //прописные и строчные буквы кириллица
        //Ё, ё - Символы вне общего правила, Ё = 1025, ё = 1105

    }

    public static String kjhj(){
        String s = RandomStringUtils.randomAlphabetic(6);
        return s;
    }

    public static String getOrdinaryValidEmail()  {
        char c1 = (char) randomGenerator.upperCaseLatin;
        char c2 = (char) randomGenerator.lowCaseLatin;
        char c3 = (char) randomGenerator.lowCaseLatin;
        char c4 = (char) randomGenerator.lowCaseLatin;
        char c5 = (char) randomGenerator.lowCaseLatin;

        return String.format("%1$c%2$c%3$c%4$c%5$c@mail.ru", c1, c2, c3, c4, c5);
        //не забывать в тесте System.out.println("Email в тесте: " +  RandomData.getOrdinaryValidEmail());
    }

    public static String getOrdinaryValidPass() {
        char c1 = (char) randomGenerator.lowCaseLatin;
        char c2 = (char) randomGenerator.lowCaseLatin;
        char c3 = (char) randomGenerator.numbers;
        char c4 = (char) randomGenerator.numbers;
        char c5 = (char) randomGenerator.numbers;
        char c6 = (char) randomGenerator.upperCaseLatin;
        char c7 = (char) randomGenerator.upperCaseLatin;
        return String.format("%1$c%2$c%3$c%4$c%5$c%6$c%7$c", c1, c2, c3, c4, c5, c6, c7);

    }
}
