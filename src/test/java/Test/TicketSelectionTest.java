package Test;

import Base.BaseTest;
import Pages.TicketSelectionPage;
import com.thoughtworks.gauge.Step;

public class TicketSelectionTest extends BaseTest {

@Step("Select economic flight")
    public void EconomicFlyChoose(){
     new TicketSelectionPage(appiumDriver).ChooseTicket();
}

}
