package com.lucas.subjetiva.np1.usuarios;

public class Usuario {

    // Atributos principais do usuário
    public String nome;
    public String email;
    public int idade;

    // Construtor da classe usuário, onde o mesmo
    // recebe como parâmetros, os atributos definidos anteriormente
    public Usuario(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    // Metodo exibirUsuario()
    // o mesmo não recebe argumentos, já que os atributos serão definidos
    // diretamente no objeto instânciado na classe principal

    public void exibirDadosUsuario(){
        System.out.println("Usuário: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Idade: " + idade);
    }
    
}
