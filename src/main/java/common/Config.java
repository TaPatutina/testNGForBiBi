package common;

public class Config {

    public static final String PLATFORM_AND_BROWSER = "win_chrome";

    /**
     * Чистит куки после каждой итерации.
     * Если true - то очищаются куки
     */
    public static final Boolean CLEAR_COOKIES_AND_STORAGE = true;

    /**
     * To keep the browser open after test or suite - зависит от аннотации @AfterSuite or @AfterTest
     * if true - browser close
     */
    public static final Boolean HOLD_BROWSER_OPEN = true;
}
