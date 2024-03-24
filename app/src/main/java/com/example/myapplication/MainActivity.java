package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.logging.ErrorManager;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
     private  Button   button, button2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView2);
        editText= findViewById(R.id.editTextText);
        button2=findViewById(R.id.butto2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Editable text= editText.getText();
                textView.setText(text);
                Toast.makeText(MainActivity.this, "Error Code", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    public void mytoast(){

        LayoutInflater li= getLayoutInflater();
        View layout= li.inflate(R.layout.customtost,(ViewGroup) findViewById(R.id.toastid));
        Toast toast= new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setView(layout);
        toast.show();

    }

}