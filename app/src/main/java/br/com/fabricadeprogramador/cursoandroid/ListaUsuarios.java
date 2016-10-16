package br.com.fabricadeprogramador.cursoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ListaUsuarios extends AppCompatActivity {

    @Bind(R.layout.activity_lista_usuarios)
    ListView list;


    List<Usuario> listaUsuarios = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_usuarios);
        ButterKnife.bind(this);
        criarUsuarios();
    }

    public void criarUsuarios(){
        if (listaUsuarios.isEmpty()){

            Usuario u1 =  new Usuario();
            u1.setId(1);
            u1.setNome("Virmerson");
            u1.setImagem(R.drawable.virmerson);


            Usuario u2 =  new Usuario();
            u2.setId(2);
            u2.setNome("Maria");
            u2.setImagem(R.drawable.maria);

            listaUsuarios.add(u1);
            listaUsuarios.add(u2);

        }

    }
}
