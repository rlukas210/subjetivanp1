package com.lucas.subjetiva.np1;

import com.lucas.subjetiva.np1.postagem.Postagem;
import com.lucas.subjetiva.np1.usuarios.Usuario;
import com.lucas.subjetiva.np1.usuarios.UsuarioPremium;

import java.util.Scanner;

public class SubjetivaNp1 {
    public static void main(String[] args) {
        String separador = "#############################################################";

        String nomeUsuario;
        String emailUsuario;
        int idadeUsuario;
        String conteudo;

        Usuario user1 = new Usuario("fulano de tal", "fulano@tal.com", 22);
        UsuarioPremium user2 = new UsuarioPremium(true, "Cicrano", "cicrano@email.com", 19);
        Postagem post = new Postagem("olá mundo", user1);

        System.out.println(separador);
        user1.exibirDadosUsuario();
        System.out.println(separador);
        user2.exibirDadosUsuario();
        System.out.println(separador);
        System.out.println("\n \n");
        System.out.println(separador);
        post.exibirPostagem();
        System.out.println(separador);
        post.exibirPostagem();

        Scanner ler = new Scanner(System.in);
        System.out.println("digite o conteudo a ser postado");
        conteudo = ler.nextLine();
        System.out.println("criando usuário e postagem");
        System.out.println("digite o nome");
        nomeUsuario = ler.nextLine();
        System.out.println("digite o email");
        emailUsuario = ler.nextLine();
        System.out.println("digite a idade");
        idadeUsuario = ler.nextInt();
        System.out.println("aguarde...");
        Usuario novo = new Usuario(nomeUsuario, emailUsuario, idadeUsuario);
        Postagem novar = new Postagem(conteudo, novo);
        novar.exibirPostagem();

        UsuarioPremium user = new UsuarioPremium(false, "lucas", "lucas.com", 22);
        user.exibirDadosUsuario();
    }
}
