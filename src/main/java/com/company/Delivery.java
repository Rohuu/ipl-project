package com.company;

public class Delivery {
private int match_id;
private int inning;
private String batting_team;
private String bowling_team;
private int over;
private int ball;
private String batsman;
private String non_striker;
private String bowler;
private boolean is_super_over;
private int wide_runs;
private int bye_runs;
private int legbye_runs;
private int noball_runs;
private int penalty_runs;
private int batsman_runs;
private int extra_runs;
private int total_runs;
private String player_dismissed;
private String dismissal_kind;
private String fielder;

    public Delivery(int match_id, int inning, String batting_team, String bowling_team, int over, int ball, String batsman, String non_striker, String bowler, boolean is_super_over, int wide_runs, int bye_runs, int legbye_runs, int noball_runs, int penalty_runs, int batsman_runs, int extra_runs, int total_runs, String player_dismissed, String dismissal_kind, String fielder) {
        this.match_id = match_id;
        this.inning = inning;
        this.batting_team = batting_team;
        this.bowling_team = bowling_team;
        this.over = over;
        this.ball = ball;
        this.batsman = batsman;
        this.non_striker = non_striker;
        this.bowler = bowler;
        this.is_super_over = is_super_over;
        this.wide_runs = wide_runs;
        this.bye_runs = bye_runs;
        this.legbye_runs = legbye_runs;
        this.noball_runs = noball_runs;
        this.penalty_runs = penalty_runs;
        this.batsman_runs = batsman_runs;
        this.extra_runs = extra_runs;
        this.total_runs = total_runs;
        this.player_dismissed = player_dismissed;
        this.dismissal_kind = dismissal_kind;
        this.fielder = fielder;
    }

    public Delivery(String[] values) {
        this.match_id = Integer.parseInt(values[0]);
        this.inning = Integer.parseInt(values[1]);
        this.batting_team = values[2];
        this.bowling_team = values[3];
        this.over = Integer.parseInt(values[4]);
        this.ball = Integer.parseInt(values[5]);
        this.batsman = values[6];
        this.non_striker = values[7];
        this.bowler = values[8];
        this.is_super_over = Boolean.getBoolean(values[9]);
        this.wide_runs = Integer.parseInt(values[10]);
        this.bye_runs =Integer.parseInt(values[11]);;
        this.legbye_runs = Integer.parseInt(values[12]);;
        this.noball_runs = Integer.parseInt(values[13]);;
        this.penalty_runs = Integer.parseInt(values[14]);;
        this.batsman_runs = Integer.parseInt(values[15]);
        this.extra_runs = Integer.parseInt(values[16]);
        this.total_runs = Integer.parseInt(values[17]);;
        this.player_dismissed = values[18];
        this.dismissal_kind = values[19];
        this.fielder = values[20];
    }

    public int getMatch_id() {
        return match_id;
    }

    public int getInning() {
        return inning;
    }

    public String getBatting_team() {
        return batting_team;
    }

    public String getBowling_team() {
        return bowling_team;
    }

    public int getOver() {
        return over;
    }

    public int getBall() {
        return ball;
    }

    public String getBatsman() {
        return batsman;
    }

    public String getNon_striker() {
        return non_striker;
    }

    public String getBowler() {
        return bowler;
    }

    public boolean isIs_super_over() {
        return is_super_over;
    }

    public int getWide_runs() {
        return wide_runs;
    }

    public int getBye_runs() {
        return bye_runs;
    }

    public int getLegbye_runs() {
        return legbye_runs;
    }

    public int getNoball_runs() {
        return noball_runs;
    }

    public int getPenalty_runs() {
        return penalty_runs;
    }

    public int getBatsman_runs() {
        return batsman_runs;
    }

    public int getExtra_runs() {
        return extra_runs;
    }

    public int getTotal_runs() {
        return total_runs;
    }

    public String getPlayer_dismissed() {
        return player_dismissed;
    }

    public String getDismissal_kind() {
        return dismissal_kind;
    }

    public String getFielder() {
        return fielder;
    }

    public void setMatch_id(int match_id) {
        this.match_id = match_id;
    }

    public void setInning(int inning) {
        this.inning = inning;
    }

    public void setBatting_team(String batting_team) {
        this.batting_team = batting_team;
    }

    public void setBowling_team(String bowling_team) {
        this.bowling_team = bowling_team;
    }

    public void setOver(int over) {
        this.over = over;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    public void setBatsman(String batsman) {
        this.batsman = batsman;
    }

    public void setNon_striker(String non_striker) {
        this.non_striker = non_striker;
    }

    public void setBowler(String bowler) {
        this.bowler = bowler;
    }

    public void setIs_super_over(boolean is_super_over) {
        this.is_super_over = is_super_over;
    }

    public void setWide_runs(int wide_runs) {
        this.wide_runs = wide_runs;
    }

    public void setBye_runs(int bye_runs) {
        this.bye_runs = bye_runs;
    }

    public void setLegbye_runs(int legbye_runs) {
        this.legbye_runs = legbye_runs;
    }

    public void setNoball_runs(int noball_runs) {
        this.noball_runs = noball_runs;
    }

    public void setPenalty_runs(int penalty_runs) {
        this.penalty_runs = penalty_runs;
    }

    public void setBatsman_runs(int batsman_runs) {
        this.batsman_runs = batsman_runs;
    }

    public void setExtra_runs(int extra_runs) {
        this.extra_runs = extra_runs;
    }

    public void setTotal_runs(int total_runs) {
        this.total_runs = total_runs;
    }

    public void setPlayer_dismissed(String player_dismissed) {
        this.player_dismissed = player_dismissed;
    }

    public void setDismissal_kind(String dismissal_kind) {
        this.dismissal_kind = dismissal_kind;
    }

    public void setFielder(String fielder) {
        this.fielder = fielder;
    }
}
