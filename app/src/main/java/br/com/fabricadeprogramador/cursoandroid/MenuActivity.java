package br.com.fabricadeprogramador.cursoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

/**
 * Created by Virmerson on 9/24/16.
 */
public class MenuActivity extends AppCompatActivity {

    private static final String TAG = "MENU";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "Chamou On Create...");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        //Cammel Case
        Button btnCiclo =  (Button) findViewById(R.id.btn_ciclo);

        btnCiclo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Carregar uma nova tela
                Intent irParaCiclo = new Intent(MenuActivity.this, CicloDeVidaActivity.class);
                startActivity(irParaCiclo);

            }
        });


        Button btnCalc =  (Button) findViewById(R.id.btn_calc);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irParaCalc = new Intent(MenuActivity.this, CalculadoraActivity.class);
                startActivity(irParaCalc);
            }
        });


    }

    @Override
    protected void onStart() {
        Log.i(TAG, "Chamou On Start...");
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "Chamou On Destroy...");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "Chamou On Pause...");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.i(TAG, "Chamou On Resume...");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.i(TAG, "Chamou On Stop...");
        super.onStop();
    }
}
