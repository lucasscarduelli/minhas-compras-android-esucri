package br.com.esucri.minhascompras.controller;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import br.com.esucri.minhascompras.model.Produto;
import br.com.esucri.minhascompras.utils.BancoDeDados;

public class ProdutoController {

    private SQLiteDatabase intanciaDb;
    private BancoDeDados db;

    public ProdutoController(Context context) {
        db = new BancoDeDados(context);
    }

    public long create(final Produto produto) {
        ContentValues dados = new ContentValues();
        return 1;
    }

    public long update(final Produto produto) {
        return 1;
    }

    public Cursor retrieve() {
        return null;
    }

    public long delete(final Produto produto) {
        return 1;
    }

}
