package com.example.humberto.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText operacao;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operacao = (EditText)findViewById(R.id.cpOperacao);
        result = (TextView)findViewById(R.id.resultado);

    }

    public void calculaOperacao(View view){
        String vlOperacao = operacao.getText().toString();
        float valor = Float.parseFloat(vlOperacao);


    }

    public void botao_zero (View view){

        operacao.setText(operacao.getText().toString() + "0");
    }

    public  void botao_pt (View view){
        operacao.setText(operacao.getText().toString() + ".");
    }

    public void botao_um(View view) {
        operacao.setText(operacao.getText().toString() + "1");
    }
}
