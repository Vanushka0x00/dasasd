package com.ivan.hvhhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.ivan.hvhhelper.AboutCheat.AboutCheatsActivity;
import com.ivan.hvhhelper.Bignames.BignamesActivity;
import com.ivan.hvhhelper.Exam.ExamActivity;
import com.ivan.hvhhelper.Forums.ForumsActivity;
import com.ivan.hvhhelper.OneWays.OneWaysActivity;

public class MainActivity extends AppCompatActivity {

    Button button_exam, button_oneWays, button_aboutCheats, button_forums, button_bigNames;
    ImageButton settingsButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Init buttons
        button_exam = findViewById(R.id.button_exam);
        clickButtonListeners(button_exam);
        button_oneWays = findViewById(R.id.button_oneways);
        clickButtonListeners(button_oneWays);
        button_aboutCheats = findViewById(R.id.button_aboutCheats);
        clickButtonListeners(button_aboutCheats);
        button_forums = findViewById(R.id.button_Forums);
        clickButtonListeners(button_forums);
        button_bigNames = findViewById(R.id.button_bignames);
        clickButtonListeners(button_bigNames);

        settingsButton = findViewById(R.id.SettingsButton);
        // end init buttons
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentOneWaysActivity = new Intent(MainActivity.this, OneWaysActivity.class);
                startActivity(intentOneWaysActivity);
            }
        });




    }

    private void clickButtonListeners(Button button){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (button.getId()) {
                    case R.id.button_exam:
                        Intent intentExamActivity = new Intent(MainActivity.this, ExamActivity.class);
                        startActivity(intentExamActivity);
                        break;
                    case R.id.button_oneways:
                        Intent intentOneWaysActivity = new Intent(MainActivity.this, OneWaysActivity.class);
                        startActivity(intentOneWaysActivity);
                        break;
                    case R.id.button_aboutCheats:
                        Intent intentAboutCheatsActivity = new Intent(MainActivity.this, AboutCheatsActivity.class);
                        startActivity(intentAboutCheatsActivity);
                        break;
                    case R.id.button_Forums:
                        Intent intentForumsActivity = new Intent(MainActivity.this, ForumsActivity.class);
                        startActivity(intentForumsActivity);
                        break;
                    case R.id.button_bignames:
                        Intent intentBignamesActivity = new Intent(MainActivity.this, BignamesActivity.class);
                        startActivity(intentBignamesActivity);
                        break;
                }

            }
        });

    }




}