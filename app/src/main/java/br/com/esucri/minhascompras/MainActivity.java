package br.com.esucri.minhascompras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button botaoProduto;
    Button botaoEstabelecimento;
    Button botaoCompra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoProduto = (Button) findViewById(R.id.botao_produto);
        botaoEstabelecimento = (Button) findViewById(R.id.botao_estabelecimento);
        botaoCompra = (Button) findViewById(R.id.botao_compra);
    }

    public void abrirProduto(View view) {
        Intent intent = new Intent(this, ProdutoActivity.class);
        startActivity(intent);
    }

    public void abrirEstabelecimento(View view) {
        Intent intent = new Intent(this, EstabelecimentoActivity.class);
        startActivity(intent);
    }

    public void abrirCompra(View view) {
        Intent intent = new Intent(this, CompraActivity.class);
        startActivity(intent);
    }
}
