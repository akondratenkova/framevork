package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static common.Config.PLATFORM_AND_BROWSER;
import static constants.Constant.TimeoutVariable.IMPLICIT_WAIT;

public class CommonActions {
    //метод для создания драйвера
    public static WebDriver createDriver(){
        WebDriver driver = null;

        //подбор драйвера
        switch (PLATFORM_AND_BROWSER){
            case "win_chrome":
                driver = new ChromeDriver();
                break;
                //далее можно аналогичным образом расписать кейсы для других платформ и браузеров
            default:
                Assert.fail("Incorrect platform or browser name: " + PLATFORM_AND_BROWSER);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}
