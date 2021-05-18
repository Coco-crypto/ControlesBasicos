package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListasActivity extends AppCompatActivity {
      //declaracion global de controles

    ListView lsvDatos;
    Button btnPaises, btnPlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listas);
        //13 :36 del video

        btnPaises = findViewById(R.id.btnPaises);
        btnPlanetas = findViewById(R.id.btnPlanetas);
        lsvDatos = (ListView)  findViewById(R.id.lsvDatos);

        //cargar la lista paises
        btnPaises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Paises();
            }
        });
        btnPlanetas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Planetas();
            }
        });
    }

    private void Planetas() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(ListasActivity.this,R.array.planetas,android.R.layout.simple_list_item_1);
        lsvDatos.setAdapter(adapter);
    }


    private void Paises() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(ListasActivity.this,R.array.paises,android.R.layout.simple_list_item_1);
        lsvDatos.setAdapter(adapter);
    }
}