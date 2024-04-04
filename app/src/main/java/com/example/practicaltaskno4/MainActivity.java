package com.example.practicaltaskno4;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.RadioGroup;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStepAge(View view){
        EditText _name = findViewById(R.id.NameInput);
        String strName = _name.getText().toString();

        setContentView(R.layout.step_2);

        TextView tv =findViewById(R.id.textView);
        tv.setText("Очень приятно познакомиться " + strName + "\nМеня зовут Умный.\nСколько тебе лет?");
    }

    public void onStepSex(View view){
        EditText _age = findViewById(R.id.Age);
        String strAge = _age.getText().toString();

        setContentView(R.layout.step_3);
        TextView tv =findViewById(R.id.textView);
        tv.setText("Ничего себе ты большой, целых " + strAge + " лет\nКакого ты пола?");
    }

    public void onStepEmail(View view){
        setContentView(R.layout.step_4);
    }

    public void OnStepFive(View view){
     setContentView(R.layout.step_5);
    }
}