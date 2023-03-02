package com.example.task_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text1 = findViewById(R.id.textView);

        Bundle args = getIntent().getExtras();
        String language = args.getString("lang");
        String firstName = args.getString("fName");
        String lastName = args.getString("lName");

        switch (language){
            case "Русский":
                text1.setText("Добрый день, " + firstName + " " + lastName + ", мы рады приветствовать вас в нашем приложении");
                break;
            case "English":
                text1.setText("Good afternoon, " + firstName + " " + lastName + ", we are glad to welcome your in our application");
                break;
            default:
                text1.setText("Вернитесь и выберете язык");
        }
    }
}