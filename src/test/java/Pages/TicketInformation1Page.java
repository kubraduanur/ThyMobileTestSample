package Pages;

import Base.BasePage;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class TicketInformation1Page extends BasePage {


    public TicketInformation1Page(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void informationticketName() throws IOException, InterruptedException {
        CSVWriter writecsv = new CSVWriter(new FileWriter("bilgiler.csv"));
        String name = "Kübra";
        System.out.println(name);
        writecsv.writeNext(new String[]{name});
        writecsv.close();
        Thread.sleep(3000);

        CSVReader readcsv = new CSVReader(new FileReader("bilgiler.csv"));
        String[] nextLine;
        while ((nextLine = readcsv.readNext()) != null) {

            System.out.println(nextLine);

            clickId("frPickPassengerlistitemadd_root");
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
        String email = "kubraduanur@gmail.com";
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
        String number = "55566666";
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
    }




}