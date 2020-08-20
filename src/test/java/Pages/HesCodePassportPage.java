package Pages;

import Base.BasePage;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import io.appium.java_client.AppiumDriver;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HesCodePassportPage extends BasePage {
    public HesCodePassportPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void PassportChapter() throws IOException {

        CSVWriter writecsv = new CSVWriter(new FileWriter("bilgilerpassport.csv"));
        String passportno = "129845";
        System.out.println(passportno);
        writecsv.writeNext(new String[]{passportno});
        writecsv.close();


        CSVReader readcsv = new CSVReader(new FileReader("bilgilerpassport.csv"));
        String[] nextLine;
        while ((nextLine = readcsv.readNext()) != null) {

            System.out.println(nextLine);

            setById("itemPassengerHes_etDocId", nextLine[0]);
        }
    }

    public void HesCodeChapter() throws IOException {

        CSVWriter writecsv = new CSVWriter(new FileWriter("bilgilerhescode.csv"));
        String hescode = "Ea1045";
        System.out.println(hescode);
        writecsv.writeNext(new String[]{hescode});
        writecsv.close();


        CSVReader readcsv = new CSVReader(new FileReader("bilgilerhescode.csv"));
        String[] nextLine;
        while ((nextLine = readcsv.readNext()) != null) {

            System.out.println(nextLine);


            setById("itemPassengerHes_etHesCode", nextLine[0]);
        }
    }
}