package Pages;

import Base.BasePage;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TicketPage extends BasePage {
    public TicketPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void TicketOperations(String gidis, String gelis) throws IOException {

        CSVWriter writecsv = new CSVWriter(new FileWriter("ucusyonubilgisi.csv"));
        String ucusyonu = appiumDriver.findElement(By.id("frDashboard_tvOneWay")).getText();
        System.out.println(ucusyonu);
        writecsv.writeNext(new String[]{ucusyonu});
        writecsv.close();

        clickId("frDashboard_tvOneWay");
        clickId("frDashboard_tvFromCode");
        setByIdclearsiz("frAirportSelection_etSearch", gidis);
        clickxpath("//android.widget.TextView[2]");
        clickId("frDashboard_tvToCode");
        setByIdclearsiz("frAirportSelection_etSearch", gelis);
        clickxpath("//android.widget.TextView[2]");

    }

    public void TicketDateAndAdult() throws IOException {
        clickId("frDashboard_rlDeparture");
        clickxpath("//android.view.ViewGroup[5]/android.widget.FrameLayout[6]/android.widget.TextView");
        clickId("frDashboard_btnDone");
        clickxpath("//android.view.ViewGroup[2]/android.widget.FrameLayout[7]/android.widget.TextView");
        clickId("frDashboard_btnSearch");

    }

    public int Biletlisteleme() {

        int value = getElementsByxpath("//android.view.ViewGroup").size();
        return value;
    }
}
