package com.example.spinner;

public class countryitem {
    private String mCountryName;
    private int mFlagImage;
    public countryitem(String countryName, int flagImage){


        mCountryName = countryName;
        mFlagImage = flagImage;
    }
    public  String  getCountryName() {
        return mCountryName;
    }

    public int getFlagImage() {
        return mFlagImage;
    }
}
