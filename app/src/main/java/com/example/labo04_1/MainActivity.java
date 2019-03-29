package com.example.labo04_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.concurrent.atomic.AtomicInteger;

public class MainActivity extends AppCompatActivity {

    TextView mProducto1, mProducto2, mProducto3, mProducto4, mProducto5, mProducto6, mProducto7, mProducto8, mProducto9;
    LinearLayout mlProducto1, mlProducto2, mlProducto3, mlProducto4, mlProducto5, mlProducto6, mlProducto7, mlProducto8, mlProducto9;
    Button mButton;
    EditText mUsuario;
    EditText mCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProducto1 = findViewById(R.id.tv_producto1);
        mProducto2 = findViewById(R.id.tv_producto2);
        mProducto3 = findViewById(R.id.tv_producto3);
        mProducto4 = findViewById(R.id.tv_producto4);
        mProducto5 = findViewById(R.id.tv_producto5);
        mProducto6 = findViewById(R.id.tv_producto6);
        mProducto7 = findViewById(R.id.tv_producto7);
        mProducto8 = findViewById(R.id.tv_producto8);
        mProducto9 = findViewById(R.id.tv_producto9);

        mlProducto1 = findViewById(R.id.ll_producto1);
        mlProducto2 = findViewById(R.id.ll_producto2);
        mlProducto3 = findViewById(R.id.ll_producto3);
        mlProducto4 = findViewById(R.id.ll_producto4);
        mlProducto5 = findViewById(R.id.ll_producto5);
        mlProducto6 = findViewById(R.id.ll_producto6);
        mlProducto7 = findViewById(R.id.ll_producto7);
        mlProducto8 = findViewById(R.id.ll_producto8);
        mlProducto9 = findViewById(R.id.ll_producto9);

        mButton = findViewById(R.id.btn_enviar);

        mCorreo = findViewById(R.id.correo);
        mUsuario = findViewById(R.id.usuario);

        AtomicInteger total = new AtomicInteger();
        AtomicInteger cont1 = new AtomicInteger();
        AtomicInteger cont2 = new AtomicInteger();
        AtomicInteger cont3 = new AtomicInteger();
        AtomicInteger cont4 = new AtomicInteger();
        AtomicInteger cont5 = new AtomicInteger();
        AtomicInteger cont6 = new AtomicInteger();
        AtomicInteger cont7 = new AtomicInteger();
        AtomicInteger cont8 = new AtomicInteger();
        AtomicInteger cont9 = new AtomicInteger();

        mlProducto1.setOnClickListener(v -> {
            cont1.set(Integer.parseInt(mProducto1.getText().toString()) + 1);
            mProducto1.setText(String.valueOf(cont1));
            total.set(total.get() +1);
            Log.d("Hi", String.valueOf(total.get()));
        });

        mlProducto2.setOnClickListener(v -> {
            cont2.set(Integer.parseInt(mProducto2.getText().toString()) + 1);
            mProducto2.setText(String.valueOf(cont2));
            total.set(total.get() +1);
        });

        mlProducto3.setOnClickListener(v -> {
            cont3.set(Integer.parseInt(mProducto3.getText().toString()) + 1);
            mProducto3.setText(String.valueOf(cont3));
            total.set(total.get() +1);
        });

        mlProducto4.setOnClickListener(v -> {
            cont4.set(Integer.parseInt(mProducto4.getText().toString()) + 1);
            mProducto4.setText(String.valueOf(cont4));
            total.set(total.get() +1);
        });

        mlProducto5.setOnClickListener(v -> {
            cont5.set(Integer.parseInt(mProducto5.getText().toString()) + 1);
            mProducto5.setText(String.valueOf(cont5));
            total.set(total.get() +1);
        });

        mlProducto6.setOnClickListener(v -> {
            cont6.set(Integer.parseInt(mProducto6.getText().toString()) + 1);
            mProducto6.setText(String.valueOf(cont6));
            total.set(total.get() +1);
        });

        mlProducto7.setOnClickListener(v -> {
            cont7.set(Integer.parseInt(mProducto7.getText().toString()) + 1);
            mProducto7.setText(String.valueOf(cont7));
            total.set(total.get() +1);
        });

        mlProducto8.setOnClickListener(v -> {
            cont8.set(Integer.parseInt(mProducto8.getText().toString()) + 1);
            mProducto8.setText(String.valueOf(cont8));
            total.set(total.get() +1);
        });

        mlProducto9.setOnClickListener(v -> {
            cont9.set(Integer.parseInt(mProducto9.getText().toString()) + 1);
            mProducto9.setText(String.valueOf(cont9));
            total.set(total.get() +1);
        });

        mButton.setOnClickListener(v -> {
            Intent mIntent = new Intent(this, factura.class);
            mIntent.putExtra("producto1", String.valueOf(cont1.get()));
            mIntent.putExtra("producto2", String.valueOf(cont2.get()));
            mIntent.putExtra("producto3", String.valueOf(cont3.get()));
            mIntent.putExtra("producto4", String.valueOf(cont4.get()));
            mIntent.putExtra("producto5", String.valueOf(cont5.get()));
            mIntent.putExtra("producto6", String.valueOf(cont6.get()));
            mIntent.putExtra("producto7", String.valueOf(cont7.get()));
            mIntent.putExtra("producto8", String.valueOf(cont8.get()));
            mIntent.putExtra("producto9", String.valueOf(cont9.get()));
            mIntent.putExtra("usuario", mUsuario.getText().toString());
            mIntent.putExtra("correo", mCorreo.getText().toString());
            mIntent.putExtra("total", String.valueOf(total.get()));
            startActivity(mIntent);
        });

    }
}
