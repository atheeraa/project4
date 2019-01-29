package com.example.project.project4;


public class Collection {

    String mSoundtrackName;
    int mPoster;

    public Collection(){

    }
    public Collection(int poster, String soundtrackName) {
        mPoster=poster;
        mSoundtrackName=soundtrackName;

    }

    public String getSoundTrackName() {
        return mSoundtrackName;
    }


    public int getPoster() {
        return mPoster;
    }


    }

