package com.example.android.quakereport;

/**
 * Created by user on 20-03-2018.
 */

public class Earthquake {

    private String mMagnitude;

    private String mLocation;

    private long mTimeInMilliseconds;


    public Earthquake(String magnitude, String location, long timeInMilliseconds){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }


    public String getMagnitude() { return mMagnitude; }

    public String getLocation() { return mLocation; }

    public long getTimeInMilliseconds() { return mTimeInMilliseconds; }
}
