package br.univali.cc.zoologico.dominio;


public class Animal {
    
    String nome;

    public String getNome() {
        return nome;
    }
    int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void emitirSom() {
    }
    
}
