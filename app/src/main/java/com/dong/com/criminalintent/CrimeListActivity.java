package com.dong.com.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by 95 on 2015/11/22.
 */
public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
