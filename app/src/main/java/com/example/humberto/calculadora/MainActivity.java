package com.example.humberto.calculadora;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText operacao;
    private TextView result, valorResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operacao = (EditText)findViewById(R.id.cpOperacao);
        valorResult = (TextView)findViewById(R.id.resultado);

    }

    public void calculaOperacao(View view){
        String resultadoFim = null;
      //  result.setText("");
        String vlOperacao = operacao.getText().toString();

        //System.out.println("Valor teste: " + vTeste + " Valor teste 2: " +vTeste2);

        try {

            String[] vl;
            vl = vlOperacao.split("[-+/*]");
            String vTeste = vl[0];
            String vTeste2 = vl[1];
            String vTeste3;

            if (vlOperacao.contains("+")) {
                Float vl1 = Float.parseFloat(vTeste);
                Float vl2 = Float.parseFloat(vTeste2);
                Float valorFim = vl1 + vl2;
                result.setText("Resultado: " + resultadoFim);

            } else if (vlOperacao.contains("-")) {
                Float fl = Float.parseFloat(vTeste);
                Float fl2 = Float.parseFloat(vTeste2);
                Float fl3 = fl - fl2;
                resultadoFim = String.valueOf(fl3);
                result.setText("Resultado: " + resultadoFim);

            } else if (vlOperacao.contains("*")) {
                Float multi1 = Float.parseFloat(vTeste);
                Float multi2 = Float.parseFloat(vTeste2);
                Float multiVl = multi1 * multi2;
                resultadoFim = String.valueOf(multiVl);
                result.setText("Resultado: " + resultadoFim);
            }
        }catch (Exception e){
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

    public void botao_ce (View view) {
        operacao.setText("");
        result.setText("Resultado: ");
    }

    public void botao_c(View view){
            String valorCampo = operacao.getText().toString();
            if(valorCampo.length()>=1){
                String newValorCampo = valorCampo.substring(0,valorCampo.length()-1);
                operacao.setText(newValorCampo);
            }

        }

}
