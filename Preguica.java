
package br.univali.cc.zoologico.dominio;


public class Preguica extends Animal implements Som {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("ZzZzZzzZZzZZ...");
    }
    
}
