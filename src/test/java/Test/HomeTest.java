package Test;

import Base.BaseTest;
import Pages.HomePage;
import com.thoughtworks.gauge.Step;

import java.io.IOException;

public class HomeTest extends BaseTest {

    @Step("Start")
    public void Home1() throws InterruptedException, IOException {
        new HomePage(appiumDriver).HomeOperations();
    }



}
