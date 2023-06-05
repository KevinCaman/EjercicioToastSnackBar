package com.example.ejerciciotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn;
    ListView lista;
    List<String> cursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(this);
        lista=findViewById(R.id.listView);

        cursos=new ArrayList<>();
        cursos.add("Arquitectura de Computadoras");
        cursos.add("Desarrollo de Aplicaciones para Móviles");
        cursos.add("Sistemas Operativos");
        cursos.add("SCRUM");
        cursos.add("Sistemas de Información");
        cursos.add("Simulación de Sistemas");
        cursos.add("Análisis y Diseño de Sistemas");

        ArrayAdapter adaptadorcursos=new ArrayAdapter(this, android.R.layout.simple_list_item_1,cursos);
        lista.setAdapter(adaptadorcursos);
    }
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn){
            Toast.makeText(this, "Matriculo completa", Toast.LENGTH_SHORT).show();
        }
    }

}