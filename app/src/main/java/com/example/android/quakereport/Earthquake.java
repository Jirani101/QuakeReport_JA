package com.example.android.quakereport;

/**
 * Created by Alexander on 10/6/2017.
 */

public class Earthquake {
    /** Website URL of the earthquake */
    private String mUrl;
    private double magnitude;
    private String Mlocation;
    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url){
        this.magnitude= magnitude;
        Mlocation=location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;


    }



    public double getMagnitude() {
        return magnitude;
    }

    public String getMlocation() {
        return Mlocation;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }



    public String getUrl() {
    return mUrl;}
}
