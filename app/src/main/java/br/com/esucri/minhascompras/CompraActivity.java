package br.com.esucri.minhascompras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.widget.TabHost;
=======
>>>>>>> 655521d344dc2a25a4238ef8354148c075a1adbe

public class CompraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra);
<<<<<<< HEAD

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

    }


=======
    }
>>>>>>> 655521d344dc2a25a4238ef8354148c075a1adbe
}
