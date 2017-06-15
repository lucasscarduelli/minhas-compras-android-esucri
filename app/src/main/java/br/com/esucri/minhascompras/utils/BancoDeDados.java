package br.com.esucri.minhascompras.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BancoDeDados extends SQLiteOpenHelper {

    private static final String DB_NAME = "minhas_compras";
    private static final int DB_VERSION = 3;

    public BancoDeDados(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String createTableProduto =
                "CREATE TABLE produtos (" +
                        "_id integer primary key autoincrement," +
                        "descricao text not null," +
                        "marca text not null," +
                        "preco_base numeric not null" +
                ")";


        db.execSQL(createTableProduto);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        if (newVersion == 2) {
            migracaoVersao2(db);
        } else if (newVersion == 3) {
            migracaoVersao3(db);
        }

    }

    private void migracaoVersao2(SQLiteDatabase db) {
        String alterTable = "";
        db.execSQL(alterTable);
    }

    private void migracaoVersao3(SQLiteDatabase db) {
        String alterTable = "";
        db.execSQL(alterTable);

    }
}
