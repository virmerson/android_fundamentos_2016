package br.com.fabricadeprogramador.cursoandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Virmerson on 10/1/16.
 */
public class CicloDeVidaActivity  extends AppCompatActivity{


    private static final String TAG = "CicloDeVidaActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ciclodevida);
        Log.i(TAG, "onCreate...");

    }
}
