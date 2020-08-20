package Test;

import Base.BaseTest;
import Pages.TicketPage;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

import java.io.IOException;

public class TicketTest extends BaseTest {

    @Step({"Select for ticket transactions going: <gidis> coming: <varis>"})
    public void TicketChapter(String gidis,String varis) throws IOException {
        new TicketPage(appiumDriver).TicketOperations(gidis,varis);
        new TicketPage(appiumDriver).TicketDateAndAdult();
        int Listsize=new TicketPage(appiumDriver).Biletlisteleme();
        Assert.assertTrue(Listsize > 0);
    }



}
