package br.com.fabricadeprogramador.cursoandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Virmerson on 9/24/16.
 */
public class MenuActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        //Cammel Case
        Button btnCiclo =  (Button) findViewById(R.id.btn_ciclo);

        btnCiclo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Carregar uma nova tela
            }
        });



        //Cammel Case
        Button btnCalc =  (Button) findViewById(R.id.btn_calc);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Carregar uma nova tela
            }
        });




    }
}
