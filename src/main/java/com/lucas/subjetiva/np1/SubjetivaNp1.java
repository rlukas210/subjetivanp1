package com.lucas.subjetiva.np1;

import com.lucas.subjetiva.np1.postagem.Postagem;
import com.lucas.subjetiva.np1.usuarios.Usuario;
import com.lucas.subjetiva.np1.usuarios.UsuarioPremium;

import java.util.Scanner;

public class SubjetivaNp1 {
    public static void main(String[] args) {
        //usado apenas para "estilizar" a saída no console
        String separador = "#############################################################";

        //Atributos que serão usados para ler a entrada do usuário
        String nomeUsuario;
        String emailUsuario;
        int idadeUsuario;
        String conteudo;

        //Instâncias das classes Usuario, UsuarioPremium e postagem, com valores predefinidos
        Usuario user1 = new Usuario("fulano de tal", "fulano@tal.com", 22);
        UsuarioPremium user2 = new UsuarioPremium(true, "Cicrano", "cicrano@email.com", 19);
        Postagem post = new Postagem("olá mundo", user1);


        //Chamando os métodos de cada objeto instânciado,
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

        //Aqui, o usuário pode escrever os dados livremente
        Scanner ler = new Scanner(System.in);

        System.out.println("criando usuário e postagem");

        System.out.println("digite o nome");
        nomeUsuario = ler.nextLine();

        System.out.println("digite o email");
        emailUsuario = ler.nextLine();

        System.out.println("digite o conteudo a ser postado");
        conteudo = ler.nextLine();

        System.out.println("digite a idade");
        idadeUsuario = ler.nextInt();

        System.out.println(separador);
        System.out.println("aguarde...");
        System.out.println("\n \n");

        //aqui, está sendo criado uma instância da classe Usuario e Postagem
        //baseada na entrada do usuário no console.

        Usuario novo = new Usuario(nomeUsuario, emailUsuario, idadeUsuario);
        Postagem novar = new Postagem(conteudo, novo);
        novar.exibirPostagem();

        UsuarioPremium user = new UsuarioPremium(false, "lucas", "lucas.com", 22);
        user.exibirDadosUsuario();
    }
}
