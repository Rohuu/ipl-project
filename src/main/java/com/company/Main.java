package com.company;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Match> allMatches = ReadCSVFiles.readMatchFile();
        Map<Integer, Integer> matchesPerYearOfAllTheYear=matchesPlayedPerYearAllTheYear(allMatches);
        System.out.println(matchesPerYearOfAllTheYear);
    }

    private static Map<Integer, Integer> matchesPlayedPerYearAllTheYear(List<Match> allMatches) {
        Map<Integer,Integer> freqMatches=new HashMap<>();
        for (Match match:allMatches) {
            freqMatches.put(match.getSeason(),freqMatches.getOrDefault(match.getSeason(),0)+1);
        }
        return freqMatches;
    }
}
