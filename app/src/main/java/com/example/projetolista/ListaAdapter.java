package com.example.projetolista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaAdapter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_adapter);

        ArrayList<Item> itens = this.adicionarItens();
        ListView minhaLista = (ListView) super.findViewById(R.id.minhaLista);

        ArrayAdapter adaptador = new ItemAdapter(this, itens);

        minhaLista.setAdapter(adaptador);
    }

    private ArrayList<Item> adicionarItens() {
        ArrayList<Item> itens = new ArrayList<>();
        itens.add(new Item("Usuarios", "Alunos", 0));
        itens.add(new Item("Financeiro", "Empréstimos", 0));
        itens.add(new Item("Caneta", "Bic", 0));
        itens.add(new Item("Usuarios", "Alunos", 0));
        return itens;
    }
}