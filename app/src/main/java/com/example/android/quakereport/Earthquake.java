package com.example.android.quakereport;

/**
 * Created by user on 20-03-2018.
 */

public class Earthquake {

    private double mMagnitude;

    private String mLocation;

    private long mTimeInMilliseconds;


    public Earthquake(double magnitude, String location, long timeInMilliseconds){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }


    public double getMagnitude() { return mMagnitude; }

    public String getLocation() { return mLocation; }

    public long getTimeInMilliseconds() { return mTimeInMilliseconds; }
}
