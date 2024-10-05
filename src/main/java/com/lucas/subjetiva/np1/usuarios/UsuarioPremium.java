package com.lucas.subjetiva.np1.usuarios;

public class UsuarioPremium extends Usuario {
  // public boolean usuarioPremium;
    // Atributos adicionais para a classe UsuarioPremium
    // Esta classe, está herdando os atributos declarados na classe Usuario
    public boolean isDestacado;

    private String separador = "---------------------------";

    // Construtor, onde o mesmo usa o conceito de superclasse
    // e está herdando as características da classe Usuario
    // e também está declarando seus próprios atributos
    public UsuarioPremium(boolean isDestacado, String nome, String email, int idade) {
        super(nome, email, idade);
     //   this.usuarioPremium = usuarioPremium;
        this.isDestacado = isDestacado;

    }

    // Metodo exibirUsuario(), também presente
    // na superclasse Usuario
    // Usada para mostrar os atributos do usuário

    @Override
     public void exibirDadosUsuario(){
        System.out.println(separador);
        System.out.println("Informações do usuário:");
        if (isDestacado = true) {
            System.out.println("Usuário Premium: " + nome);
        } else {
            System.out.println("Usuário: " + nome);
        }
        System.out.println("Email: " + email);
        System.out.println("Idade: " + idade);
}
     
}
