package com.company;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVFiles {
    static List<Delivery> readDeliveryFile() throws IOException {
        String file = "src/main/resources/deliveries.csv";
        List<Delivery> deliveries=new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader(file))) {
            String[] values;
            csvReader.readNext();
            while ((values = csvReader.readNext()) != null) {
                Delivery delivery = new Delivery(values);
                deliveries.add(delivery);
            }
        }
        catch (CsvValidationException e){
                e.printStackTrace();
            }
        return deliveries;
    }

    static List<Match> readMatchFile() throws IOException {
        String file = "src/main/resources/matches.csv";

        List<Match> matches = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader(file))){
            String[] values;
            csvReader.readNext();
            while ((values = csvReader.readNext()) != null) {
                Match match = new Match(values);
                matches.add(match);
            }
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }
        return matches;
    }
}
