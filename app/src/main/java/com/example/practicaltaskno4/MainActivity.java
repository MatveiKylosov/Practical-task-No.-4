package com.example.practicaltaskno4;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.RadioGroup;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStepName(View view){
        setContentView(R.layout.activity_main);
        updatePagination(1);
    }

    public void onStepAge(View view){
        EditText _name = findViewById(R.id.NameInput);
        String strName = _name.getText().toString();

        setContentView(R.layout.step_2);

        TextView tv =findViewById(R.id.textView);
        tv.setText("Очень приятно познакомиться " + strName + "\nМеня зовут Умный.\nСколько тебе лет?");
        updatePagination(2);
    }

    public void onStepSex(View view){
        EditText _age = findViewById(R.id.Age);
        String strAge = _age == null ? "?" : _age.getText().toString();

        setContentView(R.layout.step_3);
        TextView tv =findViewById(R.id.textView);
        tv.setText("Ничего себе ты большой, целых " + strAge + " лет\nКакого ты пола?");
        updatePagination(3);
    }

    public void onStepEmail(View view){
        setContentView(R.layout.step_4);
        updatePagination(4);
    }

    public void OnStepFive(View view){
     setContentView(R.layout.step_5);
        updatePagination(5);
    }

    private void updatePagination(int currentPage) {
        Button page1 = findViewById(R.id.page1);
        Button page2 = findViewById(R.id.page2);
        Button page3 = findViewById(R.id.page3);
        Button page4 = findViewById(R.id.page4);
        Button page5 = findViewById(R.id.page5);

        Button[] pages = new Button[]{page1, page2, page3, page4, page5};

        for (int i = 0; i < pages.length; i++) {
            if (i == currentPage - 1) {
                pages[i].setText("●");
            } else {
                pages[i].setText("○");
            }
        }
    }
}