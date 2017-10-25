package com.sicsha.Login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.sicsha.R;

import butterknife.ButterKnife;

/**
 * Created by kiyoungLee on 2017-10-19.
 */

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_act);
        ButterKnife.bind(this);
    }
}
