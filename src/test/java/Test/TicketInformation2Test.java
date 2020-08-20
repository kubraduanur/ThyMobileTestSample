package Test;

import Base.BaseTest;
import Pages.TicketInformation1Page;
import Pages.TicketInformation2Page;
import com.thoughtworks.gauge.Step;

import java.io.IOException;

public class TicketInformation2Test extends BaseTest {

    @Step("Information2")
    public void Informationtest() throws IOException, InterruptedException {
        new TicketInformation2Page(appiumDriver).informationticketName();
        new TicketInformation2Page(appiumDriver).informationticketSurname();
        new TicketInformation2Page(appiumDriver).MrorMs();
        new TicketInformation2Page(appiumDriver).BirtDay();
        new TicketInformation2Page(appiumDriver).email();
        new TicketInformation2Page(appiumDriver).membershipnumber();
        new TicketInformation2Page(appiumDriver).Tc();

    }
}
