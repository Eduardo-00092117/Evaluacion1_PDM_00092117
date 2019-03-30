package com.example.labo04_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class factura extends AppCompatActivity {

    TextView mProducto1, mProducto2, mProducto3, mProducto4, mProducto5, mProducto6, mProducto7, mProducto8, mProducto9;
    TextView mUsuario, mCorreo, mTotal;
    Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);

        mProducto1 = findViewById(R.id.tv_producto1);
        mProducto2 = findViewById(R.id.tv_producto2);
        mProducto3 = findViewById(R.id.tv_producto3);
        mProducto4 = findViewById(R.id.tv_producto4);
        mProducto5 = findViewById(R.id.tv_producto5);
        mProducto6 = findViewById(R.id.tv_producto6);
        mProducto7 = findViewById(R.id.tv_producto7);
        mProducto8 = findViewById(R.id.tv_producto8);
        mProducto9 = findViewById(R.id.tv_producto9);

        Intent mIntent = getIntent();
        String dato = mIntent.getStringExtra("producto1");
        mProducto1.setText(mIntent.getStringExtra("producto1"));
        mProducto2.setText(mIntent.getStringExtra("producto2"));
        mProducto3.setText(mIntent.getStringExtra("producto3"));
        mProducto4.setText(mIntent.getStringExtra("producto4"));
        mProducto5.setText(mIntent.getStringExtra("producto5"));
        mProducto6.setText(mIntent.getStringExtra("producto6"));
        mProducto7.setText(mIntent.getStringExtra("producto7"));
        mProducto8.setText(mIntent.getStringExtra("producto8"));
        mProducto9.setText(mIntent.getStringExtra("producto9"));

        mUsuario = findViewById(R.id.usuario);
        mCorreo = findViewById(R.id.correo);
        mTotal = findViewById(R.id.total);

        btn_send = findViewById(R.id.btn_send);

        mUsuario.setText("Usuario: " + mIntent.getStringExtra("usuario"));
        mTotal.setText("Total de compras: "+mIntent.getStringExtra("total"));
        mCorreo.setText("Correo: " + mIntent.getStringExtra("correo"));

        String datos = mUsuario.getText().toString() + "\n" + mCorreo.getText().toString()
                + "\n" + mTotal.getText().toString();

        btn_send.setOnClickListener(v -> {
            Intent mIntent2 = new Intent();
            mIntent2.setAction(Intent.ACTION_SEND);
            mIntent2.setType("text/plain");
            mIntent2.putExtra(Intent.EXTRA_TEXT, datos);
            startActivity(mIntent2);
        });

    }
}
