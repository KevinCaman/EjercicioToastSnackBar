package com.example.ejerciciosnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btn1){
            Snackbar.make(v, "Mensaje 1", Snackbar.LENGTH_LONG).show();
        }
        if (v.getId()==R.id.btn2){
            Snackbar.make(v, "Mensaje 2", Snackbar.LENGTH_SHORT).show();
        }
        if (v.getId()==R.id.btn3){
            Snackbar.make(v, "Mensaje 3", Snackbar.LENGTH_INDEFINITE).show();
        }
    }
}