package com.diki.validationutils.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.amlanjit.validationutils.R;

import in.diki.validation.ValidationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ValidationUtils validationUtils = new ValidationUtils();
    }
}
