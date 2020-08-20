package Test;

import Base.BaseTest;
import Pages.HesCodePassportPage;
import com.thoughtworks.gauge.Step;

import java.io.IOException;

public class HesCodePassportTest extends BaseTest {


    @Step("Passport and HesCode")
    public void PassworAndHescodeTest() throws IOException {
        new HesCodePassportPage(appiumDriver).PassportChapter();
        new HesCodePassportPage(appiumDriver).HesCodeChapter();
    }
}
