package com.example.projetolista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnListaFixa = (Button) super.findViewById(R.id.btnListaFixa);
        Button btnListaAdapter = (Button) super.findViewById(R.id.btnListaAdapter);

        btnListaFixa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListaFixa.class);
                startActivity(intent);
            }
        });

        btnListaAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListaAdapter.class);
                startActivity(intent);
            }
        });
    }
}