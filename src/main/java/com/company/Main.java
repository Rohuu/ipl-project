package com.company;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Match> allMatches = ReadCSVFiles.readMatchFile();
        List<Delivery> allDeliveries = ReadCSVFiles.readDeliveryFile();

//      Map<Integer, Integer> matchesPerYearOfAllTheYear=matchesPlayedPerYearAllTheYear(allMatches);
//      System.out.println(matchesPerYearOfAllTheYear);

        Map<String, Map<Integer, Integer>> matchesWonByAllTeamsAllYears = matchesWonByAllTeamsAllYears(allMatches);
        System.out.println(matchesWonByAllTeamsAllYears);

//          For the year 2016 get the extra runs conceded per team
//        Map<String,Integer> extraRunsConceded=extraRunsConcededPerTeam(allDeliveries,allMatches);
//        System.out.println(extraRunsConceded);
    }

//    private static Map<String, Integer> extraRunsConcededPerTeam(List<Delivery> allDelivery ,List<Match> allMatches) {
//        Map<String,Integer> extraRunsPerTeamMap=new HashMap<>();
//        for (Delivery delivery: allDelivery) {
//            if(match.getSeason()==2016){
////                extraRunsPerTeamMap.put(match.getTeam1(),match.get)
//            }
//        }

//    }


    private static Map<String, Map<Integer, Integer>> matchesWonByAllTeamsAllYears(List<Match> allMatches) {
        Map<String, Map<Integer, Integer>> teamsWinData = new HashMap<>();
        Set<String> teamSet = new HashSet<>();
        for (Match match : allMatches) {
            teamSet.add(match.getTeam1());
        }

        for (String team : teamSet) {
            Map<Integer, Integer> yearToWinMap = new HashMap<>();
            for (Match match : allMatches) {
                if (Objects.equals(match.getWinner(), team)) {
                    yearToWinMap.put(match.getSeason(), yearToWinMap.getOrDefault(match.getSeason(), 0) + 1);
                }
            }
            teamsWinData.put(team,yearToWinMap);
        }
        return teamsWinData;
    }

    private static Map<Integer, Integer> matchesPlayedPerYearAllTheYear(List<Match> allMatches) {
        Map<Integer, Integer> freqMatches = new HashMap<>();
        for (Match match : allMatches) {
            freqMatches.put(match.getSeason(), freqMatches.getOrDefault(match.getSeason(), 0) + 1);
        }
        return freqMatches;
    }

}
