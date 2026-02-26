package pageObjects;

import driver.DriverFactory;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

public class Base_PO {
 public Base_PO(){

 }

 public WebDriver getDriver()
 {
     return DriverFactory.getDriver();
 }

    private static final RandomStringUtils RNG = RandomStringUtils.secure();
    public String generateRandomNumber(int length){
        return RNG.nextNumeric(length);
    }
    public String generateRandomString(int length){
        return RNG.nextAlphanumeric(length);
    }

    public void navigateToUrl (String url){
        getDriver().get(url);
    }
}
