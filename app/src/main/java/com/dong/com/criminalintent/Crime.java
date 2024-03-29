package com.dong.com.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by 95 on 2015/11/22.
 */
public class Crime {
    private UUID mID;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;


    public  Crime(){
        mID= UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getmID() {
        return mID;
    }


    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    @Override
    public String toString() {
        return this.getmTitle();
    }
}
