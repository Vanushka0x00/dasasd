package com.ivan.hvhhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button_exam, button_oneWays, button_aboutCheats, button_forums, button_bigNames;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Init buttons
        button_exam = findViewById(R.id.button_exam);
        button_oneWays = findViewById(R.id.button_oneways);
        button_aboutCheats = findViewById(R.id.button_aboutCheats);
        button_forums = findViewById(R.id.button_Forums);
        button_bigNames = findViewById(R.id.button_bignames);
        // end init buttons

        clickButtonListeners(button_exam);


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

                        break;
                    case R.id.button_aboutCheats:

                        break;
                    case R.id.button_Forums:

                        break;
                    case R.id.button_bignames:

                        break;
                }

            }
        });



    }




}