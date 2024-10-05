package com.lucas.subjetiva.np1.postagem;
import com.lucas.subjetiva.np1.usuarios.Usuario;

import java.time.LocalDate;

public class Postagem {

    //atributos, sendo usado também a classe LocalDate para obter o dia atual
    public String conteudo;
    public Usuario usuario;
    public LocalDate data = LocalDate.now();

    //construtor
    public Postagem(String conteudo, Usuario usuario) {
        this.conteudo = conteudo;
        this.usuario = usuario;
    }

    //metodo p/exibir a postagem
    public void exibirPostagem(){
        System.out.println("postagem realizada por: " +usuario.nome);
        System.out.println("Post: " + conteudo);
        System.out.println("Postado no dia: " + data);


    }
    
}
