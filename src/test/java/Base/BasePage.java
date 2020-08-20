package Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.List;


public class BasePage {

    public static AppiumDriver appiumDriver;

    public BasePage(AppiumDriver appiumDriver){

        this.appiumDriver=appiumDriver;
    }

    public void setById(String idsend,String information){
        appiumDriver.findElement(By.id(idsend)).clear();
        appiumDriver.findElement(By.id(idsend)).sendKeys(information);



    }
    public void setByIdclearsiz(String idsend,String information){

        appiumDriver.findElement(By.id(idsend)).sendKeys(information);

    }
    public void clickId(String idclick){

        appiumDriver.findElement(By.id(idclick)).click();
    }
    //path=yol
    public void clickxpath(String yol){

        appiumDriver.findElement(By.xpath(yol)).click();
    }

    public void setByXpath(String id2send,String information2)
    {
        appiumDriver.findElement(By.xpath(id2send)).clear();
        appiumDriver.findElement(By.xpath(id2send)).sendKeys(information2);
    }
    public void clickcsselector(String yol1){

        appiumDriver.findElement(By.cssSelector(yol1)).click();
    }
    public void setByselector(String id3send,String information3)
    {
        appiumDriver.findElement(By.cssSelector(id3send)).clear();
        appiumDriver.findElement(By.cssSelector(id3send)).sendKeys(information3);
    }
    public List<MobileElement> getElementsByxpath(String value){
        return appiumDriver.findElements(By.xpath(value));
    }
}

