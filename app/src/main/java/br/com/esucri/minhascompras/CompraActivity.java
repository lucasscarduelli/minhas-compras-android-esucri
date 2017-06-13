package br.com.esucri.minhascompras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.Toast;

import java.util.ArrayList;

import br.com.esucri.minhascompras.adapter.CompraAdapter;
import br.com.esucri.minhascompras.model.Compra;

public class CompraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra);

        TabHost tabHost = (TabHost) findViewById(R.id.tab_host);
        tabHost.setup();

        TabHost.TabSpec tabPendentes = tabHost.newTabSpec("tab_pendentes");
        tabPendentes.setContent(R.id.aba_pendentes);
        tabPendentes.setIndicator("Pendentes");

        TabHost.TabSpec tabRealizadas = tabHost.newTabSpec("tab_realizadas");
        tabRealizadas.setContent(R.id.aba_realizadas);
        tabRealizadas.setIndicator("Realizadas");

        tabHost.addTab(tabPendentes);
        tabHost.addTab(tabRealizadas);

        criarListaPendentes();
    }

    public void criarListaPendentes() {

        ArrayList<Compra> comprasPendentes = new ArrayList<>();
        for (int i=0; i < 20; i++) {
            Compra compra = new Compra();
            compra.setCompra("Compra " + (i+1));
            compra.setEstabelecimento("Estabelecimento " + (i+1));
            comprasPendentes.add(compra);
        }

        ListView listaComprasPendentes = (ListView) findViewById(R.id.lista_pendentes);
        listaComprasPendentes.setAdapter(new CompraAdapter(this, comprasPendentes));
        listaComprasPendentes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Posicao: " + position, Toast.LENGTH_LONG).show();
            }
        });

    }

}
