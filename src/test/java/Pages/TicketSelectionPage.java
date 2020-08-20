package Pages;

import Base.BasePage;
import Base.BaseTest;
import io.appium.java_client.AppiumDriver;

public class TicketSelectionPage extends BasePage {

    public TicketSelectionPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    public void ChooseTicket(){
      clickxpath("//android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]");
      clickxpath("//android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup");
      clickId("frFlightSearch_btnContinue");

    }
}
