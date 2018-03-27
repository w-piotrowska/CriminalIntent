package com.example.weronika.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by weronika on 25.03.2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
