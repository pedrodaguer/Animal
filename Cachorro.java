package br.univali.cc.zoologico.dominio;


public class Cachorro extends Animal implements Corredor, Som{

    public Cachorro(String nome, int idade){
        super(nome, idade);
    }
    
    @Override
    public void correr() {
        System.out.println("Woof!");
    }

    @Override
    public void emitirSom() {
        System.out.println("AU AU AU");
    }
    
    
    
}
