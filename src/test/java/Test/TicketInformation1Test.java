package Test;

import Base.BaseTest;
import Pages.TicketInformation1Page;
import com.thoughtworks.gauge.Step;

import java.io.IOException;

public class TicketInformation1Test extends BaseTest {

    @Step("Information1")
    public void Informationtest() throws IOException, InterruptedException {
        new TicketInformation1Page(appiumDriver).informationticketName();
        new TicketInformation1Page(appiumDriver).informationticketSurname();
        new TicketInformation1Page(appiumDriver).MrorMs();
        new TicketInformation1Page(appiumDriver).BirtDay();
        new TicketInformation1Page(appiumDriver).email();
        new TicketInformation1Page(appiumDriver).membershipnumber();
        new TicketInformation1Page(appiumDriver).Tc();

    }


}
