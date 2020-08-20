package Pages;

import Base.BasePage;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import io.appium.java_client.AppiumDriver;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TicketInformation2Page extends BasePage {


    public TicketInformation2Page(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void informationticketName() throws IOException, InterruptedException {
        clickxpath("//android.widget.RelativeLayout[4]/android.widget.RelativeLayout");
        clickxpath("//android.widget.LinearLayout[1]/android.widget.ExpandableListView/android.widget.RelativeLayout[5]");
        CSVWriter writecsv = new CSVWriter(new FileWriter("bilgiler.csv"));
        String name = "Hatice";
        System.out.println(name);
        writecsv.writeNext(new String[]{name});
        writecsv.close();
        Thread.sleep(3000);

        CSVReader readcsv = new CSVReader(new FileReader("bilgiler.csv"));
        String[] nextLine;
        while ((nextLine = readcsv.readNext()) != null) {

            System.out.println(nextLine);


            setById("frAddNewPassenger_etAddName", nextLine[0]);
        }

    }

    public void informationticketSurname() throws IOException, InterruptedException {
        CSVWriter writecsv = new CSVWriter(new FileWriter("bilgiler.csv"));
        String surname = "MUSLU";
        System.out.println(surname);
        writecsv.writeNext(new String[]{surname});
        writecsv.close();
        Thread.sleep(3000);

        CSVReader readcsv = new CSVReader(new FileReader("bilgiler.csv"));
        String[] nextLine;
        while ((nextLine = readcsv.readNext()) != null) {

            System.out.println(nextLine);

            setById("frAddNewPassenger_etAddLastName", nextLine[0]);
        }
    }

    public void MrorMs() {
        clickxpath("//android.widget.CheckBox[2]");
        clickId("frAddNewPassenger_etAddDateOfBirth");

    }

    public void BirtDay() {
        clickxpath("//android.widget.ImageView[2]");
    }

    public void email() throws IOException {
        CSVWriter writecsv = new CSVWriter(new FileWriter("bilgiler.csv"));
        String email = "haticemuslu@gmail.com";
        System.out.println(email);
        writecsv.writeNext(new String[]{email});
        writecsv.close();

        CSVReader readcsv = new CSVReader(new FileReader("bilgiler.csv"));
        String[] nextLine;
        while ((nextLine = readcsv.readNext()) != null) {

            System.out.println(nextLine);

            setById("frAddNewPassenger_etAddEmail", nextLine[0]);
        }
    }

    public void membershipnumber() throws IOException {
        CSVWriter writecsv = new CSVWriter(new FileWriter("bilgiler.csv"));
        String number = "8888444";
        System.out.println(number);
        writecsv.writeNext(new String[]{number});
        writecsv.close();

        CSVReader readcsv = new CSVReader(new FileReader("bilgiler.csv"));
        String[] nextLine;
        while ((nextLine = readcsv.readNext()) != null) {

            System.out.println(nextLine);

            setById("frAddNewPassenger_etAddFlyerNumber", nextLine[0]);
        }
    }

    public void Tc() {
        clickxpath("//android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.CheckBox[2]");
        clickId("frAddNewPassenger_btnAddPassenger");
        clickId("frPickPassenger_btnContinue");
    }




}