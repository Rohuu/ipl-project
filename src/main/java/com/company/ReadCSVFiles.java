package com.company;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadCSVFiles {
    static void readDeliveryFile() throws IOException {
        String file = "src/main/resources/deliveries.csv";
        BufferedReader reader = null;
        String line = "";
        List<List<String>> records = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                records.add(Arrays.asList(row));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
        System.out.println(records.size());
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
