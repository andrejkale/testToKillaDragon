package Helpers;

import Common.Constants;
import Pages.BasePage;

import java.util.concurrent.TimeUnit;

public class CommonHelper extends BasePage {
    public void appOut(){
        driver.quit();
    }
    public void appOutAfterTest(){driver.get(Constants.BASE_URL);}
    public void appBefore() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
