package br.com.fabricadeprogramador.cursoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button b =  (Button) findViewById(R.id.btnCalc);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Acessando as referencias aos numeros
                EditText edNum1 = (EditText) findViewById(R.id.edNumero1);
                EditText edNum2 = (EditText) findViewById(R.id.edNumero2);

               //String com os dados
                String strN1 = edNum1.getText().toString() ;
                String strN2 = edNum2.getText().toString();

                //Verificando se o texto está vazio
                if (strN1.isEmpty() || strN2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Insira dados", Toast.LENGTH_LONG).show();
                }else {

                    //Faz o calculo
                    //Numeros no formato double
                    Double n1 = new Double(strN1);
                    Double n2 = new Double(strN2);

                    Double soma = n1 + n2;

                    Toast.makeText(MainActivity.this, "A soma é:" + soma, Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
