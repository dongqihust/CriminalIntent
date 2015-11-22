package com.dong.com.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by 95 on 2015/11/22.
 */
public class CrimeLab {
    private ArrayList<Crime> mCrimes;
    private static CrimeLab sCrimeLab;
    private Context mAppContext;
    private CrimeLab(Context appContext){
        mAppContext = appContext;
        mCrimes = new ArrayList<>();
//        for(int i=0;i<120;i++){
//            Crime crime = new Crime();
//            crime.setmTitle("Crime # " + i );
//            crime.setmSolved(i%2==0);
//            mCrimes.add(crime);
//        }
    }

    public static CrimeLab get(Context c){

             if(sCrimeLab == null){
                    synchronized (CrimeLab.class){
                        if(sCrimeLab == null){
                            sCrimeLab = new CrimeLab(c.getApplicationContext());
                        }
                    }
             }
        return sCrimeLab;
    }

    public ArrayList<Crime> getmCrimes(){
        return mCrimes;
    }

    public Crime getCrime(UUID uuidd){
        for(Crime c : mCrimes){
            if(c.getmID().equals(uuidd)){
            return c;
            }
        }
        return null;
    }

    public void addCrime(Crime crime) {
        mCrimes.add(crime);
    }
}
