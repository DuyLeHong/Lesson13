package com.example.lesson13;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

public class Activity2 extends AppCompatActivity {

    //String lastLanguageCode = "en";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setLocale(Activity2.this, "vi");

        setContentView(R.layout.activity_2);

//        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (lastLanguageCode.equals("en")) {
//                    setLocale(Activity2.this, "vi");
//                    lastLanguageCode = "vi";
//                } else {
//                    setLocale(Activity2.this, "en");
//                    lastLanguageCode = "en";
//                }
//
//                setContentView(R.layout.activity_2);
//            }
//        });
    }


    public static void setLocale(Activity activity, String languageCode) {
        Locale locale = new Locale(languageCode);
        Locale.setDefault(locale);
        Resources resources = activity.getResources();
        Configuration config = resources.getConfiguration();
        config.setLocale(locale);
        resources.updateConfiguration(config, resources.getDisplayMetrics());
    }

}