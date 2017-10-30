package com.example.akintolaoluwaseun.healthmonitor;

/**
 * Created by seun on 27/01/2017.
 */
public class Match {

    private String date,time,resultss, comment,homeTeam, awayTeam;


    public Match(String date, String time,String resultss, String comment) {
        this.setDate(date);
        this.setTime(time);
        this.setResult(resultss);
        this.setComment(comment);
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getResult() {
        return resultss;
    }

    public void setResult(String result) {
        this.resultss = result;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
