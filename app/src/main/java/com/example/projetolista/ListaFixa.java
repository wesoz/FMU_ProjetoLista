package com.example.projetolista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaFixa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_fixa);

        ArrayList itens = new ArrayList();
        itens.add("teste 1");
        itens.add("aaaaaa 22222");

        ListView minhaLista = (ListView) super.findViewById(R.id.minhaLista);

        ArrayAdapter adaptador = new ArrayAdapter<String>(ListaFixa.this, android.R.layout.simple_list_item_1, itens);

        minhaLista.setAdapter(adaptador);
    }
}