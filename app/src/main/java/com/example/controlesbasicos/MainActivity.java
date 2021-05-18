package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    //Declaracion de variables
        ToggleButton tbApagado;
        Switch swApagado;
        Spinner spBasico;
        RadioButton rbMasculino, rbFemenino;
        FloatingActionButton fabBasico;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //escucha de variables
        tbApagado = findViewById(R.id.tbApagado);
        swApagado = findViewById(R.id.swApagado);
        spBasico = findViewById(R.id.spBasico);
        //cargar datos al Spinner
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource( this,R.array.paises, android.R.layout.simple_spinner_dropdown_item);
            spBasico.setAdapter(adapter);
        rbMasculino = findViewById(R.id.rbMasculino);
        rbFemenino = findViewById(R.id.rbFemenino);
        fabBasico = findViewById(R.id.fabBasico);
        //evento del toggle button
        tbApagado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tbApagado.isChecked())
                    Toast.makeText(MainActivity.this, "Presiono prendido", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Presiono Apagado", Toast.LENGTH_SHORT).show();
                // 1:17 quedo el video

            }
        });
        swApagado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(swApagado.isChecked())
                    Toast.makeText(MainActivity.this, "Presiono prendido", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Presiono apagado", Toast.LENGTH_SHORT).show();
            }
        });
        // evento de los radio Button

        rbMasculino.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "seleccion masculino ",Toast.LENGTH_SHORT).show();
            }
        });
        rbFemenino.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "seleccion femenino ",Toast.LENGTH_SHORT).show();
            }
        });
        //como funcionan los items dentro de una lista

        spBasico.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "posicion: "+ String.valueOf(position),Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MainActivity.this, "no se selecciono nada ",Toast.LENGTH_SHORT).show();
            }
        });

    }
}