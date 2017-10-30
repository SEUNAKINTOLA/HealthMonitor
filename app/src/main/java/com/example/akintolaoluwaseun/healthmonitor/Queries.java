package com.example.akintolaoluwaseun.healthmonitor;

/**
 * Created by seun on 01/02/2017.
 */
public class Queries {
    // select all matches:
    // SQL:
    // select *
    public static String selectAll = "https://spreadsheets.google.com/tq?tqx=out:JSON&tq=select%20%2A&key=yourkey";

    // SQL:
    // select * where A < 100
    public static String selectAllLow = "https://spreadsheets.google.com/tq?tqx=out:JSON&tq=select%20*%20where%20D%20contains%20%27LOW%27&key=1tnPb3AnKOk_FvtU0c08noEHy9pvctTJJZ1jz2Ldlc_s";

    // SQL:
    // select * where 
    public static String selectAllHigh = "https://spreadsheets.google.com/tq?tqx=out:JSON&tq=select%20*%20where%20D%20contains%20%27HIGH%27&key=yourkey";
 
    // select * where  result is higher than a number
    public static String selectA = "https://spreadsheets.google.com/tq?tqx=out:JSON&tq=select%20%2A%20where%20%28%28D%20contains%20%27";

    // SQL:

    // A year
    public static String selectB = "https://spreadsheets.google.com/tq?tqx=out:JSON&tq=select%20%2A%20where";
}
