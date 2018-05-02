package com.example.humberto.calculadora;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result, valorResult, operacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operacao = findViewById(R.id.cpOperacao);
        valorResult = findViewById(R.id.vlResultado);
    }

    //Implementação do cálculo das operações.
    public void calculaOperacao(View view) {
        String resultadoFim = null;
        String vlOperacao = operacao.getText().toString();

        try {

            String[] vl;
            vl = vlOperacao.split("[-+/*√¯^]");
            String vTeste = vl[0];
            String vTeste2 = null;
            String vTeste3 = null;

            if(vl.length > 1){
             vTeste2 = vl[1];
            }

            if (vlOperacao.contains("+")) {
                Double vl1 = Double.parseDouble(vTeste);
                Double vl2 = Double.parseDouble(vTeste2);
                Double valorFim = vl1 + vl2;

                resultadoFim = String.valueOf(valorFim);
                valorResult.setText(resultadoFim);

            } else if (vlOperacao.contains("-")) {
                Double fl = Double.parseDouble(vTeste);
                Double fl2 = Double.parseDouble(vTeste2);
                Double fl3 = fl - fl2;
                resultadoFim = String.valueOf(fl3);
                valorResult.setText(resultadoFim);

            } else if (vlOperacao.contains("*")) {
                Double multi1 = Double.parseDouble(vTeste);
                Double multi2 = Double.parseDouble(vTeste2);
                Double multiVl = multi1 * multi2;
                resultadoFim = String.valueOf(multiVl);
                valorResult.setText(resultadoFim);

            } else if (vlOperacao.contains("/")) {
                Double div1 = Double.parseDouble(vTeste);
                Double div2 = Double.parseDouble(vTeste2);
                Double divResult = div1 / div2;
                resultadoFim = String.valueOf(divResult);
                valorResult.setText(resultadoFim);

            } else if (vlOperacao.contains("√¯")) {
                Double raiz = Double.parseDouble(vTeste);
                Double vlRaiz = Math.sqrt(raiz);
                resultadoFim = String.valueOf(vlRaiz);
                valorResult.setText(resultadoFim);

            }else if(vlOperacao.contains("^")){
                double v1 = Integer.parseInt(vTeste);
                double v2 = Integer.parseInt(vTeste2);
                double valorPt= Math.pow(v1, v2);
                resultadoFim = String.valueOf(valorPt);
                valorResult.setText(resultadoFim);
            }

        } catch (Exception e) {
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle("Aviso!");
            dlg.setMessage("Operação inválida, tente novamente!");
            dlg.show();
        }
    }

    //Implementação das ações dos botões!
    public void botao_zero (View view){operacao.setText(operacao.getText().toString() + "0");}

    public  void botao_pt (View view){
        operacao.setText(operacao.getText().toString() + ".");
    }

    public void botao_um(View view) {
        operacao.setText(operacao.getText().toString() + "1");
    }

    public void botao_dois(View view) {
        operacao.setText(operacao.getText().toString() + "2");
    }

    public void botao_tres(View view) {
        operacao.setText(operacao.getText().toString() + "3");
    }

    public void botao_quatro(View view) {
        operacao.setText(operacao.getText().toString() + "4");
    }

    public void botao_cinco(View view) {
        operacao.setText(operacao.getText().toString() + "5");
    }

    public void botao_seis(View view) {
        operacao.setText(operacao.getText().toString() + "6");
    }

    public void botao_sete(View view) {
        operacao.setText(operacao.getText().toString() + "7");
    }

    public void botao_oito(View view) {
        operacao.setText(operacao.getText().toString() + "8");
    }

    public void botao_nove(View view) {
        operacao.setText(operacao.getText().toString() + "9");
    }

    public void botao_soma(View view) {
        operacao.setText(operacao.getText().toString() + "+");
    }

    public void botao_sub(View view){ operacao.setText(operacao.getText().toString() + "-");}

    public void botao_multi(View view){operacao.setText(operacao.getText().toString() + "*");}

    public  void botao_div(View view){operacao.setText(operacao.getText().toString() + "/");}

    public void botao_raiz(View view){operacao.setText(operacao.getText().toString() + "√¯");}

    public  void botao_exp(View view){operacao.setText(operacao.getText().toString() + "^");}

    public void botao_ce (View view) {
        operacao.setText("");
        valorResult.setText("");
    }

    public void botao_c(View view){
            String valorCampo = operacao.getText().toString();
            if(valorCampo.length()>=1){
                String newValorCampo = valorCampo.substring(0,valorCampo.length()-1);
                operacao.setText(newValorCampo);
            }
        }
}
