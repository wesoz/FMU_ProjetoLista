package com.example.projetolista;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    private final Context context;
    private final ArrayList<Item> elementos;

    public ItemAdapter(Context context, ArrayList<Item> elementos) {
        super(context, R.layout.activity_lista_adapter, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(this.context);
        convertView = inflater.inflate(R.layout.item, parent, false);
        Item i = this.elementos.get(position);
        TextView txtTitulo = (TextView) convertView.findViewById(R.id.txtTitulo);
        TextView txtSubtitulo = (TextView) convertView.findViewById(R.id.txtSubtitulo);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);

        return super.getView(position, convertView, parent);
    }
}
