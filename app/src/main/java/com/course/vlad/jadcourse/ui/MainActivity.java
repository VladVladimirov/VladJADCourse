package com.course.vlad.jadcourse.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.course.vlad.jadcourse.R;

/**
 * Created by Vlad on 9/24/2016.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        String appName = getString(R.string.app_name);

    }
}
