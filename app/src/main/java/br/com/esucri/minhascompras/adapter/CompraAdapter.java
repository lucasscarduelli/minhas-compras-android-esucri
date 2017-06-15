package br.com.esucri.minhascompras.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.esucri.minhascompras.R;
import br.com.esucri.minhascompras.model.Compra;

public class CompraAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Compra> lista;

    public CompraAdapter(Context context, ArrayList<Compra> lista) {
        this.context = context;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return this.lista.size();
    }

    @Override
    public Compra getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Compra compra = this.getItem(position);
        View layout;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            layout = inflater.inflate(R.layout.lista_compra, null);
        } else {
            layout = convertView;
        }

        TextView textoCompra = (TextView) layout.findViewById(R.id.texto_compra);
        textoCompra.setText(compra.getCompra());

        TextView textoEstabelecimento = (TextView) layout.findViewById(R.id.texto_estabelecimento);
        textoEstabelecimento.setText(compra.getEstabelecimento());

        return layout;
    }
}
