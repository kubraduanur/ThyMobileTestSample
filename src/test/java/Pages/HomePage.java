package Pages;

import Base.BasePage;
import com.opencsv.CSVReader;
import io.appium.java_client.AppiumDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {


    public HomePage(AppiumDriver appiumDriver) {
        super(appiumDriver);

    }

   public void HomeOperations() throws IOException {
       appiumDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       clickId("frPrivacy_btnAccept");
       clickxpath("//android.widget.ImageButton[@content-desc=\"Turkish Airlines\"]");
       clickxpath("//android.widget.RelativeLayout[3]");


       }
   }




