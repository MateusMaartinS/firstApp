package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edTexto;
    private Button btMudarTexto;
    private TextView txTextoAlterado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTexto = findViewById(R.id.edTexto);
        btMudarTexto = findViewById(R.id.btMudarTexto);
        txTextoAlterado = findViewById(R.id.txTextoAlterado);

        btMudarTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mudarTexto();
            }
        });


    }

    private void mudarTexto() {
        String texto = edTexto.getText().toString();
        txTextoAlterado.setText(texto);
    }

}