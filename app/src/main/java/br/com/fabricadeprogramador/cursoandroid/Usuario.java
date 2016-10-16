package br.com.fabricadeprogramador.cursoandroid;

import android.content.Intent;

/**
 * Created by Virmerson on 10/15/16.
 */
public class Usuario {

    private Integer id;
    private String nome;
    private Integer imagem;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getImagem() {
        return imagem;
    }

    public void setImagem(Integer imagem) {
        this.imagem = imagem;
    }
}
