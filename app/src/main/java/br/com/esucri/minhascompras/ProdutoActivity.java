package br.com.esucri.minhascompras;

<<<<<<< HEAD
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ProdutoActivity extends AppCompatActivity {

    EditText editUnidadeMedida;

=======
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ProdutoActivity extends AppCompatActivity {

>>>>>>> 655521d344dc2a25a4238ef8354148c075a1adbe
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);
<<<<<<< HEAD

        editUnidadeMedida = (EditText) findViewById(R.id.edit_unidade_medida);
    }

    public void excluir(View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.titulo_confirmacao_exclusao);
        builder.setMessage(R.string.mensagem_confirmacao_exclusao);

        builder.setPositiveButton(R.string.botao_confirmar, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        builder.setNeutralButton("Neutro", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }

    public void selecionarUnidadeMedida(View view) {

        final Resources resources = getResources();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Selecione a unidade de medida");
        builder.setItems(R.array.unidades_medida, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String[] unidadesMedida = resources.getStringArray(R.array.unidades_medida);
                String unidadeMedida = unidadesMedida[which];
                editUnidadeMedida.setText(unidadeMedida);
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }

    public void salvar(View view) {

        Resources resources = getResources();
        CharSequence mensagem = resources.getText(R.string.mensagem_salvo_sucesso);
        Context context = getApplicationContext();

        Toast.makeText(context, mensagem, Toast.LENGTH_LONG ).show();


    }

=======
    }
>>>>>>> 655521d344dc2a25a4238ef8354148c075a1adbe
}
